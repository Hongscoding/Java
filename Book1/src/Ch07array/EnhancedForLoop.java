package Ch07array;
///향상된 for문 사용하기
public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java","Android","C","JavaScript","Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}

}
