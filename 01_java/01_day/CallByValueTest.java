class Person{
	
	String name;  // 변수, 참조형 변수, String형 변수, 인스턴스 변수
	int age;     // 변수, 기본형 변수, int 형 변수, 인스턴스 변수
	static String address; // 변수, 참조형 변수, String형 변수, 클래스 변수(static변수)
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}


public class CallByValueTest {

	
	//기본형
	public static void pdt(int num) { // 변수, 기본형변수, int형 변수, 로컬변수
		num = 20;
	}
	//참조형
	public static void rdt(Person person) { // 변수, 참조형 변수, Person형 변수, 로컬변수
		person.setAge(200);
	}
	public static void main(String[] args) {

		//참조형 실습
		Person p = new Person("홍길동", 20);  // 변수, 참조형 변수, Person형 변수, 로컬변수
		System.out.println("변경전 값:"+ p); // p.toString(), 참조형변수를 println 하면 자동으로 toString()호출된다.
		System.out.println("변경전 값:"+ p.toString()); 
		rdt(p); // call by value reference
		System.out.println("변경후 값:"+ p);
		
		
		//기본형 실습
		int n = 10;  //변수, 기본형변수, int형 변수,  로컬변수
		System.out.println("변경전 값:"+ n);
		pdt(n); // call by value
		System.out.println("변경후 값:"+ n);
		
	}
}








