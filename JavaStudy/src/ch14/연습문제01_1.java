package ch14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 연습문제01_1 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("data/소나기.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String text = "";
		while (true) {
			String data = null;
			try {
				data = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (data == null)
				break;
			text += data + "\n";
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(text);
	}
}
