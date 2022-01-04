package exam5;

public class Bird extends Pet {

	 //2. 먹기기능 추가 - 재정의 안함(강제성이 없음)
//	public void eatBird() {
//		System.out.println("eatBird");
//	}
    //3. 추상메서드 재정의해서 eatPet메서드로 강제
	@Override
	public void eatPet() {
		System.out.println("eatBird");
	}
}
