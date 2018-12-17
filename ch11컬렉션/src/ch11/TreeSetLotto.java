package ch11;
import java.util.*;
public class TreeSetLotto {
//TreeSet은 저장할 떄 이미 정렬하기 떄문에
//따로 정렬할 필요가 없다.
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(new Integer(num));
		}
		System.out.println(set);
	}
}
