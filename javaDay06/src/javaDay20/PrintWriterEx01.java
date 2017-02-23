package javaDay20;

import java.io.*;

public class PrintWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream("l:/files/printWriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			
			pw.println("안녕하세요");
			pw.println("네");
			pw.println();
			pw.println("안녕하세요");
			pw.println("아니요");
			pw.println(100.0);
			pw.println(true);
			
			pw.flush();
			
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
			
			if(pw != null){
				//PrintStream은 예외처리하지 않음
				pw.close();
			}
			
			
		}

	}

}
