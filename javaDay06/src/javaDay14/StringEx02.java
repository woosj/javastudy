package javaDay14;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 기존의 String 객체에 새로운 값이 더하면 기존의 객체가 수정되는 것이 아니고, 새로운 객체를 참조하게 됨
		 */
		String str = new String();
		
		str += "Hellow";
		str += "java";
		System.out.println(str);
		
		String str1 = "ABC";
		char ch = str1.charAt(0);
		int l = str1.length();
		
		String so = str1.toLowerCase(); //소문자 변환메서드
		String imsi = str1.substring(1, 2);
		
		System.out.println(so);
		System.out.println(imsi);
		System.out.println(l);
		System.out.println(ch);
	}

}
