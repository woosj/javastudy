package javaDay16;

import java.util.*;

public class StackEx02 {
	
	private static final String colors[] = {
			"����","��ȫ��","��Ȳ��","�Ķ���","���λ�","����"		
	};
	
	public StackEx02() {
		// TODO Auto-generated constructor stub
		//���׸� ���
		Stack<String> stack = new Stack<String>();
		//�迭�� �ִ� �����͵��� ���ÿ� �����Ѵ�.
		
		for(String n:colors){
			stack.push(n);
		}
		
		popStack(stack);
	}
	
	public void popStack(Stack<String> st){
		//���ÿ� �ִ� �����͸� ����� ���� pop() �޼��带 �̿�
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StackEx02();
	}

}
