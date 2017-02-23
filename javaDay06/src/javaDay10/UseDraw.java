package javaDay10;

abstract class Diagram {//�߻� Ŭ����
	
	abstract void draw();	//�߻�޼ҵ� �ݵ�� �ϳ��� �����ؾ���
	/*
	 * private �� ������ �� ���� 
	 * ���� : �ڽ��� �������̵� �ؾ��ϴµ� ���ϱ� ���� 
	 * 
	 * static ���� ������ �� ���� ����
	 * ��ü ���̵� ȣ���� �Ǵ� �޼����̹Ƿ� �ݵ�� ��ü�� ���ǵǾ�� 
	 * Ŭ����.�޼���() �������� ȣ���
	 *
	 */
	
}

class Triangle extends Diagram {
	//�߻�Ŭ������ ��ӹ޾��� ��� ������ �������̵��� �ؾ��Ѵ�.
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���.");
		
	}
}

class Rectangle extends Diagram {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���.");
		
	}
}

class Circle extends Diagram {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���.");
		
	}
}

public class UseDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram[] ref = new Diagram[3];
		ref[0] = new Triangle();
		ref[1] = new Rectangle();
		ref[2] = new Circle();
		
		for(int i = 0; i < ref.length; i++){
			ref[i].draw();
		}
	}

}
