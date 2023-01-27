package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class MainClass {

	// 문제 1. 현재 시간을 이용하여 디렉터리 생성
	
	public static void ex01() {
		/*
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond(); */
		
		Calendar now = Calendar.getInstance();
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String sep = File.separator;
		
		File dir = new File("C:" + sep + hour24 + sep + minute + sep +second);
		
		if (dir.exists() == false) {
			dir.mkdirs();
			System.out.println("파일 생성");
		} else {
			dir.deleteOnExit();
		}
	}
	
	
	public static void ex02() {
		
		// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
		/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
		*/
		
		LocalDateTime now = LocalDateTime.now();		
		
		//String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm ");
		String strNow = dtf.format(now);
		
		File dir = new File("C:" + File.separator + "Program Files" + File.separator + "Java" + File.separator + "jdk-11.0.17");
		File[] files = dir.listFiles();
		String directory = "";
		int n = 0;
		long totalFileSize = 0;
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isDirectory() == true) {
				
				System.out.println(strNow + " " + "<DIR>    " +files[i].getName());
			} else {
				System.out.println(strNow + "  " +files[i].length() + " " + files[i].getName());
				n++;
				totalFileSize += files[i].length();
			}
			
		}
		System.out.println("              "+ n + "개 파일      " + totalFileSize + " 바이트");
	}
	
	public static void ex03() {
		
		// 문제3. C:\storage 디렉터리를 삭제하시오.
		// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다.
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File("C:" + File.separator + "storage", "myfile.txt");
		if(file.exists()) {	// 파일 먼저
			file.delete();
		}
		if(dir.exists()) {	// 그 다음 디렉터리 
			dir.delete();
		}
		
	}
	
	// 문제4. 사용자로부터 입력 받은 문자열을 C:\storage\diary.txt 파일로 보내시오
	// 총 5개 문장을 입력받아서 보내시오
	
	public static void ex04() {
		
		Scanner sc = new Scanner(System.in);
		String[] dia = new String[5];
		System.out.println("5문장을 입력하세요.");
		for(int i = 0; i < dia.length; i++) {
			dia[i]= sc.nextLine();
		}
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "diary.txt");
		
		try (PrintWriter out = new PrintWriter(file)){
			for(int i = 0; i < dia.length; i++) {
				out.println(dia[i]);
			}
			System.out.println("diary.txt 파일 생성");
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	// 문제5. 에외가 발생한 경우 예외 메세지와 예외 발생시간을 저장한  C:\storage\log.txt
	public static void ex05() {
		
		try {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번쨰 정수를 입력하세요 >>>");
		int number1 = sc.nextInt(); 
		
		System.out.println("두 번쨰 정수를 입력하세요 >>>");
		int number2 = sc.nextInt(); 
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		
		System.out.println(number1 + "+" + number2 + "=" + add);
		System.out.println(number1 + "-" + number2 + "=" + sub);
		System.out.println(number1 + "*" + number2 + "=" + mul);
		System.out.println(number1 + "/" + number2 + "=" + div);
		
		sc.close();
	  } catch(Exception e) {
			// 날짜
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String dateTime = dtf.format(now);
			
			// 예외 클래스 이름
			String className = e.getClass().getName();
			
			// 예외 메세지
			String message = e.getMessage();
			
			// 로그 파일 만들기
			File dir = new File("C:" + File.separator + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "log.txt");
			
			// 생성 모드(언제나 새로 만든다)    new FileWriter(file)
			// 추가 모드(기존 내용에 추가한다)  new FileWriter(file, true)
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
				bw.write(dateTime + " " + className + " " + message + "\n");
				// bw.newLine();  \n을 대신할 수 있는 코드
				
				System.out.println("예외 메세지가 log.txt 파일에 기록 되었다.");
			}catch(IOException e2) {
				e2.printStackTrace();
			}
			
	 }
 }
	// 문제6. C:\storage\diary.txt 파일을 C:\storage\diary.txt 파일로 이동하시오
	public static void ex06()  {
		
		
		
		try {
			
			File fileOri = new File("C:" + File.separator + "storage", "diary.txt");
			BufferedReader br = null;
			StringBuilder sb = new StringBuilder();
			
			File dir = new File("C:" + File.separator + "storage2");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			
			File file2 = new File(dir, "diary.txt");
			
			br = new BufferedReader(new FileReader(fileOri));
			
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
	}
	
	public static void main(String[] args) {	// main 메소드 호출하는 곳으로 예외 처리를 넘긴다. (개발자가 try - catch 하지 않겠다) 3

		ex06();
		
	}

}
