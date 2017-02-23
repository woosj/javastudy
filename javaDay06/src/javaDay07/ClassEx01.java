package javaDay07;

import java.util.Scanner;

class Input{
	Scanner sc = new Scanner(System.in);
	int a;
	int Input(){
		System.out.println("정수입력 :");
		a = sc.nextInt();
		return a;
	}
	
	int add(int a , int b){
		this.a = a + b;
		return this.a;
	}

}


public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		int b = in.Input();

		System.out.println(b);
		System.out.println(in.add(10, 20));
	}

}
