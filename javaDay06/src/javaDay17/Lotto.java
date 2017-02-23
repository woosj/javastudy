package javaDay17;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	//��ü����
	Scanner sc = new Scanner(System.in);
	int lottoeBuyCnt;
	
	//�ζ� ���ż� �Է�
	void lottoBuyCnt(){
		System.out.println("�ζ� ���ż����Է��� �ּ���");
		lottoeBuyCnt = sc.nextInt();
		
	}
	
	//��ȣ ����
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
	
	//�ߺ�üũ
	boolean lottoNumOverlap(int[] arr, int num){
		for(int j = 0; j < arr.length; j++){
			if(arr[j] == num) return true;
		}
		return false;
	}
	
	//���
	void lottoNumPrint(int[][] arr){
		for(int i = 0; i < lottoeBuyCnt; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
