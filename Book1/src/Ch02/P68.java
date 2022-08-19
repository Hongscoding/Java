package Ch02;

public class P68 {
	public static void main(String[] args) {
		//명시적 형 변환
		
		double dNum=1.2;
		float fNum= 0.9F;
		
		int iNum = (int)dNum + (int)fNum; // 두 실수가 각각 형 변환되어 더해짐
		int iNum2 = (int)(dNum+fNum); // 두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(iNum);
		System.out.println(iNum2);
		
		//강제로 형을 바꾸려면 바꿀 형을 괄호로 써서 명시해야 함

	}

}
