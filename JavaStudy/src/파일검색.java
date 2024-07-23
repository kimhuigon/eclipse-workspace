import java.io.File; // 도구 가져오기

// ctrl + alt + ↓ 행 복사
public class 파일검색 {
	public static void main(String[] args) {
		File f = new File("c:/java");
		String[] names = f.list();
		boolean stop = false;
		for (int i = 0; i < names.length; i++) { // names.length : 이름의 길이를 찾는 법
			System.out.println(names[i]);
			File f2 = new File("c:/java/" + names[i]);
			if (f2.isDirectory() == true) {
				String[] names2 = f2.list();
				for (int j = 0; j < names2.length; j++) {
					System.out.println("  -> " + names2[j]);
					if (names2[j].equals("eclipse.exe") == true ) { // 중괄호가 없으면 그 한 줄만 작동
						stop = true;
						break;
					}
				}
			}
			if (stop)
				break;
		}
	}

}
