package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
			con.addRequestProperty("Content-Type", "application/xml");
			
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
			
			JSONObject obj = XML.toJSONObject(sb.toString());
			
			String pubDate = obj.getJSONObject("rss")
					.getJSONObject("channel")
					.getString("pubDate");
			
			String category = obj.getJSONObject("rss")
					 .getJSONObject("channel")
					 .getJSONObject("item")
					 .getString("category");
			
			JSONArray dataList = obj.getJSONObject("rss")
					.getJSONObject("channel")
					.getJSONObject("item")
					.getJSONObject("description")
					.getJSONObject("body")
					.getJSONArray("data");
			
			List<Weather> list = new ArrayList<Weather>();
			for(int i = 0; i < dataList.length(); i++) {
				JSONObject data = dataList.getJSONObject(i);
				int temp = data.getInt("temp");
				String wfKor = data.getString("wfKor");
				int hour = data.getInt("hour");
				
				Weather weather = new Weather();
				weather.setHour(hour);
				weather.setTemp(temp);
				weather.setWfKor(wfKor);
				list.add(weather);
			}
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("weather.txt"));
			writer.write(pubDate + "\n");
			writer.write(category + "\n");
			for(int i = 0; i < list.size(); i++) {
				writer.write(list.get(i) + "\n");
			}
			writer.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
