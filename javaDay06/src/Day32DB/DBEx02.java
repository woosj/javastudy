package Day32DB;

import java.sql.*;

public class DBEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql = new StringBuffer();
		sql.append(" update department ");
		sql.append(" set dname = 'linux' where dname = 'test' ");
		
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String id = "scott";
		String pw = "tiger";
		
		try {
			 // 1. Driver를 로딩한다.
           Class.forName("oracle.jdbc.driver.OracleDriver");
            
           // 2. Connection 얻어오기(IP:포트:SID, 아이디, 비밀번호)
           con = DriverManager.getConnection(url, id, pw);
           System.out.println("연결되었습니다.");
           // 3. Statement 얻기
           stmt = con.createStatement();
 
           //수정 쿼리
           int result = stmt.executeUpdate(sql.toString());
           System.out.println(result + "개 행이 수정되었습니다.");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이브를 찾을 수 없습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
           System.out.println(e.toString());
             
       } finally {
       	
       	try {
       		
	            if(stmt != null) {
	                stmt.close();
	            }
	 
	            if(con != null) {
	                con.close();
	            }
       	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

       }

	}

}
