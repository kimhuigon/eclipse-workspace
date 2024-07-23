package ch15;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Movie {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL(
				"https://https://api.themoviedb.org/3/search/movie?api_key=cba95d401a14ab806ffc13a5052aab89&query=서울");

		Map<String, Object> map = om.readValue(url, Map.class); // api에 { }로 시작시
		List results = (List) map.get("results"); // [ ]로 시작 시
		for(int i = 0; i < results.size(); i++) {
			Map result = (Map) results.get(i);
			String title = (String)result.get("title");
			System.out.println(title);
		}
	}
}
