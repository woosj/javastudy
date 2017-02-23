package member;

public interface Member {
	
	public void insertMember();	//회원 등록
	public void deleteMember();	//회원 삭제
	public void updateMember();	//회원 수정
	public void listMember();	//회원 목록
	public void searchMemberList();	//검색한 회원 목록
	
	public MemberVO searchMember(MemberVO rec);	//특정 멤버의 정보(객체)를 반환
	
}
