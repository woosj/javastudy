package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 임의의 정수 세개를 입력받아 작은 수에서 큰 수 순으로 출력하는 프로그램 작성
		 * 
		 * 첫번째 정수 : 16
		 * 두번째 정수 : 8
		 * 세번째 정수 : 21
		 * 
		 * 정렬 결과 : 8 16 21
		 * 단 , if문만 사용하여 처리하시오.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2,num3, temp;
		
		
		System.out.print("첫번째 정수 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("세번째 정수 : ");
		num3 = Integer.parseInt(br.readLine());
		
		//^ XOR 방식
		if( num1 > num2){
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;		
		}
		
		if( num1 > num3 ){
			num1 = num1 ^ num3;
			num3 = num3 ^ num1;
			num1 = num1 ^ num3;
		}
		
		if( num2 > num3 ){
			num2 = num2 ^ num3;
			num3 = num3 ^ num2;
			num2 = num2 ^ num3;
		}
		
		
		
		
		
		System.out.printf(" 정렬결과 : %d %d %d", num1, num2, num3);
		
		//if문 방식
		if( num1 > num2 ){
			temp = num1;
			num1 = num2;
			num2 = temp;
			
			if( num2 > num3 ){
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
		}else if( num1 > num3 ){
			
			temp = num1;
			num1 = num3;
			num3 = temp;
			
			if( num2 > num3 ){
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
		}else if( num2 > num3 ){
			temp = num2;
			num2 = num3;
			num3 = temp;
			
			if( num1 > num3 ){
				temp = num3;
				num3 = num1;
				num1 = temp;
			}
		
		}
		
		System.out.println();
		
		System.out.printf(" 정렬결과 : %d %d %d", num1, num2, num3);
		
	}

}
