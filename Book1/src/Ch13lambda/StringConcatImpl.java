package Ch13lambda;


//추상 메서드 구현하기
public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+","+s2);
		
	}
	

}
