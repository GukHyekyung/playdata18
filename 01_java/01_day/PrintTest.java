import java.util.Arrays;

public class PrintTest {

	public static void methodA(int n) {
		System.out.println(n);
	}
    // 가변인자 ==> 내부적으로 배열로 관리된다.
	public static void methodB(int ... n) {
		System.out.println(Arrays.toString(n));  // 배열의 값을 문자열로 출력
	}
	public static void main(String[] args) {
		methodA(10);
//		methodA(10,20);
		methodB(10,20);
		methodB(10,20,20,30,40);
		
		// 콘솔에 출력 (표준 출력)
		// 1. System.out.println(값)==> 개행출력
		System.out.println("A");
		System.out.println("B");
		System.out.println();
		// 2. System.out.print(값) ==> 개행없이 출력
		System.out.print("X");
		System.out.print("Y");
		// 3. System.out.printf("형식문자", 값,...) ==> 개행없이출력 + 포맷지정
		// PrintStream java.io.PrintStream.printf(String format, Object ... args)
		System.out.printf("이름:%s 나이:%d, 키:%f , 성별:%c", "홍길동", 10, 182.6F, '남');
	}

}
