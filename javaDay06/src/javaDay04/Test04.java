package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * ����ڷκ��� ���ĺ� �ѹ��ڸ� �Է¹޾� �빮�ڿ� �ҹ��ڸ� �Ǻ��ϴ� ���α׷��� �ۼ�
		 * �빮�� -> �ҹ���
		 * �ҹ��� -> �빮��
		 * ��, br.readLine()�żҵ带 ���
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ĺ��� �Է��ϼ��� : ");		
		String str = br.readLine();
		char ch = str.charAt(0);
		int n = 32;
		
		//if( ch >= '97' && ch <= '122' ){
		if( ch >= 'a' && ch <= 'z' ){
			System.out.print("�ҹ��� -> �빮�� : ");
			System.out.println((char)(ch - n));
		}else if( ch >= 'A' && ch <= 'Z' ){
			System.out.print("�ҹ��� -> �빮�� : ");
			System.out.println((char)(ch + n));
		}else{
			
			System.out.println("���ĺ� ���ڰ� �ƴմϴ�.");
		}
		
		
	}

}
