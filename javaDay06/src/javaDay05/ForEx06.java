package javaDay05;

import java.util.Scanner;

public class ForEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음과 같이 메뉴를 출력하는 프로그램을 작성하고, 선택한 메뉴에 따라 합계를 출력하는 프로그램을 작성하시오.
		 * 정수의 범위는 1 ~ 1000 까지
		 * 1. 정수의 합
		 * 2. 짝수의 합
		 * 3. 홀수의 합
		 * 4. 종료
		 * 
		 * 선택 --> 1
		 */
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int num = 0;
		
		while(true){
			System.out.println("1. 정수의 합");
			System.out.println("2. 짝수의 합");
			System.out.println("3. 홀수의 합");
			System.out.println("4. 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
			int i = 0;
			int total = 0;
			
			//종료 선택시 종료된다.
			if(menu == 4) break;
			
			//범위의 점수만 입력받게한다.
			do{
				System.out.print("정수 입력(1 ~1000) : ");
				num = sc.nextInt();
			}while(num < 1 || num > 1000 );
			
			//합을 구하는 반복문
			do{
				
				if(menu == 2){
					if(i%2 != 0) {
						i++;
						continue;
					}
				}else if(menu == 3){
					if(i%2 == 0){
						i++;
						continue;
					}
				}
				
				total +=i;
				i++;
				
				
			}while( i <= num );
			
			System.out.println("선택메뉴 -> " + menu);
			System.out.println("결과값 : " + total);
		}
		
		/*do{
			System.out.println("1. 정수의 합");
			System.out.println("2. 짝수의 합");
			System.out.println("3. 홀수의 합");
			System.out.println("4. 종료");
			System.out.print("메뉴를 입력하세요 : ");
			
		}while(menu != 4);*/

	}

}
