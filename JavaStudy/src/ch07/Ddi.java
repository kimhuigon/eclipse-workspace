package ch07;
//			 jodiac : 별자리
public class Ddi {
	public static void main(String[] args) {
		String[] ddi = {
				"쥐-자", "소-축", "호랑이-인", "토끼-묘",
				"용-진", "뱀-사", "말-오", "양-미",
				"원숭이-신", "닭-유", "개-술", "돼지-해"
		};
		// 2020년 쥐
		int birth = 1924; // 돼지-해
		int diff = (2020 - birth) % 12; // 1
		int diff2 = (12 - diff) % 12; // 11
		System.out.println(ddi[diff2]);
	}

}
