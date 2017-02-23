package Day32DB;

import java.io.*;
import java.sql.*;

public class DBEx09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("sql �Է� : ");
		
		String sql = br.readLine();
		
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		//���� ������������ �ΰ������� ������ �ִ�
		//ResultSetMetaData ���
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("�÷��� ���� : " + rsmd.getColumnCount());
		
		//�÷��̸�
		for( int i = 1; i <= rsmd.getColumnCount(); i++){
			System.out.print(rsmd.getColumnName(i) + "\t" );
		}
		
		System.out.println();
		
		//�÷�Ÿ��
		for( int i = 1; i <= rsmd.getColumnCount(); i++ ){
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		
		System.out.println();
		
		int colcount = rsmd.getColumnCount();
		
		while(rs.next()){
			for(int colNum = 1; colNum <= colcount; colNum++){
				int colType = rsmd.getColumnType(colNum);
				
				switch(colType){
					case Types.NUMERIC:
						System.out.print(rs.getInt(colNum) + "\t");
						break;
					case Types.VARCHAR:
						System.out.print(rs.getString(colNum) + "\t");
						break;
					case Types.DATE:
						System.out.print(rs.getString(colNum) + "\t");
						break;
				}//end of switch
			}//end of for
			System.out.println();
		}//end of while
		
		br.close();
		rs.close();
		pstmt.close();
		con.close();
		
	}

}
