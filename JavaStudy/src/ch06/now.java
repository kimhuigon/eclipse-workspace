package ch06;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

public class now {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		
//		outer.run2();
		outer out = new outer();
		out.run2();
		
		Math.abs(0);
		
		File Fos = new File("");
		Fos.canRead();
		
		Scanner s = new Scanner(System.in);
		run();
		outer.run();
		
		System.out.println();
		Math.random();
	}
	static void run() {
		System.out.println("Now run");
	}

}