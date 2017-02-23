package javaDay20;

import java.util.*;
import java.io.*;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		Scanner scan = null;
		
		try {
			
			//스캐너 객체를 생성
			scan = new Scanner(new File("l:/files/scan.txt"));
			
			while(scan.hasNextDouble()){
				System.out.printf("%.3f \n",scan.nextDouble());
			}
			
			scan.close();
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} finally {
			if(scan != null) scan.close();
		}
	}
	
}
