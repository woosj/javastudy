package member;

import java.io.IOException;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		
		Member ob = new MemberImpl();
		
		System.out.println(">>>>>>>>>>>>>>>>ȸ������<<<<<<<<<<<<<<<<<<<");
		
		while(true){
			System.out.print("\n 1.��� 2.���� 3.���� 4.�˻� 5.����Ʈ 6.���� : ");
			ch = (char)System.in.read();
			System.in.skip(2);
			
			switch(ch){
				case '1':ob.insertMember();break;
				case '2':ob.updateMember();break;
				case '3':ob.deleteMember();break;
				case '4':ob.searchMemberList();break;
				case '5':ob.listMember();break;
				case '6':System.exit(0);break;
			}
		}
	}

}
