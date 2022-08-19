package Ch03;

public class P78 {
	public static void main(String[] args) {
		// 단락 회로 평가 실습하기
		
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10)<10) && ((i= i+2)<10); // 논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음(i 연산식)
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		value = ((num = num + 10)>10) || ((i=i*2)<10); // 논리 합에서 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않음(i 연산식)
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
	}

}
