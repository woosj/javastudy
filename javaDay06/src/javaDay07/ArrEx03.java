package javaDay07;

import java.io.IOException;

public class ArrEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * �ݶ� ,���, ����ƾ, ���ڼ���, ���̽�, ���Ͻ��� ������ ���Ǳ� ���α׷��� �ۼ��Ͽ���
		 * ��, do ~ while���� switch�� ����Ͻÿ�.
		 * 
		 * �ݶ�-1,���̴�-2,����Ƽ-3,���ڼ���-4,���̽�-5,���Ͻ�-6(0 ����) : 1
		 * �ݶ�
		 */
		int menu = 0;
		
		do{
			System.out.println("�ݶ�-1,���̴�-2,����Ƽ-3,���ڼ���-4,���̽�-5,���Ͻ�-6(0 ����)");
			System.out.print("�޴��� �����ϼ��� : ");
			menu = (int)System.in.read()-48;
			System.in.read();
			System.in.read();
			
			switch(menu){
				case 0: 
					System.exit(0); 
					break;
				case 1:
					System.out.println("�ݶ�");
					break;
				case 2:
					System.out.println("���̴�");
					break;
				case 3:
					System.out.println("����ƾ");
					break;
				case 4:
					System.out.println("���ڼ���");
					break;
				case 5:
					System.out.println("���̽�");
					break;
				case 6:
					System.out.println("���Ͻ�");
					break;
				default:
					System.out.println("��å�Ͻ� ��ǰ�� �����ϴ�.");
					break;
			}
			
			
		}while(menu != 0);
		
	}

}
