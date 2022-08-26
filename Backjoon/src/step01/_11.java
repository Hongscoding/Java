package step01;
/*
 * 날짜 : 2022/08/
 * 이름 : 홍민준
 * 내용 : 1-11 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값
 * 제출할때 클래스 이름을 Main 으로 
 */

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println( (A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	sc.close();
	}

}
