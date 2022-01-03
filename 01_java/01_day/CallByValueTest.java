class Person{
	
	String name;
	int age;
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
	public static void pdt(int num) {
		num = 20;
	}
	//참조형
	public static void rdt(Person person) {
		person.setAge(200);
	}
	public static void main(String[] args) {

		//참조형 실습
		Person p = new Person("홍길동", 20);
		System.out.println("변경전 값:"+ p); // p.toString(), 참조형변수를 println 하면 자동으로 toString()호출된다.
		System.out.println("변경전 값:"+ p.toString()); 
		rdt(p);
		System.out.println("변경후 값:"+ p);
		
		
		//기본형 실습
		int n = 10;
		System.out.println("변경전 값:"+ n);
		pdt(n);
		System.out.println("변경후 값:"+ n);
		
	}
}








