package javaDay02;

public class CharEx {
	public static void main(String[] args) {
		/*
		 * char �� �̱����ͻ�� ('')
		 * String �� �������ͻ�� ("")
		 * \\u �� �����ڵ带 �ǹ�
		 */
		char ch1 = 'A';
		String str = "hello";
		char ch2 = '\u0041';
		System.out.println("ch1 + ch2 : " + ch1 + ch2);
		//����� ������ ��� ���ڷ� ������
		System.out.println("ch1 + ch2 : " + (ch1 + ch2) );
		//�ƽ�Ű�ڵ尪���� ����		
		System.out.println("ch1 + ch2 : " + (char)(ch1 + ch2) );
		
	}
}
