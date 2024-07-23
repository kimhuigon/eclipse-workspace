package db;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JdbcRead3 {

	public static void main(String[] args) {
//		고객Dao dao = new 고객Dao();
//		dao.insert("adcd", "홍길동", 30, "vip", "개발자", 1000);
		
		System.out.println("검색어를 입력하세요");
		Scanner s = new Scanner(System.in);
		
		String 검색어 = s.next();
		
		고객Dao dao = new 고객Dao();
		List<Map<String, Object>> list = dao.select(검색어);
		System.out.println(list);
	
	}
}
