package javaDay20;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1 and 2 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		
		sc = sc.useDelimiter("\\s *and\\s*");
		int firstToken = sc.nextInt();
		int secondToken = sc.nextInt();
		String thirdToken = sc.next();
		String fourthToken = sc.next();
		String fifthToken = sc.next();
		System.out.printf("%d, %d, %s, %s, %s",firstToken,secondToken,thirdToken,fourthToken,fifthToken);
	}

}
