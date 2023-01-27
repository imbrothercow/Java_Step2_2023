package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberHashSet() {
		hashSet = new HashSet<Member2>();
	}
	
	//addMember
	public void addMember(Member2 member2) {
		hashSet.add(member2);
	}
	
	//removeMember
	public void removeMember(int memberId) {
		Iterator<Member2> it = hashSet.iterator();
		while(it.hasNext()) {
			if(it.next().getMemberId() == memberId) {
				it.remove();
			}
		}
	}
	
	//showAllMember
	public void showAllMember() {
		Iterator<Member2> it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

}
