package javaDay03;

public class OperEx6 {
	public static void main(String[] args) {
		
		int aa = -3;
		int bb,cc;
		
		bb = aa >> 3;
		cc = aa >>> 3;
		
		/*
		 * >>>:>> �⺻������ ����
		 * �׷���, ���������Ͱ� ������ ��쿡
		 * �� ��Ʈ�� 0���� ä��
		 */
		
		System.out.println(bb);
		System.out.println(cc);
		
		 byte a = -7;  // 00001010
		    byte b = 9;   // 00001001
		    byte c = 2;  //����Ʈ�� ĭ��
		    System.out.println(a + " & " + b + " = " + (a&b));  //����
		    System.out.println(a + " | " + b + " = " + (a|b));  //����
		    System.out.println(a + " ^ " + b + " = " + (a^b));  //��Ÿ�� ����(xor)
		    System.out.println("~10 = " + (~a));  //a �� ����(����)
		    System.out.println(a + " << " + c + " = " + (a<<c));  //���� 1��Ʈ ����Ʈ(�ڸ� 0 ���� ä��)
		    System.out.println(a + " >> " + c + " = " + (a>>c));  //������ 1��Ʈ ����Ʈ(���� �и����� ù°�ڸ��� ������ ��Ʈ�� ä��)
		    System.out.println(a + " >>> " + c + " = " + (a>>>c)); //������ 1��Ʈ �� ����Ʈ(���� 0 ���� ä��)
		    System.out.println(-1 * a + " >> " + c + " = " + (-1*a >> c));

		
		
	}
}
