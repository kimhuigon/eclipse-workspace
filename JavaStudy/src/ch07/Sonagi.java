package ch07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sonagi {
	public static void main(String[] args) throws IOException {
		/* 소나기.txt 문자열 읽어오기 */
		BufferedReader reader = new BufferedReader(new FileReader("data/소나기.txt"));
		String text = "";
		while (true) {
			String data = reader.readLine();
			if (data == null)
				break;
			text += data + "\n";
		}
		reader.close();

		int startIdx = 0;
		int endIdx = 0;
		while (true) {
			startIdx = text.indexOf("칡", startIdx + 1);
			if (startIdx == -1) break; // 본격 중괄호 권장 캠패인
			endIdx = text.indexOf(".", startIdx); // 이걸 못 하네ㅋㅋ
			String t = text.substring(startIdx, endIdx + 1); // 아래코드 간소화
			t = t.replace("\n", ""); // 띄어쓰기, 내려쓰기 공백 없애기
			System.out.println(t);
//			System.out.println(text.substring(startIdx, endIdx + 1));
		}
	}

}
