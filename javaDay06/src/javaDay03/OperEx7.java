package javaDay03;

public class OperEx7 {
	public static void main(String[] args) {
		//배정연산자, 대입연산자
		
		int a = 10;
		int res = 0;
		
		res += a;	//res = res + a;
		System.out.println("res = " + res);
		res *= a;
		System.out.println("res = " + res);		
		res /= a;
		System.out.println("res = " + res);
		res %= a;
		System.out.println("res = " + res);
	}
}
