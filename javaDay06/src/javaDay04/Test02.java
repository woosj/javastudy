package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		 * ����ڷ� ���� ������ ���� ������ �Է¹޾� ���� ������ ū �� ������ ����ϴ� ���α׷� �ۼ�
		 * 
		 * ù��° ���� : 16
		 * �ι�° ���� : 8
		 * ����° ���� : 21
		 * 
		 * ���� ��� : 8 16 21
		 * �� , if���� ����Ͽ� ó���Ͻÿ�.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2,num3, temp;
		
		
		System.out.print("ù��° ���� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("����° ���� : ");
		num3 = Integer.parseInt(br.readLine());
		
		//^ XOR ���
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
		
		
		
		
		
		System.out.printf(" ���İ�� : %d %d %d", num1, num2, num3);
		
		//if�� ���
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
		
		System.out.printf(" ���İ�� : %d %d %d", num1, num2, num3);
		
	}

}
