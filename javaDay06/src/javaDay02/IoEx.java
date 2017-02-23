package javaDay02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String aa = "";
		aa =  in.readLine();
		System.out.println(aa);
		System.out.println(aa == "10" ? "같다":"다르다!");
		int a =10;
		System.out.println(a == 10 ? "같다":"다르다!");
	}

}
