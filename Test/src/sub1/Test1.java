package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/30
 * 이름 : 홍민준
 * 내용 : 2022/08/30 정기 수행평가 
 * 
 */

public class Test1 {
	public static void main(String[] args) {
		
		//문제 1번 - 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//입력 조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
		//출력 조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int start=1; start<=a; start++) {
			
			for(int end=1; end<=start; end++) {
				System.out.print("☆");
			
			}
			
			System.out.print("\n"); // 개행(줄바꿈)
		}
		
		//문제 2번 - 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 단, 오른쪽 기준으로 정렬
		//입력 조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
		//출력 조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		Scanner sd= new Scanner(System.in);
		
		int b = sd.nextInt();
		for(int start=0; start<b; start++) {
			for(int j=1 ; j<b-start ; j++) {
				System.out.print(" ");
			}
			for(int end=0; end<start+1; end++) {
				System.out.print("☆");
			
			}
			
			System.out.print("\n"); // 개행(줄바꿈)
		}
		System.out.print("\n"); // 개행(줄바꿈)
		
		//문제 3번 - ★
		
		//3-1
		int m = 5;
		for(int start=0; start<m; start++) {
			for(int j=1 ; j<m-start ; j++) {
				System.out.print("☆");
			}
			for(int end=0; end<start+1; end++) {
				System.out.print("★");
			
			}
			
			System.out.print("\n"); // 개행(줄바꿈)
		}
		System.out.print("\n"); // 개행(줄바꿈)
		
		//3-2
		int n =4;
		
		for(int i =0 ; i<n ; i++) {
			for(int j=n-1 ; j>i ; j--) {
				System.out.print("☆");
			}
		    for(int j=0 ; j<2 * i + 1 ; j++) {
		    	System.out.print("★");
		    }
		    for(int j=n-1 ; j>i ; j--) {
				System.out.print("☆");
			}
		    System.out.print("\n");
		    
		}
		
		
		
		
		
		
 }
}


