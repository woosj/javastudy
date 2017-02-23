package Day32DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DBEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		 //조회 쿼리
		sql.append(" SELECT  * FROM DEPARTMENT ");
       
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String id = "scott";
		String pw = "tiger";

        ResultSet rs = null;
        
        ArrayList userList = new ArrayList();
        
		try {
			 // 1. Driver를 로딩한다.
           Class.forName("oracle.jdbc.driver.OracleDriver");
            
           // 2. Connection 얻어오기(IP:포트:SID, 아이디, 비밀번호)
           con = DriverManager.getConnection(url, id, pw);
           System.out.println("연결되었습니다.");
           // 3. Statement 얻기
           stmt = con.createStatement();
 
           //검색 쿼리
           rs = stmt.executeQuery(sql.toString());
           
           while( rs.next() ) {
        	   
        	   int i = rs.getInt(1);//deptno
        	   String s1 = rs.getString(2);//dname
        	   String s2 = rs.getString("Ioc");
        	   
        	   System.out.println( i + "," + s1 + "," + s2);
               /*HashMap map = new HashMap();
                
               map.put("DEPTNO", rs.getString("DEPTNO"));
               map.put("DNAME", rs.getString("DNAME"));
               userList.add(map);*/
               
           }

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
