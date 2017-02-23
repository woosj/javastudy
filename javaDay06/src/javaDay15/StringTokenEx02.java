package javaDay15;

import java.util.*;

public class StringTokenEx02 {

	/*
	 * String 클래스의 split()매서드와 StringTokenizer 의 차이
	 * 
	 * split() : 이 메서드의 경우 무의미한 공백(while space)도 자리를 차지함
	 * StringTokenizer : 이 경우에는 무의미한 공백은 무시하고 제거함
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "람보르기니, 아우디, 페라리,, 포르쉐, 링컨";
		
		StringTokenizer tokens = new StringTokenizer(str,",");
		
		for(int x = 0; tokens.hasMoreTokens();x++){
			System.out.println("문자" + x + ":" + tokens.nextToken() + "\t");
		}
		System.out.println("===============================================");
		
		String[] arrStr = str.split(",");
		for(int x = 0; x < arrStr.length;x++){
			System.out.println("문자" + x + ":" + arrStr[x] + "\t");
		}
		System.out.println("===============================================");
		double da;
		da = Math.pow(2, 3);
		System.out.println(da);
	}

}
