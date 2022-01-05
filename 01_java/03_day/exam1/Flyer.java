package exam1;

public interface Flyer {

	//상수
	public static final int NUM=10; //권장
	int size =10;  //상수, public static final 자동지정된다. 권장안함
	
	//추상메서드
	public abstract void a();  //권장
	public  void b(); // abstract 생략가능. public abstract 자동 지정  , 권장안함
	void c(); // public abstract 자동 지정 , 권장안함
	
	//default 메서드 ==> 일반클래스의 concrete method(일반메서드) 기능
	public default void xxx() {
		  System.out.println("default 메서드");
	}
	
	//static 메서드 ==> 일반클래스의 static method 기능
	public static void zzz() {
		System.out.println("default 메서드");
	}
}
