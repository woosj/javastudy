package javaDay05;

import java.util.Scanner;

public class ForEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ���� �޴��� ����ϴ� ���α׷��� �ۼ��ϰ�, ������ �޴��� ���� �հ踦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ������ ������ 1 ~ 1000 ����
		 * 1. ������ ��
		 * 2. ¦���� ��
		 * 3. Ȧ���� ��
		 * 4. ����
		 * 
		 * ���� --> 1
		 */
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int num = 0;
		
		while(true){
			System.out.println("1. ������ ��");
			System.out.println("2. ¦���� ��");
			System.out.println("3. Ȧ���� ��");
			System.out.println("4. ����");
			System.out.print("�޴��� �Է��ϼ��� : ");
			menu = sc.nextInt();
			
			int i = 0;
			int total = 0;
			
			//���� ���ý� ����ȴ�.
			if(menu == 4) break;
			
			//������ ������ �Է¹ް��Ѵ�.
			do{
				System.out.print("���� �Է�(1 ~1000) : ");
				num = sc.nextInt();
			}while(num < 1 || num > 1000 );
			
			//���� ���ϴ� �ݺ���
			do{
				
				if(menu == 2){
					if(i%2 != 0) {
						i++;
						continue;
					}
				}else if(menu == 3){
					if(i%2 == 0){
						i++;
						continue;
					}
				}
				
				total +=i;
				i++;
				
				
			}while( i <= num );
			
			System.out.println("���ø޴� -> " + menu);
			System.out.println("����� : " + total);
		}
		
		/*do{
			System.out.println("1. ������ ��");
			System.out.println("2. ¦���� ��");
			System.out.println("3. Ȧ���� ��");
			System.out.println("4. ����");
			System.out.print("�޴��� �Է��ϼ��� : ");
			
		}while(menu != 4);*/

	}

}
