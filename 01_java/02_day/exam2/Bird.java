package exam2;

public class Bird {

	// 생성자 호출3: 자신이 다른 생성자 호출, 상속과 무관
	// 반드시 첫라인에서 호출
	int num;
	String name;
	public Bird() {
		this(10);
		System.out.println("Bird() 생성자");
		
	}
	public Bird(int num) {
		this(num, null);
		System.out.println("Bird(int num) 생성자");
//		this.num = num;
		
	}
	public Bird(int num, String name) {
		System.out.println("Bird(int num) 생성자");
		this.num = num;
		this.name = name;
	}
	
}
