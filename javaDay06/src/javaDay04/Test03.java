package javaDay04;

import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����ڷ� ���� ������ ���ĺ� �ѹ��ڸ� �Է¹޾� �̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸 ����� ����ϴ� ���α׷��� �����Ͻÿ�.
		 * ��, ��ҹ��� ��� ������ �� �ֵ��� ���� ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ��� ����ó�� �� �� �ֵ���
		 * a e i o u
		 */
		System.out.print("���ĺ��� �Է��ϼ��� : ");
		char ch = (char)System.in.read();

		if( (ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z') ){
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				System.out.println(ch);
			}else if( ch == 'A' || ch == 'B' || ch == 'I' || ch == 'O' || ch == 'U' ){
				System.out.println(ch);
			}else{
				System.out.println("������ �ƴմϴ�.");
			}
			
			
			
		}else{
			
			System.out.println("���ĺ� ���ڰ� �ƴմϴ�.");
		}
	}

}
