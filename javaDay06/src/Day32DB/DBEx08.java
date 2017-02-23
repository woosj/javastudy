package Day32DB;

import java.sql.*;

public class DBEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * transaction : 논리적인 작업단위
		 * insert, delete, update등의 작업을 하나의 논리적인 작업단위로 
		 * 묶어서 쿼리 실행시 모든 작업이 정상처리된 경우에는 commit을 실행해서
		 * db에 반영하고 쿼리 실행중 하나라도 정상처리가 되지 않았을 경우 
		 * rollback을 실행해서 작업단위내의 모든 작업을 취소함
		 * 
		 */
		
		StringBuffer sql1 = new StringBuffer();
		sql1.append(" insert into department ");
		sql1.append(" values(?, ?, ?) ");
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append(" update department ");
		sql2.append(" set dname = ? , ioc = ? ");
		sql2.append(" where deptno = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//////트랜잭션 시작////////
			// 하나의 논리 적인 작업단위 시작
			//디비 드라이버 연결
			con = ConnUtil.getConnection();
			
			//autoCommit() 기능을 비활성화함
			con.setAutoCommit(false);
			
			//첫번째 작업시작(데이터 삽입)
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 23);
			pstmt.setString(2, "핵물리학과");
			pstmt.setString(3, "7호관");
			pstmt.executeUpdate();
			//첫번째 작업종료
			
			//두번째 작업시작(데이터 수정)
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "4호관");
			pstmt.setInt(3, 3);
			pstmt.executeUpdate();
			
			//두번째 작업종료
			
			//쿼리가 정상적으로 실행된 경우 db에 반영
			con.commit();
			System.out.println("db에 반영됨");
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			try {
				con.rollback();
				System.out.println("db반영을 취소함");
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}finally {
	       	//pstmt 를 종료
	       	try {
	            if(pstmt != null) {
	            	pstmt.close();
	            }
		 
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	
	       	//con을 종료
	       	try {
	       		if(con != null) {
	                con.close();
	            }
	       	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	//트랜잭션종료

       }
		
		
	}

}
