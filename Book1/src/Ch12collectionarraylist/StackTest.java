package Ch12collectionarraylist;

import java.util.ArrayList;

//스택 구현하기
class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	//스택의 맨 뒤에 요소를 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//스택의 맨 뒤에서 요소를 꺼냄
	public String pop() {
		
		//ArrayList에 저장된 유효한 자료의 개수
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		//맨 뒤에 있는 자료를 반환하고 배열에서 제거
		return(arrayStack.remove(len-1));
	}
	
}

public class StackTest {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
