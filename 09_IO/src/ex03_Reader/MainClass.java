package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	/*
 	Reader
 	1. 문자 기반의 입력 스트림이다.
	2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다.
	3. 문자를 읽어 들이는 스트림이다.(파일의 내용을 읽는다. 서버가 보낸 내용을 읽는다. 등등)
	
	- 글자단위로 하나씩 가져온다
	*/
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		FileReader fr = null;
		
		StringBuilder sb = new StringBuilder();
		
		try {
			fr = new FileReader(file);
			int c;	// 1글자를 저장할 변수
			while((c = fr.read()) != -1) {	// 무조건 외워!!!!c에 int값으로 저장한후 마지막 공백은 -1 로 저장되어서 그 전까지 실행하라고
				System.out.print((char)c);
				sb.append((char)c);
			
			}
			System.out.println();
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if( fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex02() {
		
		File dir = new File("C:" + File.separator +"storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex02.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			char[] cbuf = new char[5];	// 5글자를 일어 들이는 배열
			int readCount = 0;	// 실제로 읽은 글자의 개수
			StringBuilder sb = new StringBuilder();
			
			while((readCount = fr.read(cbuf)) != -1) {
				
				sb.append(cbuf, 0, readCount);	// 인덱스 0부터 readCount개 글자를 Sb에 추가
				
				// ex02.txt 읽는 과정
				// 루프(while)	readCount		cbuf
				// 1 	    	5				a b c d e 
				// 2			2				f g c d e(cbuf.length : 5이기 떄문에 fgcde로 나온다)
				// 3  			-1   			
				
				/*for(int i = 0; i < readCount; i++) {	// cbuf.length를 쓰지않은 이유는 위에 설명
					System.out.print(cbuf[i]);
				}*/
				
			}
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex03() {
		
		/*
		 	BufferedReader의 장점
		 	1. 속도가 빠르다
		 	2. readLine 메소드를 사용할 수 있다.
		 */
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		
		File file = new File(dir, "ex03.txt");
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(file)); // file(ex03.txt)를 읽는거
			
			String line = null;
			StringBuilder sb = new StringBuilder(); 	// 합치는거
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb.toString());
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ex03();
	}

}
