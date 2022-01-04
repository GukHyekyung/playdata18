package exam4;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person("홍길동",20);
		System.out.println(p); // p.toString()동일
		
		//나이 수정
		//p.age = 2000; //논리적으로 문제가 있음.
		p.setAge(2000);
		System.out.println(p);
		
	}

}
