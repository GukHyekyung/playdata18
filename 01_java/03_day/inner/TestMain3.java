package inner;

// 3. static inner class
class Outer3{
	static int zzz=20;
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	public void methodOuter() {
		
	}//end methodOuter()

	//static inner
	static class Inner{
		int x =  1000;
		static int x2 = 2000; // static 사용 가능
		public void methodInner() {
//			System.out.println(n);  // Outer 접근 불가
//			System.out.println(n2); // Outer 접근 불가
//			System.out.println(n3); // Outer 접근 불가
//			System.out.println(n4); // Outer 접근 불가  
			System.out.println(x);
			System.out.println(x2);
			System.out.println(zzz);
		}
	}//end static class Inner
	
}//end Outer 클래스

public class TestMain3{
	public static void main(String[] args) {
		// Outer3 만 사용
		 Outer3 outer = new Outer3();
		// Inner 사용 => Outer클래스명.Inner 형식
		 Outer3.Inner inner = new Outer3.Inner();
		 inner.methodInner();
	}
}
