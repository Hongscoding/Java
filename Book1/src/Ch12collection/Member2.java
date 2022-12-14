package Ch12collection;

import java.util.Comparator;

//comparator 인터페이스 구현하기
public class Member2 implements Comparator<Member2>{
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
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
		return memberName + " 회원님의 아이디는"+ memberId +"입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.getMemberId()) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}


	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
	
	
	
	
	
}
