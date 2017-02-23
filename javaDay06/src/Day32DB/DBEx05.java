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
			//디비 드라이버 연결
			con = ConnUtil.getConnection();
			//PreparedStatement 객체 얻기
			pstmt = con.prepareStatement(sql.toString());
			//파라미터 셋팅
			//쿼리의 ? (바인딩 변수)에 대체될 실제 값 저장하기
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전염");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 58);
			pstmt.setInt(7, 3);
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다.");
			
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
