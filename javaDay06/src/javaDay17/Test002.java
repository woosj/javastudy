package javaDay17;

import java.io.IOException;

/*
 * ������ �� ������ �����ڸ� �Է¹޾� ��Ģ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, Ŭ���� ������ �����Ͽ� �����ϵ��� �Ѵ�.
 * Ŭ������ : Calcaulte (�Է�, ���, ��� �޼��� ����)
 * ����Ŭ���� : Test002 ���� �޼��常 ȣ���Ͽ� ������ �� �ֵ��� �����Ͻÿ�.
 * 
 */

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calulate cal = new Calulate();
		cal.Input();
		int result = cal.cal();
		cal.disp(result);
		
		
	}

}
