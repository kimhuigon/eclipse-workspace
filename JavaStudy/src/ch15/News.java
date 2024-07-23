package ch15;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class News {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL("https://newsapi.org/v2/top-headlines?country=kr&apiKey=9f5baf7d9f3f42879a20d7d19d9886e4");
		
		HashMap<String, Object> map = om.readValue(url, HashMap.class);
		int totalResults = (int)map.get("totalResults");
		System.out.println(totalResults);
		
		List<Map<String, Object>> articles = (List<Map<String, Object>>)map.get("articles");
//		System.out.println(articles);
		
		for(int i = 0; i < articles.size(); i++) {
			Map<String, Object> m = articles.get(i);
			String title = (String)m.get("title");
			System.out.println(title);
		}
		
//		Map<String, String> title = (Map<String, String>)map.get("title");
//		System.out.println(title);
		
	}
}
