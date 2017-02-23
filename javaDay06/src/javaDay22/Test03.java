package javaDay22;

import java.util.*;

class RecordEx {

	String name;
	int sco;
	
}

class Grade {
	
	RecordEx[] rec;	//���ڵ� Ŭ������ ���� ������ ����
	
	int n;	//�ο��� ���� ����
	
	Scanner sc = new Scanner(System.in);
	
	//�ο����� �Է¹��� �޼��� ����
	void set(){
		
		do{
			System.out.print("�ο��� �Է� ( 1 ~ 100 ) : ");
			n = sc.nextInt();
			sc.nextLine();
		}while( n < 1 || n > 100 );
		
		rec = new RecordEx[n];
		
	}
	
	void input(){
		
		//�̸��� ������ �Է¹޴´�.
		for(int i = 0; i < rec.length; i++){
			rec[i] = new RecordEx();
			
			System.out.print("�̸� :");
			rec[i].name = sc.nextLine();
			
			System.out.print("���� :");
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
			
			System.out.println("�̸� : " + rec[i].name + ", ���� :" + rec[i].sco );
			
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
