package Ch12colletiontreeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Comparator 인터페이스 사용하기

class MyCompare implements Comparator<String>{
	
	//내림차순으로 정렬
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
	
}


public class ComparatorTest {
	public static void main(String[] args) {
		//TreeSet 생성자의 매개변수로 정렬 방식을 지정
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}

}
