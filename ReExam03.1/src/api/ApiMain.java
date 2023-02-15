package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class ApiMain {

	public static void main(String[] args) {

		try {
			
			String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1154551000";
			
			URL url = new URL(apiURL);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			
			con.setRequestProperty("Content-Type", "application/xml");
			
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			con.disconnect();
			
			// 응답 데이터(xml) 확인
			
			// 응답데이터를(xml)를 JSON데이터로 변환
			JSONObject obj = XML.toJSONObject(sb.toString());
			System.out.println(obj);
			
			// pubDate 조회
			String pubDate = obj.getJSONObject("rss")
								.getJSONObject("channel")
								.getString("pubDate");
			System.out.println(pubDate);
			
			// category 조회
			String category = obj.getJSONObject("rss")
								 .getJSONObject("channel")
								 .getJSONObject("item")
								 .getString("category");
			System.out.println(category );
			
			// data 속성에 저장된 날씨 배열 가져오기
			JSONArray dataList = obj.getJSONObject("rss")
									.getJSONObject("channel")
									.getJSONObject("item")
									.getJSONObject("description")
									.getJSONObject("body")
									.getJSONArray("data");
			
			List<Weather> list = new ArrayList<Weather>();
			
			for(int i = 0; i < dataList.length(); i++) {
				JSONObject data = dataList.getJSONObject(i);	// 하나 하나가 객체로 되어있어서
				int temp = data.getInt("temp");
				String wfKor = data.getString("wfKor");
				int hour = data.getInt("hour");
				
				
				Weather weather = new Weather();
				weather.setTemp(temp);
				weather.setHour(hour);
				weather.setwfKor(wfKor);
				list.add(weather);
				
				
			}
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("weather.txt"));
			//결과 파일 만들기
			writer.write(category + "\n"); 
			writer.write(pubDate + "\n"); 
			for (int i = 0; i < list.size(); i++) {
				writer.write(list.get(i) +"\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 서술형 DTO 
	}

}
