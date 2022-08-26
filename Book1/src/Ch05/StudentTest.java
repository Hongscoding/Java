package Ch05;

public class StudentTest {
//p167 나 혼자 코딩 하기
	public static void main(String[] args) {
		Student studentAhn = new Student();
		//studentAhn.studentName = "안승연";
		
		studentAhn.setStudentName("안승연");
		
		System.out.println(studentAhn.getStudentName());
	}

}
