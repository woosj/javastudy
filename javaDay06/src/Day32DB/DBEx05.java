package Day32DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into professor ");
		sql.append(" values(?,?,?,?,?,sysdate,?,?) ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//��� ����̹� ����
			con = ConnUtil.getConnection();
			//PreparedStatement ��ü ���
			pstmt = con.prepareStatement(sql.toString());
			//�Ķ���� ����
			//������ ? (���ε� ����)�� ��ü�� ���� �� �����ϱ�
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "����");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 58);
			pstmt.setInt(7, 3);
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰��Ǿ����ϴ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
	       	
	       	try {
	       		
		            if(pstmt != null) {
		            	pstmt.close();
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
