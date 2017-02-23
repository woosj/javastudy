package javaDay05;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for문의 새로운 기법
		 * java5.0 이상에서만 사용가능
		 */
		
		String[] arr = {"AA","BB","CC","DD","EE","FF"};
		
		for(String s : arr){
			System.out.println(s);
		}
		
		//기존에 쓰던 방식
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
