package javaDay02;

import java.io.*;

public class homework2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * ���� �ϳ��� �Է¹޾� �� ���ڰ� ��� ���������� �ƴ����� �Ǵ��ϴ� ���α׷��� ������.
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��� �����ڸ� �Է��ϼ���. ('+', '-', '*', '/', '%') : ");
		String str = br.readLine();
		//int num = Integer.parseInt(str);
		
		System.out.print("'" + str + "'��");
		System.out.print(" ��� ������");
		System.out.println( ("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str) || "%".equals(str)) ? "�Դϴ�.":"�� �ƴմϴ�.");
		*/
		
		System.out.print("��� �����ڸ� �Է��ϼ���. ('+', '-', '*', '/', '%') : ");
		char str = (char)System.in.read();
		System.out.print("'" + str + "'��");
		System.out.print(" ��� ������");
		System.out.println( ('+' == str || '-' == str || '*' == str || '/' == str || '%' == str ) ? "�Դϴ�.":"�� �ƴմϴ�.");
		
		System.in.read();
		System.in.read();
		
		System.out.print("��� �����ڸ� �Է��ϼ���. ('+', '-', '*', '/', '%') : ");
		char str2 = (char)System.in.read();
		System.out.print("'" + str2 + "'��");
		System.out.print(" ��� ������");
		System.out.println( ('+' == str2 || '-' == str2 || '*' == str2 || '/' == str2 || '%' == str2 ) ? "�Դϴ�.":"�� �ƴմϴ�.");
		
	}

}
