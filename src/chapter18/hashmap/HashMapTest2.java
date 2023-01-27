package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		//Map<String, Integer> 생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//팀원 데이터(성함, 학번)저장
		map.put("김병효", 20221231);
		map.put("이채윤", 20211130);
		map.put("김지성", 20201031);
		map.put("윤민주", 20201030);
		map.put("김형우", 20001010);
		map.put("김주은", 19991019);
		
		//팀원의 인원
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("[팀 인원 : "+keySet.size()+" 명]");
		while(keyIterator.hasNext()) {
			System.out.print(keyIterator.next() + " ");
		}
		System.out.println("\n");
		
		//팀장의 학번을 알아내자
		System.out.println("팀장의 학번 : " + map.get("김병효"));
		
		System.out.println();
		
		//팀원 모두의 학번을 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + "의 학번 : " + entry.getValue());
		}
	}

}
