package ch07;

public class Split {
	public static void main(String[] args) {
		String s = "#광안리 #센텀 #삼겹살 #족발 #소주";
		String[] arr = s.split("#");
		for(int i = 0; i < arr.length; i++) {
			String item = arr[i];
			System.out.println(item.trim());
		}
	}
}
