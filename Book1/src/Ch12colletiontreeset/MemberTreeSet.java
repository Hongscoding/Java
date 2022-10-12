package Ch12colletiontreeset;

import java.util.Iterator;
import java.util.TreeSet;

import Ch12collection.Member;

//TreeSet 활용하기
public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	//TreeSet에 회원을 추가하는 메서드
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//TreeSet에서 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	

}
