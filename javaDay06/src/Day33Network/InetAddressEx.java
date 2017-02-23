package Day33Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InetAddress�� ip�� host ������ ������ ��ü
		//InetAddress��ü�� �����ڰ� �ƴ� static �޼��带 �̿��ؼ� ������
		
		try {
			//ip������ ���� InetAddress ��ü ���
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			//ip�ּ� ���
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip �ּ�:" + ip);
			
			//host�̸��� �ش��ϴ� ip������ ���� ��� InetAddress ��ü ���
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for(InetAddress tempip : ipArray){
				System.out.println(tempip);
			}
			
			//���� ��ǻ���� ip������ ���� InetAddress ��ü ���
			InetAddress myHost = InetAddress.getLocalHost();
			
			System.out.println("host : " + myHost.getHostName());
			System.out.println("host ip : " + myHost.getHostAddress());
					
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
