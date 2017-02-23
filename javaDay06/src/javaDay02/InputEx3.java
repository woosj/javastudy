package javaDay02;
import java.io.*;
import java.util.*;

public class InputEx3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name;
		String nai;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("나이 입력 :");
		nai = br.readLine();
		
		System.out.println("당신의 이름은 :" + name);
		System.out.println("당신의 나이는 :" + nai);
		
		//스캐너에도 입출력이 있음
		Scanner sc = new Scanner(System.in);
		
	}

}
