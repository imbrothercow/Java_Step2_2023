package chapter17.treeset;

import java.util.Comparator;

public class Member3 implements Comparator<Member3>{
//public class Member3 implements Comparable<Member3>{ //compareTo
	
	private int memberId;
	private String memberName;
	
	public Member3() {
		// TODO Auto-generated constructor stub
	}
	
	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}

	//물리적인 값
	@Override
	public int hashCode() {
		//memberName.hashCode() : String이므로 10진수
		//return super.hashCode(); 10진수 메모리 주소
		//return memberName.hashCode() + memberId;
		return memberId;
	}

	//빙법2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member = (Member3)obj;
			return this.memberId == member.memberId;
		}
		return super.equals(obj);
	}

	/*
	//comparable
	@Override
	public int compareTo(Member3 member) {
		
		//return (this.memberId - member.memberId); 오름차순
		return (this.memberId - member.memberId) * -1;
	}
	*/

	//comparator
	@Override
	public int compare(Member3 member1, Member3 member2) {
		return (member1.memberId - member2.memberId);
	}

	//논리 값
	/*방법1 이름과 아이디 일치
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return member.memberName.equals(memberName) && member.memberId == memberId;
		}
		return false;
	}
	*/

}
