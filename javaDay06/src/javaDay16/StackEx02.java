package javaDay16;

import java.util.*;

public class StackEx02 {
	
	private static final String colors[] = {
			"빨강","분홍색","주황색","파랑색","연두색","남색"		
	};
	
	public StackEx02() {
		// TODO Auto-generated constructor stub
		//제네릭 방식
		Stack<String> stack = new Stack<String>();
		//배열에 있는 테이터들을 스택에 저장한다.
		
		for(String n:colors){
			stack.push(n);
		}
		
		popStack(stack);
	}
	
	public void popStack(Stack<String> st){
		//스택에 있는 데이터를 출력할 경우는 pop() 메서드를 이용
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StackEx02();
	}

}
