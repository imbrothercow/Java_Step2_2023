package chapter18.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter17.treeset.Member3;


public class MemberTreeMap {
	
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, String>();
	}
	
	public void addMember(Member3 member) {
		treeMap.put(member.getMemberId(), member.getMemberName());
	}
	
	public boolean removeMember(int memberId) {
		
		while(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(treeMap.get(key));
		}
		System.out.println();
	}

}
