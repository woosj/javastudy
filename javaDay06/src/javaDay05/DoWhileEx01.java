package javaDay05;
import java.io.*;

public class DoWhileEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 1.ȸ������
		 * 2.ȸ����ȸ
		 * 3.ȸ��Ż��
		 * 0.����
		 * 
		 */
		
		int menu = 0;
		
		do{
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ��Ż��");
			System.out.println("3.ȸ����ȸ");
			System.out.println("0.���α׷�����");
			
			System.out.print("�޴� ���� :");
			menu = System.in.read()-48;	//���ڷ� �ޱ����ؼ�
			//enter key ó�����ؼ� (\r \n)
			System.in.read();
			System.in.read();			
			
		}while(menu != 1 && menu != 2 && menu != 3 && menu != 0);
		
		System.out.println("������ �޴��� : " + menu);
	}

}
