package exam5;

public class Dog extends Pet {

	String sex;

	public Dog() {
	}

	public Dog(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	//2. 재정의
	@Override
	public void eatPet() {
		System.out.println("eatDog");
	}
	//1. 먹기 기능 추가
	public void eatDog() {
		System.out.println("eatDog");
	}
}
