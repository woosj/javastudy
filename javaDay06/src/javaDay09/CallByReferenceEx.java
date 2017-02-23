package javaDay09;
//주소의 의한 호출(Call by reference) = 참조호출
/*
 * 메서드 호출시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우 사용함
 * 여기에는 기본자료형이 아닌 일반 객체 또는 배열이 속함
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
