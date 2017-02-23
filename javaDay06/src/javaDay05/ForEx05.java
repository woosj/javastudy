package javaDay05;

import java.util.Scanner;

public class ForEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 하나의 정수를 입력받은 다음 그 수만큼 3의 배수를 출력하는 프로그램 작성
		 * 
		 * 5가 입력되면 3 6 9 12 15
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = 0, total = 1;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print((i * 3) + " ");
		}
		
	}

}
