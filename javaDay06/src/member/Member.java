package member;

public interface Member {
	
	public void insertMember();	//ȸ�� ���
	public void deleteMember();	//ȸ�� ����
	public void updateMember();	//ȸ�� ����
	public void listMember();	//ȸ�� ���
	public void searchMemberList();	//�˻��� ȸ�� ���
	
	public MemberVO searchMember(MemberVO rec);	//Ư�� ����� ����(��ü)�� ��ȯ
	
}
