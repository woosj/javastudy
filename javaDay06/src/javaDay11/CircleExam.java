package javaDay11;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü = �ν��Ͻ� ����
		Circle cir = new Circle();
		
		//������ �Է� �޼��� ȣ��
		cir.input();
		
		//���� ���̸� ���ϴ� �޼��� ȣ��
		double square = cir.Circle_Square();
		
		//���� �ѷ��� ���ϴ� �޼��� ȣ��
		double length = cir.Circle_length();
		
		//��� �޼��� ȣ��
		cir.Print(square, length);
		
	}

}
