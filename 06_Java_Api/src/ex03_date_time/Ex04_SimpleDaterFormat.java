package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDaterFormat {

	/*
	 	형식 
	 	1. yy   : 년도 2자리 표현 ex) 23
	 	2. yyyy ; 년도 4자리 표현 Ex) 2023
	 	3. M    : 월 1자리
	 	4. MM   : 월 2자리
	 	5. MMM  : 지역에 맞는 월 표기 (잘 안씀)
	 	6. d    : 일
	 	7. dd   : 일 2자리
	 	8. E    : 요일 1자리  ex) 화
	 	9. a    : 오후
	 	10. h   : 시 1자리 (1 ~ 12)
	 	11. hh  : 시 2자리 (01 ~ 12)
	 	12. H   : 24시 기준으로 시 표시 (0 ~ 23)
	 	13. HH  : 24시 기준으로 시 2자리 표시 (00 ~ 23)
	 	14. m   : 분 1자리 (0 ~ 59)
	 	15. mm  : 분 2자리 (00 ~ 59)
	 	16. s   : 초 1자리 (0 ~ 59)
	 	17. ss  : 초 2자리 (00 ~ 59) 
	 */
	
	
	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
	}

}
