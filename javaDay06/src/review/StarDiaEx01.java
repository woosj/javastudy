package review;

import java.util.Scanner;

public class StarDiaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for�� ���ǹ� ����
		 * ���� �Է¹ް� , �Ѻ��� ���̰� �Է��� ���� ������ ������ ����Ͻÿ�.
		 * ��, �������� ���� ��� �־�� �ϰ�, 0 �Է½� ����
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		
		do{
			System.out.println("���ڸ� �Է��Ͻÿ�.");
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
