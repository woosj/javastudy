package javaDay04;

import java.io.IOException;

public class ForEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//������ ��� 
		
		/*int dan = 0;
		
		System.out.print("�ܼ��� �Է� :");
		dan = System.in.read() - 48;
		
		for( int i = 1 ; i <= 9 ; i++ ){
			System.out.println(dan + "*" + i + "=" + dan*i);
		}*/
		
		for( int i = 1 ; i <= 9 ; i++ ){
			for( int j = 1; j < 9; j++ ){
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		for( int i = 1 ; i <= 9 ; i++ ){
			for( int j = 2; j <= 9; j++ ){
				System.out.print(j + "*" + i + "=" + j*i);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		

	}

}
