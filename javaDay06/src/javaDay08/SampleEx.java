package javaDay08;

import javaDay08.sample.SampleA;

class Sample {
	//public을 붙이지 않는다.
	//class안에 public은 하나만 선언
	//파일을 따로 하면 public 가능
	
	int x;
	int y;
	
}

class AA {
	//class A {
	//동일한 패키지 안에 클래스명이 같은 클래스파일 생성시 에러나온다.
}

public class SampleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성시 자동으로 초기값(0)을 넣어준다.
		Sample ss = new Sample();
		int t;
		
		//출력
		System.out.println(ss.y);
		System.out.println(ss.x);
		//System.out.println(t);
		

	}

}
