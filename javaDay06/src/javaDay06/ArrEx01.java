package javaDay06;

public class ArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//내용 출력
		for(int i = 0 ; i < ch.length; i++){
			System.out.println(ch[i]);
		}
		
		for(char aa : ch){
			System.out.println(aa);
		}
	}

}
