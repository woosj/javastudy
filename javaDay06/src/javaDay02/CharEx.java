package javaDay02;

public class CharEx {
	public static void main(String[] args) {
		/*
		 * char 는 싱글쿼터사용 ('')
		 * String 은 더블쿼터사용 ("")
		 * \\u 는 유니코드를 의미
		 */
		char ch1 = 'A';
		String str = "hello";
		char ch2 = '\u0041';
		System.out.println("ch1 + ch2 : " + ch1 + ch2);
		//계산이 가능할 경우 숫자로 변경함
		System.out.println("ch1 + ch2 : " + (ch1 + ch2) );
		//아스키코드값으로 변경		
		System.out.println("ch1 + ch2 : " + (char)(ch1 + ch2) );
		
	}
}
