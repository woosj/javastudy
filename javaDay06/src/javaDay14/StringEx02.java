package javaDay14;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ String ��ü�� ���ο� ���� ���ϸ� ������ ��ü�� �����Ǵ� ���� �ƴϰ�, ���ο� ��ü�� �����ϰ� ��
		 */
		String str = new String();
		
		str += "Hellow";
		str += "java";
		System.out.println(str);
		
		String str1 = "ABC";
		char ch = str1.charAt(0);
		int l = str1.length();
		
		String so = str1.toLowerCase(); //�ҹ��� ��ȯ�޼���
		String imsi = str1.substring(1, 2);
		
		System.out.println(so);
		System.out.println(imsi);
		System.out.println(l);
		System.out.println(ch);
	}

}
