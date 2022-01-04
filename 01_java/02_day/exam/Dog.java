package exam;

public class Dog extends Pet {

	public Dog() {
		// 생성자 호출2: 자식에서 부모생성자 호출 ==> 부모부터 생성해주어야 되니까..
		// 반드시 자식 생성자 첫라인에서 호출해야 된다. 
		// 호출하지 않으면 자동으로 호출된다. ==> super(); 인자없는 부모생성자 호출
		super(10);
		System.out.println("Dog 생성자");
		
	}
}
