package exam2;

public class Dog extends Pet {

	  String sex;  //성별, Dog클래스에서만 추가된 속성
	  
	  public Dog() {}
	  public Dog(String name, int age, String sex) {
		  //부모에서 선언된 name,age를 자식에서 초기화
//		  this.name = name;
//		  this.age = age;
		  // 부모에서 선언된 name,age를 부모에서 초기화(OOP)
		  super(name, age);
		  this.sex = sex;
	  }
	  
	  //추가 메서드 지정가능	
}
