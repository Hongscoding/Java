package step01;
/*
 * 날짜 : 2022/08/
 * 이름 : 홍민준
 * 내용 : 1-10 올바른 세트가 되는 구하는 프로그램을 작성하시오.
 * 제출할때 클래스 이름을 Main 으로 1 1 2 2 2 8 
 */
import java.util.Scanner;
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int comp[]	= {1,1,2,2,2,8};
		int input[] = new int[6];
		for(int i =0; i<input.length ;i++) {
			input[i] = sc.nextInt()	;
			System.out.print(comp[i] - input[i] + " ");
		}
		sc.close();
	}

}
