package ch15;

import java.util.HashMap;

public class 맵 {
	public static void main(String[] args) {
		// Map은 모든 데이터를 입력할 수 있도록 설계
		// 넣을 당시의 데이터 종류를 꺼낼 때 구분할 수 없음
		HashMap m = new HashMap();
		m.put("제조사", "ASUS");
		m.put("CPU", "I7");
		m.put("RAM", "32");
		m.put("SSD", 256);
		
		// 자식형태로 변경 후 사용, 다운캐스팅
		String 제조사 = (String)m.get("제조사");
		int SSD = (int) m.get("SSD");
		
		System.out.println(제조사);
		System.out.println(SSD);
	}

}
