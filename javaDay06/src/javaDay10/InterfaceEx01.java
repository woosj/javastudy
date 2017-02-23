package javaDay10;

public class InterfaceEx01 implements InterEx01 {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterEx01 it = new InterfaceEx01();
		InterfaceEx01 it2 = new InterfaceEx01();
		
		System.out.println(it.getA());
		System.out.println(it2.getA());
	}

}
