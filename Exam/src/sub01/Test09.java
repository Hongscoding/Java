package sub01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 홍민준
 * 내용 : 자바 반복문 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		int count = 0;
		for(int i =1;i<=0;i++) {
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			
			for(int j=1; j<=-count;j++) {
				System.out.println(" ");
			}
			for(int k=1; k<=2*count-1;k++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}

}