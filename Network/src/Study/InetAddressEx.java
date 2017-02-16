package Study;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//InetAddress는 ip와 host 정보를 가지는 객체
		//InetAddress객체는 생성자가 아닌 static 메서드를 이용해서 생성함
		
		try {
			
			//ip 정보를 가진 InetAddress 객체얻기
			//InetAddress 자체가 객체
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			String ip = ipInfo1.getHostAddress(); //ip주소얻기
			System.out.println("ip주소:"+ip);
			
			System.out.println();
			
			//host 이름에 해당하는 ip정보를 가진 모든 InetAddress 객체 얻기
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			
			for(InetAddress tempip : ipArray){
				System.out.println(tempip);
			}
			
			System.out.println();
			
			//현재 컴퓨터의 ip정보를 가진 InetAddress 객체얻기
			InetAddress myHost = InetAddress.getLocalHost();
			
			System.out.println("host:"+myHost.getHostName());
			System.out.println("host ip"+myHost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		

	}

}
