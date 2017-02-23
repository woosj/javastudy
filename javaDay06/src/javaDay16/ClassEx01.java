package javaDay16;

import java.util.Scanner;

//Ŭ������ �ν��Ͻ�
//�簢�� Ŭ���� ����
/*
 * �簢���� ���̿� �ѷ� ��� Ŭ������ ǥ��
 * Ŭ����		: �簢��
 * Ŭ������ �Ӽ�	: ����, ����, (����, �ѷ�, ����, ����, ����.....)
 * Ŭ������ ���	: ���̰��, �ѷ����, ����/���� �Է� ������
 * 
 * ��ü�� ����	: ������(�Ӽ�, ����) + ���(����)
 * Ŭ������ ����	: ����ʵ�(����) + �޼���
 * 
 */

//�簢�� Ŭ���� ����
class Rect{
	
	int width;	//Ŭ���� ������� ����
	int height;	//Ŭ���� ������� ����
	
	/*
	 * 
	 */
	public Rect() {
		// TODO Auto-generated constructor stub
	}
	
	public Rect(int x, int y) {
		// TODO Auto-generated constructor stub
		this.width = x;
		this.height = y;
	}
	
	//���ο� ���ΰ� �Է�
	void input(){
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		width = sc.nextInt();
		
		System.out.println("���� �Է� : ");
		height = sc.nextInt();
	}//end of inpu()
	
	//���� ���
	int area(){
		int result = this.width * this.height;
		return result;
	}
	
	int area(int x, int y){
		
		int result = x * y;
		return result;
	}
	
	//�ѷ��� ���ϴ� �޼��� ����
	int length(){
		int result;
		result = (this.width + this.height) * 2;
		return result;
	}
	
	int length(int x, int y){
		int result;
		result = (x + y) * 2;
		return result;
	}
	
	/*
	 * ����� ����ϴ� �޼��� ����
	 * 
	 * �Ű������� ���� �����͸� �Ѱܹ��� (�������� ���� ������)
	 * �޼����� �Ű������� �޼��� �������� Ȱ�� ������
	 * �Ű����� ����� ������ �������� �ڷ����� ���� �����ؾ���
	 * 
	 */
	
	void print(int a, int l){
		System.out.println("���� : " + this.width);
		System.out.println("���� : " + this.height);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}
/*
 * �ϳ��� �ڹ�����(.Java)�� �������� class�� ����� ����
 * ������ [public class]�� �ϳ��� �� �� �ִ�.
 * ������ �����Ҷ��� �̸��� [public class] �̸����� �����ؾ� �Ѵ�.
 * �Ϲ������� �ϳ��� ���Ͽ��� �ϳ��� Ŭ������ ������
 * 
 */
public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rect Ŭ���� �ν��Ͻ� ����
		Rect r = new Rect();
		
		//�Է� �޼��� ȣ��
		r.input();
		
		//����޼��� ȣ��(����,�ѷ�)
		int area = r.area();
		int length = r.length();
		
		//��� �޼��� ȣ��
		r.print(area, length);
		
	}

}
