package exam1;

//다중 구현 가능.
public class FlyerImpl implements Flyer,Flyer2 {

	// 필요시 인스턴스변수, 생성자, 일반메서드 추가 가능
	public void kkk() {
		System.out.println("kkk");
	}
	public static void xyz() {
		System.out.println("xyz");
	}
	@Override
	public void a() {
		System.out.println("a");
	}

	@Override
	public void b() {
		System.out.println("b");
	}

	@Override
	public void c() {
		System.out.println("c");
	}
	@Override
	public void d() {
		System.out.println("d");
	}

}
