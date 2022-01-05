package inner;

// 2. local inner class
class Outer2{
	static int zzz=20;
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	//////////////////////////////////////////
	public void methodOuter() {
		int x = 10;  //로컬변수
		
		class Inner{
			int z = 200;
//			static int z2 = 30;  // static 사용불가
			public void methodInner() {
				System.out.println(n);
				System.out.println(n2);
				System.out.println(n3);
				System.out.println(n4);  //private 접근 가능
				System.out.println(x);
				System.out.println(z);
				System.out.println(zzz);
			}
		}//end Inner class
		
		//Inner 생성
		Inner inner = new Inner();
		inner.methodInner();
		
	}//end methodOuter()
   //////////////////////////////////////
	
}//end Outer 클래스

public class TestMain2{
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.methodOuter();
	}
}
