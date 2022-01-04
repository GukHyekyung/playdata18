package exam5;

//부모 클래스
public abstract class Pet {

	// 공통적인 속성
	String name;
	int age;

	public Pet() {
		super(); // Pet의 부모인 Object 클래스의 생성자를 명시적으로 호출코드
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 추가 메서드 지정가능
	// 먹기 기능 추가
	//3.  추상 메서드로 지정해서 하위클래스에서 강제
	public abstract void eatPet();
}
