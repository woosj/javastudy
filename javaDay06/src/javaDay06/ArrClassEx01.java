package javaDay06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrClassEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//이름
		String[] name = new String[5];
		
		int[] sum = new int[5];
		int[] avg = new int[5];
		char[] grade = new char[5];
		
		int i,j,k,h;
		
		String sub[] = {"국어","영어","수학","사회","과학"};
		int[][] soc = new int[5][5];	//성적
		int rank[] = new int[5];	//석차
		
		for( i = 0; i < name.length; i++){
			//이름입력 
			System.out.print("이름 :");
			name[i] = br.readLine();
			
			for( j = 0; j < sub.length; j++){
				System.out.print(name[i] + "의 " + sub[j] + "점수 :" );
				soc[i][j] = Integer.parseInt(br.readLine());
				sum[i] += soc[i][j];
			}
			
			//평균구하기
			avg[i] = sum[i]/5;
			
			if(avg[i] >= 90){
				grade[i] = 'A';
			}else if(avg[i] >= 80){
				grade[i] = 'B';
			}else if(avg[i] >= 70){
				grade[i] = 'C';
			}else if(avg[i] >= 60){
				grade[i] = 'D';
			}else{
				grade[i] = 'F';
			}
			
			System.out.println();
			
		}
		
		//석차구하기
		for( i = 0; i < name.length; i++){
			rank[i] = 1;
			for( j = 0; j < name.length; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		
		//타이틀 출력
		System.out.print("이름\t");
		for( i = 0; i < name.length; i++){
			//타이틀 출력
			System.out.print(sub[i] + "점수\t");
		}
		System.out.print("합계\t");
		System.out.print("평균\t");
		System.out.print("석차\t");
		System.out.print("등급\t");
		System.out.println();
		
		//DATA 출력	
		for( i = 0; i < name.length; i++){
			//이름 출력
			System.out.print(name[i] + "\t");
			
			for( j = 0; j < name.length; j++){
				//성적 출력
				System.out.print(soc[i][j]);
				System.out.print("\t");
			}
			//합계 평균
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.print(grade[i] + "\t");
			
			System.out.println();
		}
	}

}
