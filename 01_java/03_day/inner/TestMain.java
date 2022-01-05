package inner;

// 1. Member inner class
class Outer{
	static int zzz=20;
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	public void methodOuter() {
		Inner i = new Inner();
		i.methodInner();
	}
    //Member inner class
	class Inner{
		int x = 100;
//		static int k = 200;  // inner 클래스는 기본적으로 static 사용 불가
		public void methodInner() {
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);  //private 접근 가능
			System.out.println(x);
		}
	}//end Inner 클래스

}//end Outer 클래스

public class TestMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.methodOuter();
	}
}
