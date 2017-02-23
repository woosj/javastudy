package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 문 1] 사용자로 부터 임의의 두 정수와 연산자를 입력받아 해당 연산자의 처리 결과를 출력하는 프로그램
		 *
		 *	단, if(조건문)을 활용하여 구현하도록, 연산결과는 정수형으로 할것
		 *
		 *	실행 예)
		 *	첫번째 정수 : 10
		 *	두번째 정수 : 14
		 *	연산자입력 [ + - * / ]: +
		 *
		 *	10 + 14 = 24
		 *
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, res = 0;
		char con;
		
		
		System.out.print("첫번째 정수 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자입력 [ + - * / ] : ");
		con = (char)br.read();
		
		if(con == '+'){
			res = a + b;
		}else if(con == '-'){
			res = a - b;
		}else if(con == '*'){
			res = a * b;
		}else if(con == '/'){
			res = a / b;
		}
		
		System.out.printf( " %d %c %d = %d " , a,con,b,res);
		System.out.println();
		System.out.println( a + " " + con + " " + b + " = " + res);
		
		
	}

}
