package Ch02;

public class P65 {
	public static void main(String[] args) {
		//묵시적 형 변환
		
		byte bNum = 10;
		int iNum = bNum; // byte형 값이 int형 변수에 대입
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; //int형 값이 float형 변수로 대입
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum+iNum;
		System.out.println(dNum);
		
	}

}
