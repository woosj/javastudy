package javaDay09;

public class OverloadingEx01 {
	
	public void intLength(int a){
		String s = String.valueOf(a);
		System.out.println(s);
		System.out.println(s.length());
	}
	
	public void floatLength(float f){
		String s = String.valueOf(f);
		System.out.println(s);
		System.out.println(s.length());
	}
	
	public void stringLength(String str){
		System.out.println(str);
		System.out.println(str.length());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx01 vd = new OverloadingEx01();
		vd.intLength(100);
		vd.floatLength(3.14f);
	}

}
