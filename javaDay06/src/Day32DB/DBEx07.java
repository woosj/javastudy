package Day32DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBEx07 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select a.name, a.profno, b.dname, a.position ");
		sql.append(" from professor a, department b ");
		sql.append(" where a.deptno = b.deptno and a.deptno = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//디비 드라이버 연결
			con = ConnUtil.getConnection();
			//PreparedStatement 객체 얻기
			pstmt = con.prepareStatement(sql.toString());
			//파라미터 셋팅
			//쿼리의 ? (바인딩 변수)에 대체될 실제 값 저장하기
			pstmt.setInt(1, 3);
			
			ResultSet prs;
			prs = pstmt.executeQuery();
			
			while(prs.next()){
				System.out.print(prs.getString("name") + "\t");
				System.out.print(prs.getInt("profno") + "\t");
				System.out.print(prs.getString("dname") + "\t");
				System.out.print(prs.getString("position") + "\t");
				System.out.println();
			}
			
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
