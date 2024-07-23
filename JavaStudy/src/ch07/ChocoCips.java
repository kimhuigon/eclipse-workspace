package ch07;

public class ChocoCips {
	public static void main(String[] args) {
		String str = "안촉촉한 초코칩 나라에 살던 안촉촉한 초코칩이 촉촉한 초코칩 나라의 촉촉한 초코칩을 보고 촉촉한 초코칩이 되고 싶어서 촉촉한 초코칩 나라에 갔는데 촉촉한 초코칩 나라의 촉촉한 초코칩 문지기가 넌 촉촉한 초코칩이 아니고 안촉촉한 초코칩이니까 안촉촉한 초코칩나라에서 살아 라고해서 안촉촉한 초코칩은 촉촉한 초코칩이 되는 것을 포기하고 안촉촉한 초코칩 나라로 돌아갔다.";
//		System.out.println(str);
		int 찾은위치 = 0;
		int count = 0;
		while (true) {
			찾은위치 = str.indexOf("나라", 찾은위치 + 1);
			if (찾은위치 == -1) {
				break;
			}
			count += 1;			
			System.out.print(찾은위치 + " "+ "\n");
//			System.out.print(count + " ");
		}
	}

}
