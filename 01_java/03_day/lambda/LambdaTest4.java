package lambda;

/*
 *    람다(lambda) 표현식
 *   1. 등장배경
 *     ==> 기능(메서드)에 집중하자.
 *     ==> 함수형 프로그래밍의 기반이 된다.
 *     
 *   2. 인터페이스 작성후 사용하는 방법 3가지
 *     가. 이름있는 클래스=>  AnonymousTest.java
 *     나. 익명 클래스 ==> AnonymousTest2.java
 *     
 *     다. 람다 표현식(lambda expression)
 *       ==> 모든 인터페이스를 람다 표현식으로 변경은 불가능하다.
 *          반드시 하나의 추상메서드를 가진 인터페이스만 람다 표현식으로 변경이 가능하다.
 *       ==> 메서드(파라미터,리턴)의 기능에 따른 분류 4가지
 *          1) 파라미터 변수 없고 리턴값 없는 형태  ==> 람다표현식
 *          2) 파라미터 변수 있고 리턴값 없는 형태  ==> 람다표현식
 *          3) 파라미터 변수 없고 리턴값 있는 형태  ==> 람다표현식
 *          4) 파라미터 변수 있고 리턴값 있는 형태  ==> 람다표현식
 *       ==>  @FunctionalInterface 지정하면 반드시 하나의 추상 메서드만 사용하도록 강제
 */

@FunctionalInterface
interface Flyer4{
	//3) 파라미터 변수 없고 리턴값 있는 형태
	public abstract int fly();
}
public class LambdaTest4{
	public static void main(String[] args) {
	
		//익명 클래스
		Flyer4 f = new Flyer4() {
			@Override
			public int fly() {
				return 20;
			}
		};
		int result = f.fly();
		System.out.println("익명 클래스.fly반환값" + result);
		
		//람다 표현식
		Flyer4 f2 = ()->{return 20;};  // return문장만 있으면 {}와 return 키워드 생략
		f2 = ()-> 20;
		
		int result2 = f2.fly();
		System.out.println("람다 표현식.fly반환값" + result);
		
	}//end main
}//end class





