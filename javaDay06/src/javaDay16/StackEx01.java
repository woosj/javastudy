package javaDay16;

import java.util.*;

public class StackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] groupA = {"���ѹα�","�Ϻ�","�߱�","ȣ��","�����Ʈ"};
		
		//���׸� ���
		Stack<String> stack = new Stack<String>();
		
		//�迭�� �ִ� �����͵��� ���ÿ� �����Ѵ�.
		for(String n:groupA){
			stack.push(n);
		}

		//���ÿ� �ִ� �����͸� ����� ���� pop() �޼��带 �̿�
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}

}
