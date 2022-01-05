package exam4_decouple;

public class DBService {

//	OracleDAO dao;
//	MySQLDAO dao;
	DBDAO dao;
	
	public void setDAO(DBDAO dao) { //다형성
		this.dao = dao;
	}
	
	public void connect() {
//		dao.connect_oracle();
//		dao.connect_mysql();
		dao.connect();
	}
	
}
