package ch11;
import java.util.*;
public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(100000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		System.out.println("=접근시간 테스트=");
		System.out.println("ArrayList : "+access(al));
		System.out.println("LinkedList : "+access(ll));
		
		/*
		 * 두 클래스의 장점을 이용해서 조합
		 * 처음에 작업하기 전 데이터 저장할 때는 ArrayList 사용
		 * 작업할 때는 LinkedList로 데이터를 옮겨서 작업하면 좋은 효율
		 * ArrayList al = new ArrayList(100000);
		for(int i=0; i<100000;i++) al.add(i+"");
		LinkedList ll = new LinkedList(al);
		for(int i=0; i<1000;i++) ll.add(500,"X");
		위와 같이 대부분의 컬렉션 클래스들은 서로 변환이 가능한 생성자 제공
	
		 */
		ArrayList al1 = new ArrayList(10);
		for(int i=0; i<10;i++) al1.add(i+"");//ArrayList 데이터 저장
		LinkedList ll1 = new LinkedList(al1);//ArrayList 데이터를 LinkedList 로 옮김
		for(int i=0; i<3;i++) ll1.add(3,"X");
		System.out.println(al1);
		System.out.println(ll1);
	
	}
	public static void add(List list) {
		for(int i=0; i<10000; i++) list.add(i+"");
	}
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000;i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	

}
