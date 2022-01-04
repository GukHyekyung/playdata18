package exam5;

public class TestPet {
    public static void main(String[] args) {

    	Cat c = new Cat();
    	Dog d = new Dog();
    	Bird b = new Bird();
    	//1. 문제점은 메서드명이 너무 많다. 관리가 어렵다.
//    	c.eatCat();
//    	d.eatDog();
    	
    	
    	//2. 메서드명을 부모 메서드명으로 통일하
//    	c.eatPet();
//    	d.eatPet();
//    	b.eatBird();
    	
    	//3. 강제성 부여하기 위해서 추상메서드로 지정
    	c.eatPet();
    	d.eatPet();
    	b.eatPet();
	}
	
}
