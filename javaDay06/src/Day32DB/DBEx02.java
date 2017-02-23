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
			 // 1. Driver�� �ε��Ѵ�.
           Class.forName("oracle.jdbc.driver.OracleDriver");
            
           // 2. Connection ������(IP:��Ʈ:SID, ���̵�, ��й�ȣ)
           con = DriverManager.getConnection(url, id, pw);
           System.out.println("����Ǿ����ϴ�.");
           // 3. Statement ���
           stmt = con.createStatement();
 
           //���� ����
           int result = stmt.executeUpdate(sql.toString());
           System.out.println(result + "�� ���� �����Ǿ����ϴ�.");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("����̺긦 ã�� �� �����ϴ�.");
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
