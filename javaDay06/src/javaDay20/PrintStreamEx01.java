package javaDay20;

import java.io.*;

public class PrintStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("l:/files/hellow.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);
			
			ps.println("홍길동");
			ps.println(1234);
			ps.println(true);
			ps.println('A');
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(fos != null){
					fos.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(bos != null){
					bos.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			if(ps != null){
				//PrintStream은 예외처리하지 않음
				ps.close();
			}
			
			
		}
		
		
		
	}

}
