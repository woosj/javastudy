package javaDay10;

class Super {
	int a = 5;
}

class Sub extends Super {
	int a = 10;
	
	public void test(){
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class SuperEx {
	public static void main(String[] args) {
		Sub z = new Sub();
		z.test();
	}
}
