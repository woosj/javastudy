package javaDay05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s, n, num;
		char ch; // y/n�� �Է��� ����
		
		while(true){
			do{
				System.out.print("���ϴ� �� �Է� : ");
				num = sc.nextInt();
				
			}while( num < 1 || num > 1000 );
			
			s = 0;
			
			for( n = 1; n <= num; n++){
				s += n;
			}
			
			System.out.printf("1 ~ %d ������ �հ� : %d \n",num , s);
			
			System.out.print("��� �����ϰڽ��ϱ�? [y/n] : ");
			ch = sc.next().charAt(0);
			
			if(ch != 'y' && ch != 'Y') break;
		}
	}

}
