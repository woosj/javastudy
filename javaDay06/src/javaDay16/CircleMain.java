package javaDay16;
/*
 * ��]
 * ���� ���ǿ� �ѷ����ϱ�
 * ���� ���̿� �ѷ��� ���ϴ� Ŭ������ ���� �����Ͽ� �����ϰ�
 * ���ο��� �޼��� ȣ��� ���α׷��� �����Ͻÿ�.
 * 
 * 
 */

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ci = new Circle();
		
		//�Է� �޼��� ȣ��
		ci.radiusInput();
		
		//���� ���ϴ� �޼��� ȣ��
		double area = ci.circleArea();
		//�ѷ� ���ϴ� �޼��� ȣ��
		double length = ci.circleLength();
		
		//���
		ci.print(area, length);
		
	}

}
