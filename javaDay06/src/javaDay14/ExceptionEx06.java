package javaDay14;

import java.io.IOException;

public class ExceptionEx06 {
	
	private static void test() throws Exception,IOException{
		System.out.println(6/0);
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻�");
		}
	}
}
