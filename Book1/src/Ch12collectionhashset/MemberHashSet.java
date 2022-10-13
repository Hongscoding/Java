package Ch12collectionhashset;

import java.util.HashSet;
import java.util.Iterator;

import Ch12collection.Member;

//HashSet 활용하기
public class MemberHashSet {
	
	//HashSet 선언
	private HashSet<Member> hashSet;
	
	//HashSet 생성
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	//HashSet에 회원추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMemver(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next(); //회원을 하나씩 가져와서
			int tempId = member.getMemberId(); //아이디 비교
			if(tempId == memberId) { //같은 아이디인 경우
				hashSet.remove(member); //회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하기 않습니다.");
		return false;
	}
	
	//모든 회원 출력
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
