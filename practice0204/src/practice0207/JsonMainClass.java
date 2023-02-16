package practice0207;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonMainClass {
	
public static void ex01() {
		
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
			
			
			JSONArray items = new JSONObject(sb.toString())
					.getJSONObject("response")
					.getJSONObject("body")
					.getJSONArray("items");
			
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
	ex01();
 }
}
