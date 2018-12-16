package ch11;
import java.util.*;
public class StackQueueEx {

	public static void main(String[] args) {
		//스택과 큐를 구현하기 위해서 어떤 컬레션 클래스를 사용할지
		//순차적으로 데이터를 추가 삭제하는 스택은 ArrayList 구현
		//큐는 ArrayList보다 데이터 추가 삭제가 쉬운 LinkedList로 구현
		
		//스택과 큐의 활용 예
		//스택의 활용 예 : 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
		//큐의 활용 예 : 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue 인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");//Object push(Object item) Stack에 객체(item)을 저장
		st.push("1");
		st.push("2");
		
		q.offer("0");//boolean offer(Object o)
		q.offer("1");//Queue에 객체를 저장, 성공하면 true, 실패하면 false반환
		q.offer("2");
		
		System.out.println("=Stack=");
		//스택은 먼저 넣은 것이 나중에 꺼내지는 구조(LIFO) 넣을 떄와 반대로 꺼내짐
		while(!st.empty()) {
			System.out.println(st.pop());
			//Stack의 맨 위에 저장된 객체를 꺼낸다.(비었을 때는 EmptyStackException 발생)
		}
		
		System.out.println("=Queue=");
		//먼저넣은것이 먼저 꺼내지는 구조(FIFO) 넣을 때와 같은 순서로 꺼내짐
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			//Queue에서 객체에서 꺼내서 반환, 비어있으면 null 반환
		}

	}

}
