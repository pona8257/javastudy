package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class practice0202 {

	public static void ex01() {
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		BufferedReader bis = null;
		try {
			StringBuilder sb = new StringBuilder();
			bis = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			// 아래있는 file이 바이트 타입으로 있기때문에 인풋으로 읽어드리고
			// 그다음 다시 문자로 읽어야 하니까 인풋스트림리더로 다시형변환 해주고
			// 마지막으로는 속도를 빨리지기 위해 버퍼리더를 사용한다
			String line = null;
			while((line = bis.readLine()) != null){
				sb.append(line+"\n");
			}
			System.out.println(sb.toString()); 
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex02() { 
		// ex01.bin 파일을 storage2/ex01.txt로 보내기
		
		File out = new File("C:" + File.separator + "storage", "ex01.bin");
		
		File dir = new File("C:" + File.separator + "storage2");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File in = new File(dir, "ex01.txt");
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			
			
			String line = null;
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(out)));
			
			bw = new BufferedWriter(new FileWriter(in));
			
			while((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
			
			
			System.out.println(bw);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(bw != null) {
					bw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// write append는 write는 writer쓸때 append는 StringBuilder쓸때 합쳐줄 때
		
	}
	
	public static void main(String[] args) {
		ex02();
		
	}	
}
