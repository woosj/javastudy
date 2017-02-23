package javaDay15;

import java.util.*;

public class StringTokenEx02 {

	/*
	 * String Ŭ������ split()�ż���� StringTokenizer �� ����
	 * 
	 * split() : �� �޼����� ��� ���ǹ��� ����(while space)�� �ڸ��� ������
	 * StringTokenizer : �� ��쿡�� ���ǹ��� ������ �����ϰ� ������
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "���������, �ƿ��, ���,, ������, ����";
		
		StringTokenizer tokens = new StringTokenizer(str,",");
		
		for(int x = 0; tokens.hasMoreTokens();x++){
			System.out.println("����" + x + ":" + tokens.nextToken() + "\t");
		}
		System.out.println("===============================================");
		
		String[] arrStr = str.split(",");
		for(int x = 0; x < arrStr.length;x++){
			System.out.println("����" + x + ":" + arrStr[x] + "\t");
		}
		System.out.println("===============================================");
		double da;
		da = Math.pow(2, 3);
		System.out.println(da);
	}

}
