package Day33Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InetAddress는 ip와 host 정보를 가지는 객체
		//InetAddress객체는 생성자가 아닌 static 메서드를 이용해서 생성함
		
		try {
			//ip정보를 가진 InetAddress 객체 얻기
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			//ip주소 얻기
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip 주소:" + ip);
			
			//host이름에 해당하는 ip정보를 가진 모든 InetAddress 객체 얻기
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			for(InetAddress tempip : ipArray){
				System.out.println(tempip);
			}
			
			//현재 컴퓨터의 ip정보를 가진 InetAddress 객체 얻기
			InetAddress myHost = InetAddress.getLocalHost();
			
			System.out.println("host : " + myHost.getHostName());
			System.out.println("host ip : " + myHost.getHostAddress());
					
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
