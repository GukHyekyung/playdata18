package exam6;

import java.io.IOException;
import java.sql.SQLException;

// throws 예외클래스 
// 오버라이딩 메서드 
class Super{
	public void a() throws Exception{}
	public void b() throws IOException{}
	public void c() throws Exception{}
}

class Sub extends Super{
	@Override
	public void a() {}  // 자식에서는 같거나 축소 및 같은 계열만 가능
	
	@Override
	public void b() throws SQLException{}  // IOException 계열만 사용 가능
	
	@Override
	public void c() throws IOException{} // 축소 가능
}

public class ExceptionTest7{
	public static void main(String[] args) {
		
	}
}
