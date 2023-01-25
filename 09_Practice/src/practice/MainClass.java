package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

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
	
	public static void ex02() throws IOException{	// 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다. 2
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "myfile.txt");
		if(file.exists() == false) {
			file.createNewFile();	// 반드시 예외처리가 필요한 코드이다. 1
		} else {
			file.delete();
		}
	}
	
	public static void ex03() throws IOException{
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "myfile.txt");
		
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		// 파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath());	// 파일명 + 디렉터리명
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		long lastModified = file.lastModified();	// 최종 수정일의 타임 스템프 값
		System.out.println("최종 수정일 : " + lastModified);
		
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		System.out.println("최종 수정일 : " + lastModifiedDate);
		
		long size = file.length();	// 파일의 크기가 바이트 단위로 저장
		long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
		System.out.println("파일 크기 : " + kb + "KB");	// 킬로 바이트 출력(1024바이트 = 1킬로바이트)
		
	}
	
	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "Program Files");
		
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {
				System.out.println(files[i].getName());
			}
		}
		
	}
	public static void ex05() {
		
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
	
	public static void ex06() {
		
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
	
	public static void main(String[] args) throws IOException {	// main 메소드 호출하는 곳으로 예외 처리를 넘긴다. (개발자가 try - catch 하지 않겠다) 3

		ex06();
		
	}

}
