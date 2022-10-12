package Ch15stream.others;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("직업 : "); //문자열을 읽는 nextLine() 메서드로 이름과 직업 입력받음
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt(); //int형을 읽는 nextInt() 메서드로 사번을 입력받음
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}

}
