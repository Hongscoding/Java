package sub4;
/*
 * 날짜 : 2022/08/18
 * 이름 : 홍민준
 * 내용 : Java 반복문 while 실습하기
 * 
 * 
 * 
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10){
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지의 합 :"+sum);
		
		// do ~ while문
		int tot= 0;
		int i = 1;
		
		do {
			if(i % 2 ==0) {
				tot += i;
			}
			i++;
		}
		while(i<=10);
		System.out.println("1부터 10까지 짝수 합 : "+tot);
		
		// break
		int num = 1;
		
		while(true) {
			if(num % 5==0 && num % 7==0) {
				break; // 반복문 탈출
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : "+num);
		
		// continue
		int total=0;
		int j = 1;
		
		while(j<=10) {
			j++;
			
			if(j % 2 ==1) {
				continue; //continue가 실행되면 while문 맨 처음 부분부터 다시 내려옴
				
			}
			total+=j;
			
		}
		System.out.println("1부터 10까지 짝수 : "+total);
		
		
	}

}
