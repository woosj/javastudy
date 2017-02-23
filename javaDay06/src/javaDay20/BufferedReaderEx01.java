package javaDay20;

import java.io.*;

public class BufferedReaderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("l:/files/hellow.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			//한 라인씩 읽어들인 문자열 저장할 변수 선언
			String str = null;
			
			//readLine() 개행문자를 만나면 개행 문자 이전까지의 문자열을 반환하고 
			//스트림의 끝에 도달하면 null을 반환함
			
			while( (str = br.readLine() ) != null ){
				System.out.println(str);
			}
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(fis != null){
					fis.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(isr != null){
					isr.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(br != null){
					br.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

}
