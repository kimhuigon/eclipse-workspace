package ch07;

public class CharAt {
	public static void main(String[] args) {
		// 012345678901234567890
		char a = ' ';
		char b = '.';
		char d = '\'';
		System.out.printf("%s %s %s", (int) a, (int) b, (int) d + "\n");

		String str = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// 연산자 + 형 변환
			 if(c >= 'a' && c <= 'z') {
//			if (c != ' ' && c != '\'' && c != '.' && c != '(' && c != ')') {
				c = (char) (c + 2);
				if(c >= 'z') {
					c -= 26;
				}
			}

			System.out.print(c);
		}

	}

}
