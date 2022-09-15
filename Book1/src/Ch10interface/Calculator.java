package Ch10interface;

//인터페이스 구현하기
public abstract class Calculator implements Calc{
	
	//추상메서드 times()와 divide()를 구현하지 않아서 추상 클래스임
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2 ;
	}


}
