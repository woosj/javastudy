package javaDay15;

import java.util.*;

public class StringTokenEx01 {
	
	StringTokenizer st;
	
	public StringTokenEx01(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("str :" + str);
		st = new StringTokenizer(str);
	}
	
	public StringTokenEx01(String str, String delim) {
		// TODO Auto-generated constructor stub
		System.out.println("str :" + str);
		st = new StringTokenizer(str,delim);
	}
	
	void print(){
		System.out.println("Token count : " + st.countTokens());
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("==========================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenEx01 st1 = new StringTokenEx01("우리나라 대한민구 만세");
		st1.print();
		
		StringTokenEx01 st2 = new StringTokenEx01("2017/01/11","/");
		st2.print();
	}

}
