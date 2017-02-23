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
		//회원추가
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			MemberVO rec = new MemberVO();
			
			System.out.println("\n[회원추가]....");

			System.out.print("전화번호[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			//전화번호 형식 (패턴)지정 util에서 확장된 패턴 지원
			Pattern p = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}");
			
			//전화번호 형식을 매칭시킴
			Matcher m = p.matcher(rec.getTel());
			
			if(!m.matches()){
				throw new Exception("전화번호 형식 오류로 인하여 추가를 실패하였습니다.");
			}
			
			System.out.print("이름 : ");
			rec.setName(br.readLine());
			
			if(rec.getName() == null || rec.getName().equals("")){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("이름을 입력하세요!!");
			}
			
			System.out.print("주소 : ");
			rec.setAddr(br.readLine());
			if(rec.getAddr() == null || rec.getAddr().equals("")){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("주소를 입력하세요 !!");
			}
			
			if(searchMember(rec) != null){
				throw new Exception("이미 등록된 자료입니다.");
			}
			
			lists.add(rec);
			System.out.println("회원 등록이 완료되었습니다.");
			
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
			
			System.out.println("\n[회원삭제]....");

			System.out.print("전화번호[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			System.out.print("수정할 이름 : ");
			rec.setName(br.readLine());
			
			//회원정보가 있는 지 확인해서 있으면 정보를 MemberVO 객체에 저장
			MemberVO ss = searchMember(rec);
			
			if(ss == null){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("자료가 등록되어 있지 않습니다.");
			}
			
			lists.remove(ss);	//기존 자료 삭제
			System.out.println("회원 정보 삭제 성공!!!");
			
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
			
			System.out.println("\n[회원정보수정]....");

			System.out.print("전화번호[000-0000-0000] : ");
			rec.setTel(br.readLine());
			
			System.out.print("수정할 이름 : ");
			rec.setName(br.readLine());
			
			//회원정보가 있는 지 확인해서 있으면 정보를 MemberVO 객체에 저장
			MemberVO ss = searchMember(rec);
			
			if(ss == null){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("자료가 등록되어 있지 않습니다.");
			}
			
			//회원정보가 있이때문에 정보를 수정 한다.
			System.out.println("\n 새로운 전화번호 [000-0000-0000]");
			rec.setTel(br.readLine());
			
			//전화번호 형식 (패턴)지정 util에서 확장된 패턴 지원
			Pattern p = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}");
			
			//전화번호 형식을 매칭시킴
			Matcher m = p.matcher(rec.getTel());
			
			if(!m.matches()){
				throw new Exception("전화번호 형식 오류로 인하여 추가를 실패하였습니다.");
			}
			
			System.out.print("이름 : ");
			rec.setName(br.readLine());
			
			if(rec.getName() == null || rec.getName().equals("")){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("이름을 입력하세요!!");
			}
			
			System.out.print("주소 : ");
			rec.setAddr(br.readLine());
			if(rec.getAddr() == null || rec.getAddr().equals("")){
				//이름이 널이거나 초기화 된 경우
				throw new Exception("주소를 입력하세요 !!");
			}
			
			if(ss != rec && searchMember(rec) != null){
				throw new Exception("이미 등록된 자료입니다.");
			}
			
			lists.remove(ss);	//기존 자료 삭제
			lists.add(rec);	//수정된 자료 추가
			
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
			
			System.out.println("\n[회원목록]");
			System.out.println("전체회원수" + n);
			
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
					System.out.println("엔터 키를 누르세요 !!!!");
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
			
			System.out.print("\n[회원검색]");
			System.out.print("검색할 이름 :");
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
			
			System.out.println("\n 검색된 회원수 : " + n);
			
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
