package practice0204;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class practice {

	public static void ex01() {
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		
		InputStreamReader reader = null;
		FileWriter writer = null;
		HttpURLConnection con = null;
		
		File file = new File("C:" + File.separator + "storage2", "gdlmsFile.txt");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode =  con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new InputStreamReader(con.getInputStream());
			}else {
				reader = new InputStreamReader(con.getErrorStream());
			}
			
			writer = new FileWriter(file);
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[4];
			int readCount = 0;
			
			while((readCount = reader.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount);
			}
			writer.write(sb.toString());
			
			writer.close();
			reader.close();
			con.disconnect();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02() {
		
		// 1시간마다 갱신되는 전국 날씨 정보
		String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
		
		// storage sfc_web_map.xml로 다운 받기
		File file = new File("C:" + File.separator + "storage", "sfc_web_map.xml");
		
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			int responseCode = con.getResponseCode();
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				bis = new BufferedInputStream(con.getInputStream());
				bos = new BufferedOutputStream(new FileOutputStream(file));
				
				byte[] b = new byte[2];	// reader, writer는 int, String, char 가능하고 
										// input, output은 int, byte 가능하다.
				int readByte = 0;
				
				
				while((readByte = bis.read(b)) != -1) {
					bos.write(b);	// reader, writer는 문자를 받으니까 StringBuilder를 사용하고
									// input, output는 문자아니니까 StringBuilde 안쓴다
				}
			}
			bis.close();
			bos.close();
			con.disconnect();
			System.out.println("파일 생성 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
