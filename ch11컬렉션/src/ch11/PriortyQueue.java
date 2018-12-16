package ch11;
import java.util.*;
public class PriortyQueue {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		//Queue 인터페이스의 구현체 중의 하나로 저장한 순서에 관계없이 우선순위(priority)가
		//높은 것부터 꺼내게 된다는 특징이 있음. 그리고 null 저장 할수 없음.
		//null을 저장하면 NullPointerException이 발생
		pq.offer(3); //pq.offer(new Integer(3));오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		
		Object obj = null;
		
		//PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll()) !=null)
			System.out.println(obj);
		/*저장순서가 [1, 2, 5, 3, 4]  인데 출력결과는 1,2,3,4,5이다.
		 * 우선순위는 숫자가 작을수락 높으므로 1이 가장 먼저 출력 
		 * 
		 */
	}

}
