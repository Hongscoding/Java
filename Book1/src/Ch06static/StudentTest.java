package Ch06static;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialnum);
		studentLee.serialnum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentLee.serialnum);
		System.out.println(studentSon.serialnum);
	}

}
