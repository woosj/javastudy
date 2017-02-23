package javaDay20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = null;
		URLConnection urlCon = null;
		
		try {
			
			urlCon = new URL("http://www.daum.net/index.html").openConnection();
			
			//스캐너 객체를 생성
			scan = new Scanner(urlCon.getInputStream());
			scan.useDelimiter("\\z");
			String text = scan.next();
			
			System.out.println(text);
			
			scan.close();
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(scan != null) scan.close();
		}
	}

}
