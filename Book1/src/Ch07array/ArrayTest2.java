package Ch07array;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];
		
		data[0] = 10.0; //첫번째 인덱스에 10.0 대입
		data[1] = 20.0; //두번째 인덱스에 20.0 대입
		data[2] = 30.0; //세번째 인덱스에 30.0 대입
		
		for(int i = 0; i < data.length ; i++) {
			System.out.println(data[i]);
		}
	}

}
