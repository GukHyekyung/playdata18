import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {

		//int n2 = 10; // 기본형
		//1. new 이용 ==> 참조형 때문에
		int [] n;
		n = new int[3];  // n 변수? 로컬변수,참조형
		System.out.println(Arrays.toString(n));
		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		System.out.println(Arrays.toString(n));
		
		//반복문
		for (int i = 0; i < n.length; i++) {
			System.out.println(">>"+ n[i]);
		}
		
		//foreach문  (권장)
		for (int i : n) {
			System.out.println("**" + i);
		}
		
	}

}
