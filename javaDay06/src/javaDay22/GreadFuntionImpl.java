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
			System.out.print("인원 수 입력 : ");
			n = sc.nextInt();
			sc.nextLine();	//엔터키 처리
			
			student = new StudentVO[n];
			
			for(int i = 0; i < student.length; i++){
				System.out.print( (i+1) + "번째 학생의 학번 이름 입력(공백구분) : ");
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
