package javaDay08;

public class Method {
	
	/*
	 * 사칙연산에 관한 클래스
	 */
	
	//더하기
	public int sum(int i, int j){
		return i+j;
	}
	//overloading
	public int sum(int i, int j, int k){
		return i+j+k;
	}
	
	//빼기
	public int sub(int i, int j) {
		return i -j;
	}
	
	//나누기
	public int div(int i, int j) {
		return i /j;
	}
	
	//곱하기
	public int com(int i, int j) {
		return i *j;
	}
}
