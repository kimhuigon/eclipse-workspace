package ch04;

import java.io.File;

public class fileload {
	public static void main(String[] args) {
		File file = new File("C:/Windows/System32/drivers/etc");
		File[] files = file.listFiles();
		
		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i].getName());
//			System.out.println(files[i].length());
			
			if(files[i].length() >= 1000) {
				continue;
				
			}
			System.out.printf(files[i].getName() + " ");
			System.out.println(files[i].length());
			// 용량이 1000 미만 이라면
//			if(files[i].length() < 1000) {			}
		}
	}

}
