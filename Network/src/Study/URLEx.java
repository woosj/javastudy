package Study;

/************************************************************************
 * URL(Uniform Resource Locator): ���ͳݿ��� ���� ������ �ڿ��� �ּҸ� ǥ���� �� �ִ� ����
 * http://www.daum.net:/80/member/mem.jsp?name=ByungJun#Content
 * protocol		host	port	path	query			reference
 ************************************************************************/

import java.io.*;
import java.net.*;

public class URLEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			
			URL url = new URL("http://www.daum.net/index.html");
			System.out.println("��������:"+url.getProtocol());
			System.out.println("ȣ��Ʈ:"+url.getHost());
			System.out.println("��Ʈ��ȣ:"+url.getPort());
			System.out.println("���:"+url.getPath());
			System.out.println("����:"+url.getFile());
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String str = null;
			
			
			while((str=br.readLine()) != null){
				
				System.out.println(str);
				
			}
			
		}catch(MalformedURLException me){
			me.printStackTrace();
		}catch(IOException io){
			io.printStackTrace();
		}
		finally
		{
			try{
				if(br != null)
					br.close();
			}catch(IOException io){
				io.printStackTrace();
			}
		}
		
		
		
		

	}

}
