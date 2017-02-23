package javaDay08;

public class MethodEx extends Method {
	
	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return super.sub(i, j)+5000 ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m = new Method();
		MethodEx m2 = new MethodEx();
		
		int i = 10;
		int j = 30;
		int k = 60;
		
		System.out.println(m.sum(i, j));
		System.out.println(m.sum(i, j,k));
		System.out.println(m.sub(i, j));
		System.out.println(m.sub(i, j));
		System.out.println(m2.sub(i, j));
		
		
	}

}
