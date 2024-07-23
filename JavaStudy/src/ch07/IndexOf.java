package ch07;

public class IndexOf {
	public static void main(String[] args) {
		//			  012345678901234567890123456789012345678
		String str = "Lorem ipsum dolor sit amet, ... aliqua.";
		int 찾은위치 = 0;
		while(true) {
			 찾은위치 = str.indexOf(" ", 찾은위치 + 1);
			 if( 찾은위치 == -1) {
				 break;
			 }
			 System.out.println(찾은위치);
		}
		/**int index = str.indexOf("ipsum");
		System.out.println(index);
		
		index = str.indexOf(" ");
		System.out.println(index);
//							지정 위치부터 찾기		
		index = str.indexOf(" ", 6);
		System.out.println(index);
		
		index = str.indexOf(" ", 12);
		System.out.println(index);
		
		index = str.indexOf(" ", index + 1);
		System.out.println(index);
		index = str.indexOf(" ", index + 1);
		System.out.println(index);
		index = str.indexOf(" ", index + 1);
		System.out.println(index);
		index = str.indexOf(" ", index + 1);
		System.out.println(index); */
	}

}
