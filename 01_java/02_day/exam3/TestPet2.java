package exam3;

public class TestPet2 {
    public static void main(String[] args) {

    	//1. 일반 방법
    	/* 
    	 *   고양이 2마리
    	 *   강아지 3마리
    	 */
    	  Cat[] cats = {new Cat("c1", 2),
    			  		new Cat("c2", 1)};
    	
    	  Dog [] dogs = { new Dog("d1", 1, "암컷"),
    			  new Dog("d2", 4, "암컷"),
    			  new Dog("d3", 1, "수컷")};
    	
    	// 2. 다형성 적용 예1- 배열
    	Pet [] pets = {
    			new Dog("d2", 4, "암컷"),
    			new Cat("c1", 2),
		  		new Cat("c2", 1),
		  		new Dog("d1", 1, "암컷"), 
  			    new Dog("d3", 1, "수컷")};
    	
        //전체 출력?
    	for (Pet pet : pets) {
			System.out.println(pet.name);
		}
    	
    	//Dog 이름만 출력?
    	for (Pet pet : pets) {
			if(pet instanceof Dog) {
				System.out.println("Dog:"+ pet.name);
			}
		}
    	
    	//Dog의 이름과 성별만 출력? => Pet타입으로 전체를 관리함. sex는 Pet이 아닌 Dog에 있음.따라서 Dog형변환필요
    	for (Pet pet : pets) {
			if(pet instanceof Dog) {
				Dog d = (Dog)pet;
				System.out.println("Dog:"+ d.name +"\t"+ d.sex);
			}
		}
    	/*
    	 *   다형성
    	 *   1. 상속전제
    	 *   2. 배열인 경우 관리 용이한 장점
    	 *      - 특정한 데이터 추출하는 경우에는 instanceOf 필요.
    	 *      - 부모에는  없고 자식 클래스에서 추가된 속성이나 메서드를 접근할 때는 형변환이 필요하다. 
    	 * 
    	 *   ==> 최종적으로 필요한 데이터를 추출할 수 있다.
    	 */
    	 

    	        
	}
	
}
