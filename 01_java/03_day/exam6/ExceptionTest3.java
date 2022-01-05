package exam6;

public class ExceptionTest3 {

	public static void main(String[] args) {

		System.out.println("1");
		
		try {
			// ArithmeticException 발생 코드
			int num = 2;
			int result = 10/num;
			System.out.println("결과값:"+ result);
			
			
			// NullPointerException 발생코드
			String name = null;
			System.out.println(name.length());
			
			// 실행문....
			
		}catch (ArithmeticException e) {  
			System.out.println("0으로 나누어 예외발생");		
			
		}catch(NullPointerException e) {
			System.out.println("name이 null값이어 예외발생");
			
		}catch(Exception e) { //관례적으로 가장 마지막에는 Exception으로 catch한다.
			System.out.println("예외발생");
		}
		System.out.println("end:정상종료");
		
	}

}
