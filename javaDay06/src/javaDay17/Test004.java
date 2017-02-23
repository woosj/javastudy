package javaDay17;

import java.util.Scanner;
import java.util.Random;

/*
 * 사용자로 부터 입력받은 정수의 개수만큼 난수를 발생시켜 배열에 담고 배열에 담겨 있는 데이터들 중 가장 큰 값과 가장 작은 값을 출력하는 프로그램을 구하시오.
 * (난수의 범위는 100) 랜덤함수 이용
 * 
 */
public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 객체생성
		Scanner sc = new Scanner(System.in);
		int num;	//입력받은 정수 저장 변수
		
		//입력 메세지 출력
		System.out.println("Input Number : ");
		num = sc.nextInt();	//정수 입력
		//난수를 입력할 배열 선언
		int[] arrNum = new int[num];
		int max = 0, min = 0;	//최대값 최소값 저장 변수

		
		//난수를 발생시켜서 배열에 저장
		for(int i = 0; i < arrNum.length; i++){
			arrNum[i] = (int)(Math.random()*100);
		}
		
		
		//배열 출력
		for(int i = 0; i < arrNum.length; i++){
			System.out.print(arrNum[i] + " ");
		}
		
		System.out.println();
		
		//최대값 최소값 저장
		for(int i = 0; i < arrNum.length-1; i++){
			if( arrNum[i] < arrNum[i+1]){
				min = arrNum[i];
			}
			
			if(arrNum[i] > arrNum[i+1]){
				max = arrNum[i];
			}
		}
		
		System.out.println("최소값:" + min + ", 최대값 : " + max);
		
	}

}
