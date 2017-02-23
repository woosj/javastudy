package review;

public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ ���� ����� ������ ���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��϶�
		 * 1. int Ÿ���� x1,y2,x2,y2 �ʵ� -> �簢���� �����ϴ� ������ ��ǥ
		 * ( ��, Ŭ������������ ������ �� ����)
		 * 2. ������2�� : default ������( ��ǥ�� x1 = 1 ,y1 = 1 , x2 = 2 , y2 = 2 )
		 *    �Ű������� x1,y1,x2,y2�� ���� �����ϴ� ������
		 * 3. void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 ��ǥ ����
		 * 4. int square() : �簢���� ���� ����
		 * 5. void show() : ��ǥ�� ���̸� ��, ���簢���� ������ ����ϴ� �޼ҵ�
		 * 6. (�߰�����) Static ���� int Ÿ���� count�� �߰�, ������ ȣ��ÿ�
		 *    �簢���� ��� ����� ������ show()���� ��� 
		 */
		
		/*��� ���

		r1�� ����
		�簢���� ��ǥ : (1,  1), (2, 2)
		�簢���� ���� : 1
		�簢�� ������� ���� : 1

		r2�� ����
		�簢���� ��ǥ : (1,  1), (3, 3)
		�簢���� ���� : 4
		�簢�� ������� ���� : 2

		����� r1�� ����
		�簢���� ��ǥ : (4,  4), (1, 1)
		�簢���� ���� : 9
		�簢�� ������� ���� : 2*/

		 
		Rectangle r1 = new Rectangle(); // default ������
		System.out.println("r1�� ����");
		r1.show();

		Rectangle r2 = new Rectangle(1,1,3,3); // �Ű����� x1, y1, x2, y2		
		System.out.println("r2�� ����");
		r2.show();
		
		r1.set(4, 4, 1, 1);
		System.out.println("����� r1�� ����");
		r1.show();


	}

}
