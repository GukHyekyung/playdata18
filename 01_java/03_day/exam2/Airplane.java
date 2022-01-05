package exam2;
//비행 능력
public class Airplane implements Flyer{
	@Override
	public void takeOff() {
		System.out.println("takeOff");
	}
	@Override
	public void fly() {
		System.out.println("fly");
	}
	@Override
	public void land() {
		System.out.println("land");
	}
}
