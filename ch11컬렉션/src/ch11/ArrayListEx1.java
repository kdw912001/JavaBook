package ch11;
import java.util.*;
public class ArrayListEx1 {

	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));//순서대로 값 입력
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));//420
		print(list1, list2);
		//list1:[5,4,2,0,1,3] list2:[4, 2, 0]
		
		System.out.println("list1.containAll(list2): "+list1.containsAll(list2));
		//list1이 list2의 모든 요소를 담고 있는지
		
		list2.add("B");
		list2.add("C");
		
		list2.add(3,"A");
		print(list1,list2);//list1:[5, 4, 2, 0, 1, 3] list2:[4, 2, 0, A, B, C]
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2) :"+list1.retainAll(list2));//true
		
		print(list1, list2);//list1:[4, 2, 0] list2:[4, 2, 0, A, B, C]
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);//list1:[4, 2, 0] list2:[A, B, C]
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
