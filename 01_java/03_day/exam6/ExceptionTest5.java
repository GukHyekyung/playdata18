package exam6;

// 2. throws 예외클래스 처리 방법
class Test{
	public void a() throws ArithmeticException {
		b();
	}
	public void b() throws ArithmeticException{
			int num = 0;
			int result = 10/num;
			System.out.println("결과값:"+ result);
	}
}//end class
public class ExceptionTest5{
	public static void main(String[] args) {
		System.out.println("start");
		Test t = new Test();
		try {
		  t.a();
		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누어 예외발생");
//			System.out.println(e.getMessage()); /// by zero
			e.printStackTrace(); // 디버깅용
			
		}
		System.out.println("end:정상종료");
	}
}
