package exam4_decouple;

//Oracle 데이터베이스와 연동하는 클래스

public class OracleDAO implements DBDAO{

	@Override
	public void connect() {
		System.out.println("OracleDAO.connect_oracle");
	}
}
