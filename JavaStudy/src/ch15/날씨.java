package ch15;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class 날씨 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL(
				"https://api.openweathermap.org/data/2.5/weather?lat=35.1728639953646&lon=129.130680529903&units=metric&appid=6edee3c2aa182bc44d18ccb204c98a31");

		Map<String, Object> map = om.readValue(url, Map.class);
		List weather = (List) map.get("weather");
		Map w = (Map) weather.get(0);
		String main = (String) w.get("main");
		System.out.println(main);
		
		String name = (String) map.get("name");
		System.out.println(name);

	}
}
