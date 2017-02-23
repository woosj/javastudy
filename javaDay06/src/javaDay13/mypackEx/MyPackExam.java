package javaDay13.mypackEx;

import javaDay13.mypack.Pack;
import javaDay13.mypack.PackEx;
import javaDay13.mypack.*;

public class MyPackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pack pc = new Pack();
		PackEx pce = new PackEx();
		pc.mypackOne();
		pce.mypackTwo();
		*/
		/*int j = 0;
		
		int d = 0;
		
		d = j/0;
		System.out.println(d);*/
		
		try{
			int i = 0;
			
			int s = 0;
			
			s = i/0;
			System.out.println(s);
		}catch(ArithmeticException a){
			
			a.printStackTrace();
		}
		
	}

}
