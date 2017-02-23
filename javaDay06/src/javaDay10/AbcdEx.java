package javaDay10;

class AClass {
	
}

interface CInter {
	
}

class BClass extends AClass implements CInter {
	
}

public class AbcdEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//°´Ã¼»ý¼º
		BClass bp = new BClass();
		Object obj = new Object();
		
		System.out.println(bp instanceof Object); 
		System.out.println(bp instanceof AClass); 
		System.out.println(bp instanceof BClass); 
		System.out.println(bp instanceof CInter); 

	}

}
