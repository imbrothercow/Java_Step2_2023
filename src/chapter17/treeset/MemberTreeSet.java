package chapter17.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member3> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member3>(new Member3()); //comparator로 정렬 시 반드시 생성자 명시함
	}
	
	public void addMember(Member3 member) {
		treeSet.add(member);
	}
	
	public void removeMember(int memberId) {
		
		Iterator<Member3> it = treeSet.iterator();
		while(it.hasNext()) {
			if(it.next().getMemberId() == memberId) {
				it.remove();
			}
		}
		
	}
	
	public void showAllMember() {
		Iterator<Member3> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
	

}
