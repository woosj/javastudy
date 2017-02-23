package Day32DB;

import java.sql.*;
import java.io.*;
import java.util.*;

public class DBEx10 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		//설정파일 객체 얻기
		Properties pro = new Properties();	//util에서 지원
		
		//설정파일 불러오기 
		pro.load(new FileInputStream("src/department.properties"));
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			pstmt.setInt(1, 33);
			pstmt.setString(2, "핵과");
			pstmt.setString(3, "3호관");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가 되었습니다.");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
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

       }//end of finally
		
	}

}
