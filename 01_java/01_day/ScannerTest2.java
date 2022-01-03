import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		// for: 반복횟수 예측가능, while: 반복횟수 예측이 힘들때, do~while
		
		// 무한루프 사용시에는 반드시 exit 할수 여지를 남긴다.
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름 입력하시오( 만약 중지하려면 Q/q 입력하시오.)");
			String name = scan.nextLine();
			System.out.println("이름:"+ name);
			/*
			 *   예외 클래스
			 *   1. 런타임 클래스
			 *     => 실행할 때 발생되는 예외
			 *     => NullPointerException, ArithmeticException, ArrayIndexOutofBoundsException,. ....
			 *     => 원래는 발생되면 안되는 예외들이다. 순수하게 개발자가 코드를 잘못 구현한 결과이다.
			 *        개발자가 if같은 조건문 이용해서 체크하면서 해결해야된다.
			 *   2. 비런타임 클래스
			 *     ==> 컴파일시 발생되는 예외
			 * 
			 */

//			  if(name.equalsIgnoreCase("Q"))break; // 만약에 name이 null이라면 NullPointerException이 발생된다.
			  if("Q".equalsIgnoreCase(name))break; //권장, NullPointerException이 발생안됨
			
		}
		System.out.println("프로그램 종료");
	}

}
