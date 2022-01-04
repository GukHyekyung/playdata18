package exam3;

public class TestPet {
    public static void main(String[] args) {

    	//1. 일반 생성
    	Dog d = new Dog("망치", 2, "암컷");
    	Cat c = new Cat("나비", 1, "블랙");
    
    	//2. 다형성
    	/*
    	 *    부모타입 변수 = 자식타입;
    	 * 
    	 */
    	Pet p = new Dog("망치", 2, "암컷");
    	    p = new Cat("나비", 1, "블랙");
    	    
    	// 3. 다형성 확징
    	 Object obj = new Dog("망치", 2, "암컷");
    	        obj = new Cat("나비", 1, "블랙");
    	        obj = "hello";
    	        obj = 10;
    	        obj = true;
    	        
	}
	
}
