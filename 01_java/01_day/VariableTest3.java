// 재사용 클래스
class Student{
	String name;  //인스턴스 변수
	int age;      //인스턴스 변수
	static String gender;   // static 변수
	
	public Student() {
	}
	public Student(String name, int age) {  // 로컬변수
		this.name = name;  // this.name은 인스턴스 변수
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
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		Student.gender = gender;
	}

}

// 핸들링 클래스 => Student 재사용클래스를 사용
public class VariableTest3 {
	public static void main(String[] args) {
        /*
         *  1. 프로그램 실행
         *    ==> method area 메모리 관여된다.
         *    ==> method area에는 static로 된 변수 및 메서드 그리고 클래스 정보가 저장된다.
         */
		
		//객체생성
		Student s = new Student("홍길동", 20);  // s는 로컬변수
		
		
		
		
		Student s2 = new Student("이순신", 33);  // s2는 로컬변수
		
		//인스턴스 변수 및 메서드 ==>반드시 객체 생성후에 참조변수로 접근한다.
		System.out.println(s.name+"\t"+s.age);
		System.out.println(s.getName()+"\t"+s.getAge());
		
		//static 변수 및 메서드 ==> 객체생성과 무관, 클래스명으로 접근한다. 
		System.out.println(Student.gender);
		
		//로컬변수는 사용전에 반드시 초기화
		int n=0;
		System.out.println(n);
	}

}






