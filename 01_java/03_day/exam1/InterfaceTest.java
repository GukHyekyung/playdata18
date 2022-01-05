package exam1;



public class InterfaceTest {

	public static void main(String[] args) {

		// 객체생성 불가
//		Flyer f = new Flyer(); 
		
		Flyer ff = new FlyerImpl(); //다형성
		
		FlyerImpl f = new FlyerImpl();
		f.a();
		f.b();
		f.c();
		f.xxx();
		f.kkk();
		FlyerImpl.xyz();
		Flyer.zzz();
		System.out.println(Flyer.NUM);
		System.out.println(Flyer.size);
//		Flyer.size = 20; //상수
	}

}
