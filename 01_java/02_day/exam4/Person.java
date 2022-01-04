package exam4;
/*
 *   OOP 3대특징
 *   1. 상속
 *   2. 다형성
 *   3. 은닉화
 * 
 */
//은닉화(encapsulation)
public class Person {
	/*
	 *   직접 변수 접근시 
	 *   잘못된 데이터를 유효성 체크없이 
	 *   할당이 가능하다. 
	 *   이것을 방지할 목적으로 
	 *   일반적으로 인스턴스변수에는 private로 지정한다. 
	 * 
	 */
	private String name;  // 이름
	private int age;     /// 나이
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
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
	//유효성체크 메서드
	private boolean ageCheck(int age) {
		boolean result = false;
		if(age < 100) {
			result = true;
		}
		return result;
	}
	public void setAge(int age) {
		if(ageCheck(age)) {
			this.age = age;
		}else {
			System.out.println("잘못된 age 입력.");
		}
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//필요시 메서드 추가
}
