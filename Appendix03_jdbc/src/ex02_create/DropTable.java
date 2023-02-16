package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DropTable {

	public static void main(String[] args) {
Connection con = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			con = DriverManager.getConnection(url, user, password);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("DROP TABLE MEMBER_TBL");
	
		
		String sql = sb.toString();
		
		PreparedStatement ps = null;
		
		try {
			
			ps = con.prepareStatement(sql);

			ps.execute();
			System.out.println("쿼리문이 실행되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			if(ps != null)ps.close();
			if(con != null)con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
