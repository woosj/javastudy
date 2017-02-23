package javaDay11;

import java.util.Scanner;

public class Sung {
	//주요 변수(속성 선언)
	int inwon;	//인원수
	Record[] rec;	//Record 클래스 배열화
	String[] title = {"국어","영어","수학"};
	//기능(메서드)
	
	//인원수 입력
	void set(){
		//인원수 입력받는 작업
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요.");
		inwon = sc.nextInt();
		
		rec = new Record[inwon];
		
		setData();
		setRank();
	}
	
	//데이터 입력 및 계산
	void setData(){
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < rec.length; i++){
			System.out.print("이름을 입력하세요 : ");
			/*
			 * 아주 중요함 
			 */
			rec[i] = new Record();
			
			rec[i].name = sc.nextLine();
			
			for(int j =0; j < rec[i].score.length; j++){
				System.out.print(title[j] + " : ");
				/*switch(j){
					case 0 : System.out.print("국어점수 :");break;
					case 1 : System.out.print("영어점수 :");break;
					case 2 : System.out.print("수학점수 :");break;
				}*/
				
				//점수 입력
				rec[i].score[j] = sc.nextInt();
				//합계
				rec[i].tot += rec[i].score[j];
			}
			//평균구하기
			rec[i].avg = rec[i].tot/3.0;
			
		}
		
		
	}
	
	
	//석차계산
	void setRank(){
		int i, j;
		
		//모든 학생의 등수를 1로 초기화
		for(i = 0; i < rec.length; i++){
			rec[i].rank = 1;
		}
		
		for(i=0; i<rec.length; i++){
			for(j=0;j<rec.length;j++){
				if(rec[i].tot < rec[j].tot){
					rec[i].rank++;
				}
			}
		}
	}
	
	//출력
	void disp(){
		for(int i =0; i < rec.length; i++){
			System.out.println("이름 : "+rec[i].name);
			
			for(int j =0; j < rec[i].score.length; j++){
				System.out.println(title[j] + " : " + rec[i].score[j]);
			}
			
			System.out.println("합계 : "+rec[i].tot);
			System.out.println("평균 : "+rec[i].avg);
			
		}
	}
	 
}
