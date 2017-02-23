package javaDay15;

public class StringbufferEx02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("1234567890");
		
		//¿ë·®À»
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("12345678901234567890");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("12345678901234567890");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("123");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
