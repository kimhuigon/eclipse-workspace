package ch17;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jdbc1 {
	public static void main(String[] args) {
		EmpDao empDao = new EmpDao();
		List<Emp> list = empDao.select();
		System.out.println(list);
		
		ObjectMapper om = new ObjectMapper();
		try {
			String result = om.writeValueAsString(list);
			System.out.println(result);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
