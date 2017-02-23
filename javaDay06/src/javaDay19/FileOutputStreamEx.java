package javaDay19;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			
			
			fos = new FileOutputStream("l:\\files\\write.txt");
			String message = "우리나라 어찌하면 좋겟는가 나는 어디로 취업이 될것인가.";
			
			fos.write(message.getBytes());
			fos.close();
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				
			} catch (IOException e) {
				// TODO: handle exception
			}
			
		}
	}

}
