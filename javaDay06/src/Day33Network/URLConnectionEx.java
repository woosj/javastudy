package Day33Network;

import java.io.*;
import java.net.*;

public class URLConnectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		try {
			
			URL url = new URL("http://java.sun.com/");
			URLConnection uc = url.openConnection();
			uc.connect();
			
			String str = null;
			
			br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			while( (str = br.readLine()) != null ){
				System.out.println(str);
			}
			
		} catch (MalformedURLException me) {
			// TODO: handle exception
			me.printStackTrace();
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
