package exam5;

public class Cat extends Pet {
	String color; 
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	// 1.먹기 기능 추가
	public void eatCat() {
		System.out.println("eatCat");
	}
    //2. 재정의
	@Override
	public void eatPet() {
		System.out.println("eatCat");
	}

	
	
}
