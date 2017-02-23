package javaDay04;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 사용자로 부터 이름, 국어, 영어, 수학, 사회, 과학 과목의 점수를 입력받아 
		 * 총점과 평균을 구하고 학점을 판정하는 프로그램을 작성하시오.
		 * 단 평균은 변수선언시 실수형으로 출력은 정수형태로 출력하시오.
		 * 
		 * 조건 :	90 ~ 100 -> A학점
		 *      80 ~ 90 -> B학점
		 * 		70 ~ 80 -> C학점
		 * 		60 ~ 70 -> D학점
		 * 		60 이하는 F로 처리하시오.
		 * 
		 * 학점을 판정기준으로 평균값으로 처리
		 * 
		 * if(평균 >= 90){
		 * 		A
		 * }else if(평균 >= 80){
		 * 		B
		 * }else if(평균 >= 70){
		 * 		C
		 * }else if(평균 >= 60){
		 * 		D
		 * }else{
		 * 		F
		 * }
		 * 
		 * 당신의 이름은 홍길동 입니다.
		 * 국어점수 :10 
		 * 영어점수 :20
		 * 수학점수 :30
		 * 사회점수 :40
		 * 과학점수 :50
		 * 총점은 150이고 평균은 30점 입니다.
		 * 등급은 F입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,mat,soci,sci,total = 0;
		String name;
		double avg = 0;
		char grade;
		
		System.out.print("이름을 입력하세요 :");
		name = sc.next();
		
		System.out.print("국어점수 :");
		kor = sc.nextInt();
		
		System.out.print("영어점수 :");
		eng = sc.nextInt();
		
		System.out.print("수학점수 :");
		mat = sc.nextInt();
		
		System.out.print("사회점수 :");	
		soci = sc.nextInt();
		
		System.out.print("과학점수 :");
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
		System.out.println("당신의 이름은 "+ name +"입니다.");
		System.out.printf("총점은 %d이고 평균은 %d점 입니다.",total,(int)avg);
		System.out.println("등급은 "+ grade +"입니다.");
		
		
	}

}
