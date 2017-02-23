package javaDay15;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("1.6");
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.insert(3, "A1");
		System.out.println(sb);
		
		sb.replace(3,5, "B2");
		System.out.println(sb);
		
		sb.replace(3,8, "B2");
		System.out.println(sb);
		
		String srt = " Å×½ºÆ®    ";
		System.out.println(srt);
		//srt.replace(oldChar, newChar)
		System.out.println(srt.trim());
		
		
	}

}
