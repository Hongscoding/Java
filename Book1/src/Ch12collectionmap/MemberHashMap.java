package Ch12collectionmap;

import java.util.HashMap;
import java.util.Iterator;

import Ch12collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		
		//key-value 쌍으로 추가
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		//HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
		if(hashMap.containsKey(memberId)) {
			//해당 회원 삭제
			hashMap.remove(memberId);
			return  true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		//다음 key가 있으면
		while(ir.hasNext()) {
			//key 값을 가져와서
			int key = ir.next();
			//key로부터 value 가져오기
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	

}
