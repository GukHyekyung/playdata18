package exam2;
//비행 능력
public class Bird implements Flyer{
	@Override
	public void takeOff() {
		System.out.println("btakeOff");
	}
	@Override
	public void fly() {
		System.out.println("bfly");
	}
	@Override
	public void land() {
		System.out.println("bland");
	}
}
