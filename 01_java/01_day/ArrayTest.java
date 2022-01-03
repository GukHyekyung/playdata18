import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		//3. new + 리터널 이용 
		int [] n;
		n = new int[] {10,20,30};
		
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
