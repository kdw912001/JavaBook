package ch11;
import java.util.*;

//Stack직접 구현하기
class MyStack extends Vector{
	//Stack은 컬레션 프레임웍 이전부터 존재하던 것이기 때문에 ArrayList가 아닌 Vector로 부터
	//상속받아 구현. 
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	public Object pop() {
		Object obj = peek();
		//만일 Stack이 비어있으면 peek()메서드가 EmptyStackException을 발생시킨다.
		//마지막 요소를 삭제한다. 배열의 index가 0부터 시작하므로 1을 빼준다.
		removeElementAt(size()-1);
		return obj;
	}
	public Object peek() {
		int len = size();
		
		if(len ==0)
			throw new EmptyStackException();
		//마지막 요소를 반환한다. 배열의 index개 0부터 시작하므로 1을 빼준다.
		return elementAt(len-1);
	}
	public boolean empty() {
		return size()==0;
	}
	public int search(Object o) {
		int i=lastIndexOf(o);	//끝에서부터 객체를 찾는다.
								//반환값은 저장된 위치(배열의 index)이다.
		if(i>=0) { //객체를 찾은 경우
			return size() -i; //Stack은 맨 위에 저장된 객체의 index를 1로 정의하기 때문에
							//계산을 통해서 구한다.
			
		}
		return -1; //해당 객체를 찾지 못하면 -1을 반환한다.
	}
}

