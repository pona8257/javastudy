package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;



public class JSONMainClass {

	public static void ex01() {
		
		String serviceKey = "l/CL7ud+rPyAXX5leg3cZ041yAVSwuBnYAh1DQeZVT7uShqVoQrj+aCEQTOuy01ujpEYcXDKepCQdE2IlFvWUw==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		URL url = null;
		HttpURLConnection con = null;
		BufferedWriter writer = null;
		BufferedReader reader = null;
		
		try {
			
			String sidoName = "서울";
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8"));
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
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
			
			System.out.println(sb.toString());
			System.out.println();
			/*
			{
				"response" :{
					
				}
			}
			*/
			
			JSONObject obj = new JSONObject(sb.toString());
			// obj3 == body
			JSONObject body = obj.getJSONObject("response").getJSONObject("body");	// 한번에
			JSONArray items = body.getJSONArray("items");
			/*
			JSONObject obj2 = obj.getJSONObject("response");
			JSONObject obj3 = obj2.getJSONObject("body");
			*/

			for(int i = 0; i < items.length(); i++) {
				JSONObject item =  items.getJSONObject(i); 	// 캐스팅 해야한다
				System.out.println((i + 1) + "----" + item);
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				System.out.println(stationName + " : 미세먼지 - " + pm10Value + ", 오존농도 - " + o3Value);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02() {
		
		String serviceKey = "l/CL7ud+rPyAXX5leg3cZ041yAVSwuBnYAh1DQeZVT7uShqVoQrj+aCEQTOuy01ujpEYcXDKepCQdE2IlFvWUw==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";

		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&searchDate=2023-01-30");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
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
			
			System.out.println(sb.toString());
			
			
			JSONArray items = new JSONObject(sb.toString()).getJSONObject("response").getJSONObject("body").getJSONArray("items");
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + ":" + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + ":" + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + ":" + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + ":" + item.getString("frcstFourCn"));
			}
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
