package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/
 * 이름 : 홍민준
 * 내용 : 1-12 (세 자리 수) × (세 자리 수)
 * 제출할때 클래스 이름을 Main 으로 
 */

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		
		System.out.println(n*(n1%10));
		System.out.println(n*(n1%100/10));
		System.out.println(n*(n1/100));
		System.out.println(n*n1);
		sc.close();
	}

}
