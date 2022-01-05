package exam5;

interface Flyer2 {
	public abstract void fly();
}

public class AnonymousTest2 {
	public static void main(String[] args) {

		// 익명클래스
		/*
		 * 인터페이스명 변수명 = new 인터페이스(); // 에러발생
		 * 
		 * 인터페이스명 변수명 = new 인터페이스(){ 메서드 재정의 };
		 * 
		 */
		Flyer2 f = new Flyer2() {
			@Override
			public void fly() {
				System.out.println("Flyer2.fly");
			}
		};
		f.fly();
		
		//eclipse 자동완성기능
		Flyer2 f2 = new Flyer2() {
			@Override
			public void fly() {
				System.out.println("Flyer2.fly");
			}
		};
		f2.fly();
		
		
		

	}//end main
}//end class
