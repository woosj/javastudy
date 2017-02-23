package javaDay03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이름과 세과목을 성적을 입력받아 합계 계산
		Scanner sc = new Scanner(System.in);
		
		//변수선언
		int kor, eng, mat, sum = 0;
		String name;
		
		//연산 및 처리
		//사용자의 입력값을 받아 처리
		
		System.out.print("name : ");
		name = sc.next();
		
		System.out.print("국어점수:");
		kor = sc.nextInt();
		
		System.out.print("영어점수:");
		eng = sc.nextInt();
		
		System.out.print("수학점수:");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		
		double avg = sum/3;
		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.println("합계는 " + sum + "이고 평균은 " + avg +"입니다.");
		
	}

}
