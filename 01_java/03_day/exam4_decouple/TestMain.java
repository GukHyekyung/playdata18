package exam4_decouple;

/*
 *    DB연동 아키텍쳐
 *    
 *    TestMain클래스 <-------->DBService 클래스 <-----------> OracleDAO클래스 <---->DB(Oracle)
 *                                           <-----------> MySQLDAO클래스 <---->DB(MySQL)
 * 
 */
public class TestMain {

	public static void main(String[] args) {

		DBService service = new DBService();
		service.setDAO(new OracleDAO());
//		service.setDAO(new MySQLDAO());
		service.connect();
	}

}
