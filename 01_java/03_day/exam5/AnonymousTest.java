package exam5;


interface Flyer{
	public abstract void fly();
}

//1. concrete class 사용 ==> Bird라는 이름있는 클래스 활용
// Bird.java 작성되기 때문에 다른 여러 클래스가 Bird 공유해서 사용 가능.
class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}
}


public class AnonymousTest {
	public static void main(String[] args) {
		Flyer f = new Bird();
		f.fly();
	}
}















