package javaDay17;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char['Z'-65+1];
		char str = 'A';
		
		/*for(int i = 0; i < ch.length; i++){
			ch[i] = str;
			str++;
		}*/
		
		for(char i = 'A'; i <= 'Z'; i++){
			ch[i-65] = str;
			str++;
		}
		
		for(int i = 0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}

}
