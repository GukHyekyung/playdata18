// 안드로이드에서 많이 사용되는 패턴
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;

public class StaticImportTest {

	public static void main(String[] args) {

		// 대표적인 static 메서드
		// 1. Integer.parseInt("10") ==> 10
		
		int num = Integer.parseInt("10"); // parseInt는 static 메서드
		System.out.println(num+1);
		int num2 = parseInt("10"); // parseInt는 static 메서드
		System.out.println(num+1);
		
		//// 대표적인 static 상수
		// 2. Math.PI   //PI는  public static final double PI = 3.14~
		System.out.println(Math.PI);
		System.out.println(PI);
	}

}
