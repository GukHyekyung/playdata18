import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*
		 *   표준 입출력 ( Java I/O )
		 *   
		 *   1. 표준 출력
		 *      - 모니터의 콘솔에 출력
		 *       System.out.println(값)
		 *       System.out.print(값)
		 *       System.out.printf("형식문자", 값,...)
		 *       
		 *   2. 표준 입력
		 *      - 키보드로 입력 ==> System.in
		 *      
		 *      가. 복잡한데 성능 좋음
		 *       BufferedReader buffer =
		 *       new BufferedReader(new InputStreamReader(System.in));
		 *       buffer.readLine() ==> 한줄 읽기
		 *       
		 *      나. 간단한데 성능 나쁨
		 *       import java.util.Scanner;
		 *        Scanner scan = new Scanner(System.in);
		 *        
		 *        //문자열 읽기
		 *        String s = scan.next() 또는 scan.nextLine()
		 *        //숫자 읽기
		 *        int n = scan.nextInt()
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력하시오");
		String name = scan.nextLine();
		System.out.println("나이 입력하시오");
		int age = scan.nextInt();
		
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
	}

}
