package ch11;

import java.util.*;

public class HashSetLotto {
//중복된 값은 저장되지 않는 HashSet의 성질을 이용해서 로또번호를 만드는 예제
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set); //LinkedList(Collection c)
		Collections.sort(list);	//Collections.sort(List list)
		//번호를 크기순으로 정렬하기 위해서 Collections클래스의 sort(List list)를 사용
		System.out.println(list);
			
	}

}
