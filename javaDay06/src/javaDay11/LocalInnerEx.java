package javaDay11;

public class LocalInnerEx {
	
	int a = 10;	//�������
	
	public void Inner(int k){
		int b = 200;	//��������
		final int c = k;	//���ȭ ��Ŵ
		
		class InnerExa{
			//�޼���ȿ� ����Ŭ������ ����
			/*
			 * ����Ŭ������ �ܺ�Ŭ������ ��������� ����鸸 ������ �����ϴ�.
			 */
			int d = 400;
			public void getData(){
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("c:"+c);
				System.out.println("d:"+d);
			}
		}
		
		//�޼��� ������ �̳�Ŭ������ ��ü ����
		InnerExa in = new InnerExa();
		in.getData();	//�ż��� ȣ��
	}//end of Inner()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerEx ll = new LocalInnerEx();
		ll.Inner(3);
	}

}
