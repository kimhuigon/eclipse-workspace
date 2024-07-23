package ch06;

public class Main1 {
	public static void main(String[] args) {
		// 폴더가 여러개 존재(C:/java)
		// 모든 폴더를 대상으로 검색
		// z.exe 파일을 찾으면 모든 검색 정지
		
		boolean all = false;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 4) {
					all = true;
					break; // 모두 정지
				}
			}
			if(all) break; // 비교 후 탈출
		}
	}

}
 