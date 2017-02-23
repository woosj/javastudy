package javaDay22;

import java.util.*;

class RecordEx {

	String name;
	int sco;
	
}

class Grade {
	
	RecordEx[] rec;	//레코드 클래스를 참조 변수로 선언
	
	int n;	//인원수 변수 정의
	
	Scanner sc = new Scanner(System.in);
	
	//인원수를 입력받을 메서드 정의
	void set(){
		
		do{
			System.out.print("인원수 입력 ( 1 ~ 100 ) : ");
			n = sc.nextInt();
			sc.nextLine();
		}while( n < 1 || n > 100 );
		
		rec = new RecordEx[n];
		
	}
	
	void input(){
		
		//이름과 성벅을 입력받는다.
		for(int i = 0; i < rec.length; i++){
			rec[i] = new RecordEx();
			
			System.out.print("이름 :");
			rec[i].name = sc.nextLine();
			
			System.out.print("성적 :");
			rec[i].sco = sc.nextInt();
			sc.nextLine();
		}
		
		int pass = 0;
		RecordEx temp = new RecordEx();
		boolean flag = false;
		
		do{
			flag = false;
			pass++;
			
			for(int i = 0; i < rec.length-pass; i++ ){
				
				if(rec[i].sco < rec[i+1].sco){
					temp = rec[i];
					rec[i] = rec[i+1];
					rec[i+1] = temp;
					
					flag = true;
				}
			}//end of for
			
		}while(flag);//end of while
		
	}//end of input()
	
	void print(){
		for(int i = 0; i < rec.length; i++ ){
			
			System.out.println("이름 : " + rec[i].name + ", 성적 :" + rec[i].sco );
			
		}//end of for
		
	}//end of print()
}
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade g = new Grade();
		
		g.set();
		g.input();
		g.print();
		
	}

}
