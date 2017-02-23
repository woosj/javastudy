package Day31DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * 1. jdbc �� �̿��Ͽ� �����Ҷ�
 * 2. Driver �˻�
 * 3. �����ͺ��̽� ����
 * 4. ������ �ۼ�
 * 5. ������
 * 6. ����� �ݵ�� close()��
 */

public class DbEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
	    ArrayList userList = new ArrayList();


		try {
			 // 1. Driver�� �ε��Ѵ�.
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            // 2. Connection ������(IP:��Ʈ:SID, ���̵�, ��й�ȣ)
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
             
            // 3. Statement ���
            stmt = con.createStatement();
  
            // 4. ������ ����
            StringBuffer sb = new StringBuffer();
            
            //�Է� ����
            sb.append(" insert into department values( test.nextval, 'test', 'test') ");
            stmt.executeUpdate(sb.toString());
            


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
