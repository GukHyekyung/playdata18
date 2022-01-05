package exam6;

// 2. throws 예외클래스 처리 방법
class Test2{
	public void a() throws ArithmeticException, NullPointerException {
		b();
	}
	public void b() throws ArithmeticException, NullPointerException{
		   // ArithmeticException 발생 코드
			int num = 0;
			int result = 10/num;
			System.out.println("결과값:"+ result);
			
			// NullPointerException 발생코드
			//...
	}
}//end class
public class ExceptionTest6{
	public static void main(String[] args) {
		System.out.println("start");
		Test2 t = new Test2();
		try {
		  t.a();
		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누어 예외발생");
//			System.out.println(e.getMessage()); /// by zero
			e.printStackTrace(); // 디버깅용
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end:정상종료");
	}
}
