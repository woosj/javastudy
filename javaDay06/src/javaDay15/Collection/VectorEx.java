package javaDay15.Collection;

import java.util.*;

/*
 * Vector : ���� ������ �Է� �ޱ�
 * �ݵ�� import java.util.*; �����ؾ���
 * 
 * Object�� ���ѹ迭�� �߰����� ������ Ŭ���� ������ ȿ�����̴�.
 * 
 */

class AA {
	
	int a;
	public AA(int a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
}


public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<AA> ve = new Vector<AA>();
		
		ve.add(new AA(10));
		ve.add(new AA(20));
		ve.add(new AA(30));
		ve.add(new AA(40));
		ve.add(new AA(50));
		ve.add(new AA(60));
		ve.add(new AA(70));
		
		for(int i = 0; i < ve.size(); i++){
			AA aa = (AA)ve.elementAt(i);
			System.out.println(aa.a);
		}
		
		ve.remove(4);
		for(int i = 0; i < ve.size(); i++){
			AA aa = (AA)ve.elementAt(i);
			System.out.println(aa.a);
		}

	}

}
