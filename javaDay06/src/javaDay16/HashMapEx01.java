package javaDay16;

import java.util.Hashtable;

public class HashMapEx01 {
	
	//Ű : ������ ���� ���� �� �� ����.(���� Ű�� ������ ��� ������ �����Ͱ� �����) null�� �ɼ� ����
	private static final String[] name = {"ȫ�浿","������","������","�̼���","�����","�տ���"};
	
	//��: ������ ���� �����ص� �����ϴ� why : key���� ���� �����Ͱ��� �ҷ����� ����
	private static final String[] tel = {"111-1111","222-2222","233-4575","111-1111","333-3333","444-4444"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		//�ؽ����̺� Ű, �� �Է� put(k,v)
		for(int i = 0; i < name.length; i++){
			ht.put(name[i], tel[i]);

		}
		//�ؽ����̺� ���� Ű�� �̿��Ͽ� �˻���
		String str = ht.get("ȫ�浿");
		
		if(str != null){
			System.out.println(str);
		}
		
		//Ű�� �����ϴ��� �˻�
		if(ht.containsKey("�̼���")){
			System.out.println("�̼��� ������");
		}else{
			System.out.println("�̼��� ���� ����");
		}
		
		//���� �����ϴ��� �˻�
		if(ht.containsValue("111-1111")){
			System.out.println("111-1111 ������");
		}else{
			System.out.println("111-1111 ���� ����");
		}
		
		//Ű�� ����
		ht.remove("�����");
		//Ű�� �����ϴ��� �˻�
		if(ht.containsKey("�����")){
			System.out.println("����� ������");
		}else{
			System.out.println("����� ���� ����");
		}
		
	}

}
