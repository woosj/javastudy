package Day32DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBEx06 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append(" update professor ");
		sql.append(" set sal = ? ");
		sql.append(" where name = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//디비 드라이버 연결
			con = ConnUtil.getConnection();
			//PreparedStatement 객체 얻기
			pstmt = con.prepareStatement(sql.toString());
			//파라미터 셋팅
			//쿼리의 ? (바인딩 변수)에 대체될 실제 값 저장하기
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 수정되었습니다.");
			
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
