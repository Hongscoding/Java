package Ch11Object;

//Object 클래스의 equals() 메서드 사용하기

class Student{
	int studentId;
	String studentName;
	
	
	
	@Override
	public int hashCode() {
		return studentId;
	}

	@Override //equals() 메서드 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) //재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
				return true;
			else return false;
		}
		return false;
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId +","+studentName;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; // 주소 복사
		Student studentSang = new Student(100, "이상원");
		
		//동일한 주소의 두 인스턴스 비교
		if(studentLee == studentLee2) {
			System.out.println("주소가 같다");
			
		}else {
			System.out.println("주소가 다르다");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("주소가 같다.");
			
		}else {
			System.out.println("주소가 다르다.");
			
		}
		
		//동일인이지만 인스턴스의 주소가 다른 경우
		if(studentLee == studentSang) {
			System.out.println("주소가 같다");
			
		}else {
			System.out.println("주소가 다르다");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("주소가 같다.");
			
		}else {
			System.out.println("주소가 다르다.");
			
		}
		

		System.out.println("Lee의 hashCode"+studentLee.hashCode());
		System.out.println("Sang의 hashCode"+studentSang.hashCode());
		
		System.out.println("Lee의 실제 주소값"+System.identityHashCode(studentLee));
		System.out.println("Sang의 실제 주소값"+System.identityHashCode(studentSang));
		
	
	}
	

}
