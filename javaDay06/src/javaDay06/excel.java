package javaDay06;

import java.util.Scanner;

public class excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 이름	국어	영어	수학	사회	과학	총점	평균	석차	학점
		 * 홍길동	45	40	30	30	50
		 * 
		 * 성적을 입력하세요.
		 * 이름 : 
		 * 국어 :
		 * 영어 :
		 * 수학 :
		 * 과학 :
		 * 
		 * 	
		 */
		
		//입력 변수
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String[][] arr = new String[5][10];
		String[] arr_name = new String[5];
		String sub[] = {"국어","영어","수학","사회","과학"};
		
		int sum = 0, rank = 0;
		double avg = 0.0;
		String grade;
		
		for( int i = 0; i < arr.length; i++){
			System.out.println("성적을 입력하세요.");
			for(int j = 0; j < arr[i].length; j++){	
				if(j >= 0 && j <= 5){
					//이름과 성적 입력부분
					switch(j){
						case 0 :
							System.out.print("이름 : ");
							break;
						case 1 :
							System.out.print("국어 : ");
							break;
						case 2 :
							System.out.print("영어 : ");
							break;
						case 3 :
							System.out.print("수학 : ");
							break;
						case 4 :
							System.out.print("사회 : ");
							break;
						case 5 :
							System.out.print("과학 : ");
							break;
					}
					
					arr[i][j] = sc.nextLine();
				}else if(j == 6 ){
					//총합
					sum = 0;
					
					for( int sum_i = 1; sum_i <=arr.length; sum_i++ ){
						
						sum += (int)Integer.parseInt(arr[i][sum_i]);
					}
					
					arr[i][j] = String.valueOf(sum);
					
				}else if(j == 7){
					//평균
					avg = (double)Double.parseDouble(arr[i][j-1])/arr.length;
					arr[i][j] = String.valueOf(avg);
					
				}else if(j == 8){
					int rank_num = 1;
					arr[i][j] = "1";
					
					for(int rank_i = 0; rank_i < i; rank_i++){
						arr[rank_i][j] = "1";
						
						for( int rank_j = 0; rank_j < i; rank_j++){
							
							if((double)Double.parseDouble(arr[rank_i][rank_j]) < (double)Double.parseDouble(arr[rank_i][rank_j])){
								rank_num = Integer.parseInt(arr[rank_i][rank_j]) + 1;
								arr[rank_i][rank_j] = String.valueOf(rank_num);
							}
						}
						
					}
					
					
				}else if(j == 9){
					
					switch ((int) (Double.parseDouble(arr[i][j-2]) / 10)) {

						case 10:
						case 9:
							grade = "A";
							break;
						case 8:
							grade = "B";
							break;
						case 7:
							grade = "C";
							break;
						case 6:
							grade = "D";
							break;
						default:
							grade = "F";
							break;
					}
					
					arr[i][j] = grade;
				}
			}
		}
	
		//출력
		for(int out_i = 0 ; out_i < arr.length; out_i++){
			for(int out_j = 0; out_j < arr[out_i].length; out_j++){
				System.out.print(arr[out_i][out_j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
