package javaDay17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto1 {
	int[] num ;
	Scanner sc = new Scanner(System.in);
	
	public Lotto1() {
		// TODO Auto-generated constructor stub
		num = new int[6];
		
	}
	
	void write(){
		sorting();
		for(int n:num)
			System.out.printf("%4d",n);
		
		System.out.println();
	}
	
	public void randNum(){
		Random r = new Random();
		
		for(int i = 0; i < 6; i++){
			num[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++){
				if(num[i] == num[j]){
					i--;
					break;
				}
			}
		}
	}
	
	public void input(){
		int n;
		do{
			System.out.print("로또 구매 개수 입력(1~5)");
			n = sc.nextInt();
		}while(n<1 || n>5);
		
		for(int i = 1; i <= n; i++){
			randNum();
			System.out.print(i + "번째:");
			write();
		}
	}
	
	public void sorting(){
		Arrays.sort(num);
	}
	
}
