package Example;

import java.util.Scanner;

/*아래와 같이 배우이름과 작품을 2차원 배열로 정의한 후.

String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
	            { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
	            { "[이병헌]", "지아이조", "레드", "광해"} };

아래의 결과를 반영하는 프로그램을 작성해보자.
검색할 배우 : 김수현
[김수현]
도둑들
수상한 그녀
은밀하게 위대하게  ---> 검색이 제대로 이루어 진 경우.

검색할 배우 : ㅁ
해당배우가 존재하지 않습니다 ---> 검색이 제대로 이루어지지 않은 경우.*/

public class Actor {
	
	public static void main(String[] args) {
		
		String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
	            { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
	            { "[이병헌]", "지아이조", "레드", "광해"} };
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("검색할 배우 : ");
			String actName = s.next();
			boolean found = false;
			
			System.out.println("========================");
			
			for(int i=0; i<actor.length; i++) {
				
				if(("[" + actName + "]").equals(actor[i][0])) {
					
					for(int j=0; j<actor[i].length; j++) {
						System.out.println(actor[i][j]);
					}
					found = true;
				}
			}
			
			if(!found)
				System.out.println("해당배우가 존재하지 않습니다");
			
			System.out.println("========================");
		}
		
	}

}
