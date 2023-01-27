package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//팀원들의 정보
		Member memberHyo = new Member(10001, "김병효");
		Member memberLee = new Member(10002, "이채윤");
		Member memberGee = new Member(10003, "김지성");
		Member memberYoon = new Member(10004, "윤민주");
		//회원가입 완료
		memberArrayList.addMember(memberHyo);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberGee);
		memberArrayList.addMember(memberYoon);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHyo.getMemberId());
		memberArrayList.removeMember(memberLee.getMemberId());
		memberArrayList.removeMember(memberGee.getMemberId());
		memberArrayList.removeMember(memberYoon.getMemberId());
		
		memberArrayList.showAllMember();

	}

}
