package javaDay16;

import java.util.*;

public class StackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] groupA = {"대한민국","일본","중국","호주","쿠웨이트"};
		
		//제네릭 방식
		Stack<String> stack = new Stack<String>();
		
		//배열에 있는 테이터들을 스택에 저장한다.
		for(String n:groupA){
			stack.push(n);
		}

		//스택에 있는 데이터를 출력할 경우는 pop() 메서드를 이용
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}

}
