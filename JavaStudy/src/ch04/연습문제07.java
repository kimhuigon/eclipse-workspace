package ch04;

import java.io.File;

public class 연습문제07 {
	public static void main(String[] args) {
		File file = new File("./src/ch04");
		File[] files = file.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName(); // 파일명 확인
			
			if(fileName.length() > 10) {
				continue;
			}
			
			System.out.println(fileName);
		}
	}

}
