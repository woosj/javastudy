package javaDay04;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		char grade;
		
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
		
		

		switch ((int) (avg / 10)) {

			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		System.out.println("����� �̸��� "+ name +"�Դϴ�.");
		System.out.printf("������ %d�̰� ����� %d�� �Դϴ�.",total,(int)avg);
		System.out.println("����� "+ grade +"�Դϴ�.");
		
		
	}

}
