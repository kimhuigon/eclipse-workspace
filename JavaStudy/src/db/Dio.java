package db;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dio {

	public static void main(String[] args) {

		while (true) { // 검색 나가기 전까지 종료 안 됨
			System.out.println("검색어를 입력하세요(exit를 입력하시면 종료됩니다)");
			Scanner s = new Scanner(System.in);

			String search = s.next();

			if (search.equals("exit")) {
				System.out.println("장비를 정지합니다");
				break;
			}

			DeptDao dao = new DeptDao();
			List<Map<String, Object>> list = dao.select(search);
			System.out.println(list);
		}

//		DeptDao dao = new DeptDao();
//		dao.insert(60, "KingPotato", "NothKorea"); // 입력한 값 데이터 베이스에 집어넣기
	}
}
