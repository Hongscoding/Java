package Ch03;

public class P81 {
	public static void main(String[] args) {
		//조건 연산자를 사용하여 부모님 나이 비교하기
		
		int fage = 45;
		int mage = 47;
		
		char ch;
		ch = (fage > mage) ? 'T' : 'F';
		
		System.out.println(ch);
		// 연산자 (조건식 ? 결과1 : 결과2)
		// 기능 조건식이 참이면 결과1, 거짓이면 결과2
		// ex) int num = (5>3) ? 10 : 20; 
		// 이 연산은 참이므로 num값은 10
	}

}
