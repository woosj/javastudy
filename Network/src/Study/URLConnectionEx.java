package Study;

import java.io.*;
import java.net.*;

public class URLConnectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;

		try {

			URL url = new URL("http://java.sun.com");
			URLConnection uc = url.openConnection();					
			uc.connect();

			String str = null;

			br = new BufferedReader(new InputStreamReader(uc.getInputStream()));

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (MalformedURLException me) {
			me.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
