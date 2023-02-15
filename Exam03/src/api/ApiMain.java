package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		
		
		try {
			
			// Api 주소
			String serviceKey = "l/CL7ud+rPyAXX5leg3cZ041yAVSwuBnYAh1DQeZVT7uShqVoQrj+aCEQTOuy01ujpEYcXDKepCQdE2IlFvWUw==";
			String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&searchYear=" + URLEncoder.encode("2021", "UTF-8");
			apiURL += "&siDo=" + URLEncoder.encode("1100", "UTF-8");
			apiURL += "&guGun=" + URLEncoder.encode("1125", "UTF-8");
			apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
			apiURL += "&numOfRows=" + URLEncoder.encode("10", "UTF-8");
			apiURL += "&pageNo=" + URLEncoder.encode("1", "UTF-8");

			
			
			// URL 객체 생성(Api주소의 형식 검증)
			URL url = new URL(apiURL);
			
			// Api주소 접속
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			// GET방식의 요청임을 처리
			con.setRequestMethod("GET");
			
			// 응답 데이터는 "json"임을 처리
			// 웹 상에서 주고 받는 데이터의 타입 : Content-Type
			con.setRequestProperty("Content-Type", "application/json");		// 내용이 UTF-8 처리 할 것이 없어도 안해도됨
			
			// 접속된 API로부터 데이터를 읽어 들일 입력 스트림 생성
			// 1.정상 스트림과 에러 스트림으로 구문해서 생성
			// 2. API입력 스트립은 오직 바이트 입력 스트림만 지원하므로 문자 입력 스트림으로 바꾸는 작업이 필요
			// 3. 속도 향상을 위해서 buffer가 있는 스트림을 생성
			BufferedReader reader = null;
			
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			// BufferedReader는 readLine 메소드를 지원한다
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			// 이제 API의 응답 데이터는 sb에 저장되어 있다.
			
			// API의 응답데이터를 분석하기 위해서 JSONObject로 변환한다
			// json 라이브러리 사용을 위해서 Build path 작업을 수행한다
			/*
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject items = obj.getJSONObject("items");
			JSONArray itemList = items.getJSONArray("item");*/	// items객체에서 item배열을 빼낸다
			
			JSONArray itemList = new JSONObject(sb.toString())
									.getJSONObject("items")
									.getJSONArray("item");	// item배열의 정보를 가지고 오기위해서
			
			
			List<Accident> list = new ArrayList<Accident>();
			
			for(int i = 0; i < itemList.length(); i++) {	 
				// 응답데이터에서 필요한 데이터를 분석(파싱)한다.
				JSONObject item = itemList.getJSONObject(i);		// item배열의 정보를 객체로 다시 만들어준다
				String occrrncDt = item.getString("occrrnc_dt");	//get을 통해 itemList에 데이터를 occrrncDt에 넣어준다.
				String occrrnsDayCd = item.getString("occrrnc_day_cd");
				int dthDnvCnt = item.getInt("dth_dnv_cnt");  
				int injpsnCnt = item.getInt("injpsn_cnt");				// 이 4개의 정보를 하나로 묶어서 보관하고 싶어서 bean이나 map을 사용한다. 두가지 만들어보기 꼭!!!!!!!!!
				
				// 응답 데이터에서 추출한 데이터를 하나의 객체(Bean)로 만든다.
				Accident accident = new Accident();
				accident.setOccrrncDt(occrrncDt);	// accident안에 있는 occrrncDt필드에 값을 넣어준다	                            // map으로 저장해보기
				accident.setOccrrncDayCd(occrrnsDayCd);
				accident.setDthDnyCnt(dthDnvCnt);
				accident.setInipsnCnt(injpsnCnt);	//9개의 사고일지가 나오기 때문에 arrayList 사용해서 저장한다
				// 객체를 ArrayList에 저장
				list.add(accident);	
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
