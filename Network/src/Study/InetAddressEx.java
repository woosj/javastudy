package Study;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InetAddress�� ip�� host ������ ������ ��ü
		//InetAddress��ü�� �����ڰ� �ƴ� static �޼��带 �̿��ؼ� ������
		
		try {
			
			//ip ������ ���� InetAddress ��ü���
			//InetAddress ��ü�� ��ü
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			String ip = ipInfo1.getHostAddress(); //ip�ּҾ��
			System.out.println("ip�ּ�:"+ip);
			
			System.out.println();
			
			//host �̸��� �ش��ϴ� ip������ ���� ��� InetAddress ��ü ���
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			
			for(InetAddress tempip : ipArray){
				System.out.println(tempip);
			}
			
			System.out.println();
			
			//���� ��ǻ���� ip������ ���� InetAddress ��ü���
			InetAddress myHost = InetAddress.getLocalHost();
			
			System.out.println("host:"+myHost.getHostName());
			System.out.println("host ip"+myHost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		

	}

}
