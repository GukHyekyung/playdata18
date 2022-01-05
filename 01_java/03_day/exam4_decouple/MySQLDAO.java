package exam4_decouple;

//MySQL 데이터베이스와 연동하는 클래스

public class MySQLDAO implements DBDAO{

	@Override
	public void connect() {
		System.out.println("MySQLDAO.connect_mysql");
	}
}
