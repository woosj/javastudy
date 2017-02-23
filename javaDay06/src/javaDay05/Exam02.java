package javaDay05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s, n, num;
		char ch; // y/n을 입력할 변수
		
		while(true){
			do{
				System.out.print("원하는 수 입력 : ");
				num = sc.nextInt();
				
			}while( num < 1 || num > 1000 );
			
			s = 0;
			
			for( n = 1; n <= num; n++){
				s += n;
			}
			
			System.out.printf("1 ~ %d 까지의 합계 : %d \n",num , s);
			
			System.out.print("계속 진행하겠습니까? [y/n] : ");
			ch = sc.next().charAt(0);
			
			if(ch != 'y' && ch != 'Y') break;
		}
	}

}
