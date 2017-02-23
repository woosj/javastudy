package Day31DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * 1. jdbc 를 이용하여 연결할때
 * 2. Driver 검색
 * 3. 데이터베이스 연결
 * 4. 쿼리문 작성
 * 5. 결과담기
 * 6. 사용후 반드시 close()함
 */

public class DbEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
	    ArrayList userList = new ArrayList();


		try {
			 // 1. Driver를 로딩한다.
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            // 2. Connection 얻어오기(IP:포트:SID, 아이디, 비밀번호)
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
             
            // 3. Statement 얻기
            stmt = con.createStatement();
  
            // 4. 쿼리문 실행
            StringBuffer sb = new StringBuffer();
            
            //입력 쿼리
            sb.append(" insert into department values( test.nextval, 'test', 'test') ");
            stmt.executeUpdate(sb.toString());
            


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
        		
	            if(rs != null) {
					rs.close();
	            }
	 
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
