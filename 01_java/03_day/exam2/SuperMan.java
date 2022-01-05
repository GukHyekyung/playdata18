package exam2;
// 비행 능력
public class SuperMan implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("superTakeOff");
		
	}
	@Override
	public void fly() {
		System.out.println("superFly");
		
	}
	@Override
	public void land() {
		System.out.println("superLand");
		
	}
	
}
