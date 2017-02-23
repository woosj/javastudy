package javaDay03;

public class OperEx5 {
	public static void main(String[] args) {
		
		int a = 20, b = 30, max;
		
		max = a > b ? ++a:++b;
		
		System.out.println("max : " + max);
		
		if(a>b){
			++a;
		}else{
			++b;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
