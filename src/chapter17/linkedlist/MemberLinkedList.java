package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedList;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	//addMember
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	//removeMember
	public void removeMember(int memberId) {
		Iterator<Member> it = linkedList.iterator();
		while(it.hasNext()) {
			if(it.next().getMemberId() == memberId) {
				it.remove();
			}
		}
	}
	
	//showAllMember
	public void showAllMember() {
		Iterator<Member> it = linkedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
