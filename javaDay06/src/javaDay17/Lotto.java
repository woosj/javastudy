package javaDay17;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//객체생성
	Scanner sc = new Scanner(System.in);
	int lottoeBuyCnt;
	
	//로또 구매수 입력
	void lottoBuyCnt(){
		System.out.println("로또 구매수를입력해 주세요");
		lottoeBuyCnt = sc.nextInt();
		
	}
	
	//번호 생성
	void lottoNumCreate(){
		int[][] lottoNum = new int[lottoeBuyCnt][6];
		Random ran = new Random();
		
		for(int i = 0; i < lottoeBuyCnt; i++){
			for(int j = 0; j < lottoNum[i].length; j++){
				if(lottoNumOverlap(lottoNum[i], ran.nextInt(45)+1) ){
					j--;
				}else{
					lottoNum[i][j] = ran.nextInt(45)+1;
				}
			}
		}
		
		lottoNumPrint(lottoNum);
		
	}
	
	//중복체크
	boolean lottoNumOverlap(int[] arr, int num){
		for(int j = 0; j < arr.length; j++){
			if(arr[j] == num) return true;
		}
		return false;
	}
	
	//출력
	void lottoNumPrint(int[][] arr){
		for(int i = 0; i < lottoeBuyCnt; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
