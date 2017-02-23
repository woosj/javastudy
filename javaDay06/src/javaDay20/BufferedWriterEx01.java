package javaDay20;

import java.io.*;

public class BufferedWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("l:/files/hellow.txt");
			bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("æ»≥Á«œººø‰"+System.getProperty("line.separator"));
			bw.write("π›∞©Ω¿¥œ¥Ÿ.");
			bw.flush();
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {
			try {
				if(fw != null){
					fw.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(bw != null){
					bw.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

}
