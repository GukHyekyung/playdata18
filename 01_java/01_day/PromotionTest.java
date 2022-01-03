

public class PromotionTest {
	public static void main(String[] args) {
		
		//묵시적 형변환
		//1. byte > short > int > long > float > double
		
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 =b3;
		
		//2.  char > int (아스키코드) ==> char를 이용해서 연산 가능하다.
		int n = 'A';  // 65 
		int n2 = 'a'; // 97
		System.out.println(n);
		System.out.println(n2);
		
		int n3 = 'A'+1;
		System.out.println(n3);
		
		//3. 작은타입과 큰타입과 연산 결과는 큰타입으로 반환
		int x = 10;
		float x2 = 3.15f;
		System.out.println(x+x2);
		
		//4. 문자열과 비문자열과 + 하면 결과는 연결되어 문자열로 반환
		String xxx = "Hello" + 1 + 2 + 3;
		System.out.println(xxx);
		
		// 참조형 ( 상속관계) 
		/*
		 *    Object  ( 큰타입)
		 *       |
		 *     String (작은타입)
		 */
		String s = "Hello";
		Object s2 = s; //다형성(Polymorphism)
		//Integer i = s;
		
	}

}






