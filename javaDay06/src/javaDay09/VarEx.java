package javaDay09;

public class VarEx {
	/*
	 * JDK 5.0 �̻󿡼� ���Ӱ� ź���� ���
	 * �̴� �޼��� ���ǽ� ���ϵ� ������ �ڷ����� '...'��� ����ϹǷ�
	 * �̸� ���� �޼��带 �����ϴµ� �ʿ��� ������ ���� �����ϰ� ������ �� ����
	 * (���������� �迭ȭ �۾��� �ڵ����� ó���� ��)
	 */
	
	public void argTest(String... n){
		for(int i=0; i < n.length; i++){
			System.out.println(n[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarEx v = new VarEx();
		
		v.argTest("Varee","Test");
		
	}

}
