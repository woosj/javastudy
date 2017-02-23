package Day32DB;

import java.sql.*;

public class DBEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * transaction : ������ �۾�����
		 * insert, delete, update���� �۾��� �ϳ��� ������ �۾������� 
		 * ��� ���� ����� ��� �۾��� ����ó���� ��쿡�� commit�� �����ؼ�
		 * db�� �ݿ��ϰ� ���� ������ �ϳ��� ����ó���� ���� �ʾ��� ��� 
		 * rollback�� �����ؼ� �۾��������� ��� �۾��� �����
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
			//////Ʈ����� ����////////
			// �ϳ��� �� ���� �۾����� ����
			//��� ����̹� ����
			con = ConnUtil.getConnection();
			
			//autoCommit() ����� ��Ȱ��ȭ��
			con.setAutoCommit(false);
			
			//ù��° �۾�����(������ ����)
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 23);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setString(3, "7ȣ��");
			pstmt.executeUpdate();
			//ù��° �۾�����
			
			//�ι�° �۾�����(������ ����)
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "������а�");
			pstmt.setString(2, "4ȣ��");
			pstmt.setInt(3, 3);
			pstmt.executeUpdate();
			
			//�ι�° �۾�����
			
			//������ ���������� ����� ��� db�� �ݿ�
			con.commit();
			System.out.println("db�� �ݿ���");
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			try {
				con.rollback();
				System.out.println("db�ݿ��� �����");
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}finally {
	       	//pstmt �� ����
	       	try {
	            if(pstmt != null) {
	            	pstmt.close();
	            }
		 
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	
	       	//con�� ����
	       	try {
	       		if(con != null) {
	                con.close();
	            }
	       	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       	//Ʈ���������

       }
		
		
	}

}
