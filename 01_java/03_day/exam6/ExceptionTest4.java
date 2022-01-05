package exam6;

public class ExceptionTest4{

	public static void main(String[] args) {

		System.out.println("1");
		
		try {
			// ArithmeticException 발생 코드
			int num = 2;
			int result = 10/num;
			System.out.println("결과값:"+ result);

			// NullPointerException 발생코드
			String name = null; //"홍길동"
			System.out.println(name.length());
			
			// 실행문....
			
		}catch (ArithmeticException e) {  
			System.out.println("0으로 나누어 예외발생");		
			
		}catch(NullPointerException e) {
			System.out.println("name이 null값이어 예외발생");
		}catch(Exception e) { //관례적으로 가장 마지막에는 Exception으로 catch한다.
			System.out.println("예외발생");
		}finally {
			System.out.println("반드시 수행되는 문장");
		}
		
		/*
		 *  목적: 예외처리 목적이 아니고 필수코드(반드시수행) 문장을 알려주는 용도로 사용된다.
		 *   try{
		 *   
		 * 
		 *    }finally{
		 *       반드시 수행되는 문장
		 *    }
		 */
		 try {
			 System.out.println("QQQQQ");
		 }finally {
			System.out.println("AAAA");
		 }
		
		
		
		System.out.println("end:정상종료");
		
	}

}
