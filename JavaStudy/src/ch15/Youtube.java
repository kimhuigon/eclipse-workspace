package ch15;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Youtube {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL(
				"https://www.googleapis.com/youtube/v3/search?key=AIzaSyDh6iWJUUbTzDfrki-eoXbGzfCDo4XbJqM&part=snippet&q=원피스");

		Map<String, Object> map = om.readValue(url, Map.class); // api에 { }로 시작시
		List items = (List) map.get("items"); // [ ]로 시작 시
		for(int i = 0; i < items.size(); i++) {
			Map item = (Map) items.get(i);
			Map snippet = (Map) item.get("snippet");
			String title = (String)snippet.get("title");
			System.out.println(title);
			
			Map thumbnails = (Map) snippet.get("thumbnails");
			Map de = (Map) thumbnails.get("default");
			String url2 = (String)de.get("url");
			System.out.println(url2);
			
			
		}
		

	}
}
