package ch14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 파일생성 {
	public static void main(String[] args) {
		//				상대경로 / 절대경로
		File f = new File("c:/java/java.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일에 내용을 쓰는 기능
		try {
			FileWriter w = new FileWriter("c:/java/java.txt");
			w.write("아무거나 내용 ABCD 1234");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
