package review;

import java.util.Scanner;

public class StarDiaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for문 조건문 문제
		 * 수를 입력받고 , 한변의 길이가 입력한 수의 길이인 마름모를 출력하시오.
		 * 단, 마름모의 속은 비워 있어야 하고, 0 입력시 종료
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		
		do{
			System.out.println("숫자를 입력하시오.");
			num = sc.nextInt();
			
			if(num == 0) break;
			int max = num*2 - 3;
			for(int i = 0; i < num*2-1; i++){
				if(i > num){
					max--;
				}
				
				for(int j = 0; j < num*2-1; j++){
					if(i < num){
						if(j== (num-1-i) || j == (num-1+i)){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}						
					}else{						
						if(j == (i-num+1) || j == max){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
				}
				
				System.out.println();
			}
		}while(true);
		
		
		
	}

}
