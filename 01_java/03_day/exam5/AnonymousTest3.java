package exam5;

interface Flyer3 {
	public abstract void fly();
	public abstract void takeOff();
}

public class AnonymousTest3 {
	public static void main(String[] args) {

		Flyer3 f = new Flyer3() {
			@Override
			public void takeOff() {
				System.out.println("Flyer3.takeOff");
			}
			@Override
			public void fly() {
				System.out.println("Flyer3.fly");
			}
		};
		f.takeOff();
		f.fly();
		

	}//end main
}//end class
