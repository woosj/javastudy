package javaDay22;

import java.util.*;

public class GreadFuntionImpl implements GradeFuntion {
	
	StudentVO[] student;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub

		int n = 0;
		do{
			System.out.print("�ο� �� �Է� : ");
			n = sc.nextInt();
			sc.nextLine();	//����Ű ó��
			
			student = new StudentVO[n];
			
			for(int i = 0; i < student.length; i++){
				System.out.print( (i+1) + "��° �л��� �й� �̸� �Է�(���鱸��) : ");
				student[i].setHak_name(sc.nextLine());
				
			}
			
		}while( n < 0 || n > 10);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
