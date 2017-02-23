package javaDay06;

import java.util.Scanner;

public class ArrClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 레기드 배열(가변 배열)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int[][] score;	//학생수에 따른 각 과목별 점수
		String[] name;	//이름저장 배열
		String[] grade;	//등급저장 배열
		double[] avg;	//평균저장 배열
		int[] rank;	//석차저장 배열
		int student;	//학생수
		String Sname;	//입력된 이름 임시 저장 변수
		int total = 0, subnum, sco;
		
		System.out.print("학생 수 입력 : ");
		student = sc.nextInt();
		
		//배열 초기화
		score = new int[student][];
		name = new String[student];
		grade = new String[student];
		avg = new double[student];
		rank = new int[student];
		
		for(int i = 0; i < score.length; i++){
			System.out.print( (i+1) + "번의 학생 이름 입력 : ");
			
			//이름입력
			Sname = sc.next();
			name[i] = Sname;
			
			//과목수
			System.out.print( (i+1) + "번의 학생 과목수 입력 : ");
			subnum = sc.nextInt();
			
			//레기드배열 (가변 배열 초기화)
			//학생마다 다른 과목수를 입력받아
			//배열의 길이가 모두 다를 수 있음
			score[i] = new int[subnum];
			
			for( int j = 0; j < score[i].length; j++){
				System.out.print( (i+1) + "번의 학생" + (j+1) + "번째 과목 성적입력 : " );
				sco = sc.nextInt();
				total += sco;	//합계
				score[i][j] = sco;
			}
			
			//평균
			avg[i] = (double)total/subnum;
			//합계 초기화
			total = 0;
			
			switch((int)avg[i]/10){
				case 10:
				case 9:
					grade[i] = "A";
					break;
				case 8:
					grade[i] = "B";
					break;
				case 7:
					grade[i] = "C";
					break;
				case 6:
					grade[i] = "D";
					break;
				default:
					grade[i] = "F";
					break;
			}
			
			
		}
		
		//석차구하기
		for(int i = 0; i < name.length; i++){
			rank[i] = 1;
			for( int j = 0; j < name.length; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		
		//출력
		for(int i = 0; i < score.length; i++){
			System.out.printf("이름 : %s\t",name[i]);
			for(int j = 0; j < score[i].length; j++){
				System.out.printf("%d 과목 : %d\t", j+1, score[i][j]);
			}
			
			System.out.printf("평균 : %.1f\t", avg[i]);
			System.out.printf("학점 : %s\t\n", grade[i]);
		}
		
	}

}
