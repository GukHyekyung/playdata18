package exam6;

public class ExceptionTest2 {

	public static void main(String[] args) {

		System.out.println("1");
		
		try {
			int num = 0;
			int result = 10/num;
			System.out.println("결과값:"+ result);
		}catch (ArithmeticException e) {  // 정해진 예외클래스를 사용해야 된다. 권장
//		}catch (Exception e) {    // 다형성 가능, 권장 안함
			System.out.println("0으로 나누어 예외발생");		
			
		}
		System.out.println("end:정상종료");
		
	}

}
