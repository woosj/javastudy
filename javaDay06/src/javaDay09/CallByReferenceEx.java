package javaDay09;
//�ּ��� ���� ȣ��(Call by reference) = ����ȣ��
/*
 * �޼��� ȣ��� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��� �����
 * ���⿡�� �⺻�ڷ����� �ƴ� �Ϲ� ��ü �Ǵ� �迭�� ����
 */


public class CallByReferenceEx {
	
	public void incre(int[] n){
		for(int i = 0; i < n.length; i++){
			n[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ref[] = {100,80,90};
		CallByReferenceEx cre = new CallByReferenceEx();
		cre.incre(ref);
		
		for(int i = 0; i < ref.length; i++){
			System.out.println(ref[i]);
		}
		

	}

}
