package member;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberImpl implements Member {
	
	private List<MemberVO> lists = new ArrayList<MemberVO>();
	
	@Override
	public void insertMember() {
		// TODO Auto-generated method stub
		//ȸ���߰�
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			MemberVO rec = new MemberVO();
			
			System.out.println("\n[ȸ���߰�]....");

			System.out.print("��ȭ��ȣ[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			//��ȭ��ȣ ���� (����)���� util���� Ȯ��� ���� ����
			Pattern p = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}");
			
			//��ȭ��ȣ ������ ��Ī��Ŵ
			Matcher m = p.matcher(rec.getTel());
			
			if(!m.matches()){
				throw new Exception("��ȭ��ȣ ���� ������ ���Ͽ� �߰��� �����Ͽ����ϴ�.");
			}
			
			System.out.print("�̸� : ");
			rec.setName(br.readLine());
			
			if(rec.getName() == null || rec.getName().equals("")){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�̸��� �Է��ϼ���!!");
			}
			
			System.out.print("�ּ� : ");
			rec.setAddr(br.readLine());
			if(rec.getAddr() == null || rec.getAddr().equals("")){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�ּҸ� �Է��ϼ��� !!");
			}
			
			if(searchMember(rec) != null){
				throw new Exception("�̹� ��ϵ� �ڷ��Դϴ�.");
			}
			
			lists.add(rec);
			System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
			
		} catch (IOException ee) {
			ee.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			MemberVO rec = new MemberVO();
			
			System.out.println("\n[ȸ������]....");

			System.out.print("��ȭ��ȣ[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			System.out.print("������ �̸� : ");
			rec.setName(br.readLine());
			
			//ȸ�������� �ִ� �� Ȯ���ؼ� ������ ������ MemberVO ��ü�� ����
			MemberVO ss = searchMember(rec);
			
			if(ss == null){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�ڷᰡ ��ϵǾ� ���� �ʽ��ϴ�.");
			}
			
			lists.remove(ss);	//���� �ڷ� ����
			System.out.println("ȸ�� ���� ���� ����!!!");
			
		} catch(IOException io){
			io.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			MemberVO rec = new MemberVO();
			
			System.out.println("\n[ȸ����������]....");

			System.out.print("��ȭ��ȣ[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			System.out.print("������ �̸� : ");
			rec.setName(br.readLine());
			
			//ȸ�������� �ִ� �� Ȯ���ؼ� ������ ������ MemberVO ��ü�� ����
			MemberVO ss = searchMember(rec);
			
			if(ss == null){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�ڷᰡ ��ϵǾ� ���� �ʽ��ϴ�.");
			}
			
			//ȸ�������� ���̶����� ������ ���� �Ѵ�.
			System.out.println("\n ���ο� ��ȭ��ȣ [000-0000-0000]");
			rec.setTel(br.readLine());
			
			//��ȭ��ȣ ���� (����)���� util���� Ȯ��� ���� ����
			Pattern p = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}");
			
			//��ȭ��ȣ ������ ��Ī��Ŵ
			Matcher m = p.matcher(rec.getTel());
			
			if(!m.matches()){
				throw new Exception("��ȭ��ȣ ���� ������ ���Ͽ� �߰��� �����Ͽ����ϴ�.");
			}
			
			System.out.print("�̸� : ");
			rec.setName(br.readLine());
			
			if(rec.getName() == null || rec.getName().equals("")){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�̸��� �Է��ϼ���!!");
			}
			
			System.out.print("�ּ� : ");
			rec.setAddr(br.readLine());
			if(rec.getAddr() == null || rec.getAddr().equals("")){
				//�̸��� ���̰ų� �ʱ�ȭ �� ���
				throw new Exception("�ּҸ� �Է��ϼ��� !!");
			}
			
			if(ss != rec && searchMember(rec) != null){
				throw new Exception("�̹� ��ϵ� �ڷ��Դϴ�.");
			}
			
			lists.remove(ss);	//���� �ڷ� ����
			lists.add(rec);	//������ �ڷ� �߰�
			
		} catch(IOException io){

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void listMember() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = lists.size();
			
			System.out.println("\n[ȸ�����]");
			System.out.println("��üȸ����" + n);
			
			Comparator<MemberVO> comparator = new Comparator<MemberVO>() {
				
				@Override
				public int compare(MemberVO o1, MemberVO o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			};
			
			
			
			Collections.sort(lists,comparator);
			
			Iterator<MemberVO> it = lists.iterator();
			
			int i = 0;
			while(it.hasNext()){
				MemberVO ob = it.next();
				System.out.println(ob.toString());
				i++;
				if(n !=i && i != 0 && i%20 == 0){
					System.out.println("���� Ű�� �������� !!!!");
					br.readLine();
				}
			}
			
			/*
			
			for(MemberVO ob : lists){
				
				System.out.println(ob.toString());					
			}
			*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void searchMemberList() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name;
			
			System.out.print("\n[ȸ���˻�]");
			System.out.print("�˻��� �̸� :");
			name = br.readLine();
			
			Comparator<MemberVO> comparator = new Comparator<MemberVO>() {
				
				@Override
				public int compare(MemberVO o1, MemberVO o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			};

			Collections.sort(lists,comparator);
			
			int n = 0;
			Iterator<MemberVO> it = lists.iterator();
			while(it.hasNext()){
				
				MemberVO ob = it.next();
				if(ob.getName().startsWith(name)){
					n++;
				}
			}
			
			System.out.println("\n �˻��� ȸ���� : " + n);
			
			for(MemberVO ob : lists){
				
				if(ob.getName().startsWith(name)){
					System.out.println(ob.toString());					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public MemberVO searchMember(MemberVO rec) {
		// TODO Auto-generated method stub
		
		Iterator<MemberVO> it = lists.iterator();
		
		while(it.hasNext()){
			MemberVO ob = it.next();
			if(ob.equals(rec)){
				return rec;
			}
		}
		
		return null;
	}
}
