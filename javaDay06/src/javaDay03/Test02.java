package javaDay03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * ����ڷ� ���� �̸�, ����, ����, ����, ��ȸ, ���� ������ ������ �Է¹޾� 
		 * ������ ����� ���ϰ� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �� ����� ��������� �Ǽ������� ����� �������·� ����Ͻÿ�.
		 * 
		 * ���� :	90 ~ 100 -> A����
		 *      80 ~ 90 -> B����
		 * 		70 ~ 80 -> C����
		 * 		60 ~ 70 -> D����
		 * 		60 ���ϴ� F�� ó���Ͻÿ�.
		 * 
		 * ������ ������������ ��հ����� ó��
		 * 
		 * if(��� >= 90){
		 * 		A
		 * }else if(��� >= 80){
		 * 		B
		 * }else if(��� >= 70){
		 * 		C
		 * }else if(��� >= 60){
		 * 		D
		 * }else{
		 * 		F
		 * }
		 * 
		 * ����� �̸��� ȫ�浿 �Դϴ�.
		 * �������� :10 
		 * �������� :20
		 * �������� :30
		 * ��ȸ���� :40
		 * �������� :50
		 * ������ 150�̰� ����� 30�� �Դϴ�.
		 * ����� F�Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,mat,soci,sci,total = 0;
		String name;
		double avg = 0;
		
		System.out.print("�̸��� �Է��ϼ��� :");
		name = sc.next();
		
		System.out.print("�������� :");
		kor = sc.nextInt();
		
		System.out.print("�������� :");
		eng = sc.nextInt();
		
		System.out.print("�������� :");
		mat = sc.nextInt();
		
		System.out.print("��ȸ���� :");	
		soci = sc.nextInt();
		
		System.out.print("�������� :");
		sci = sc.nextInt();
		
		total = kor + eng + mat + soci + sci;
		
		avg = total/5;
		System.out.printf("������ %d�̰� ����� %d�� �Դϴ�.",total,(int)avg);
		
		if(avg >= 90){
			System.out.println("����� A�Դϴ�.");
		}else if(avg >= 80){
			System.out.println("����� B�Դϴ�.");			
		}else if(avg >= 70){
			System.out.println("����� C�Դϴ�.");			
		}else if(avg >= 60){
			System.out.println("����� D�Դϴ�.");		
		}else{
			System.out.println("����� F�Դϴ�.");			
		}
		
		String s = ( (avg >= 90) ? "A":(avg >= 80) ? "B": (avg >= 70) ? "C":(avg >= 60) ? "D":"F" );
		System.out.println(s);
		
		for(int j = 0 ; j < 5 ; j++ ){
			System.out.println("*");
		}
	}
}
