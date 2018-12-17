package ch11;
import java.util.*;
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");

		System.out.println(set);
		System.out.println("range search : from "+from+" to "+to);
		System.out.println("result1 : "+set.subSet(from, to));
		//subSet()은 시작범위는 포함하지만 끝범위는 포함하지 않음
		//b와c로 시작하는 단어만 출력
		System.out.println("result2 : "+set.subSet(from, to+"zzz"));
		//to뒤에 zzz를 추가하여
		//b,c,d로 시작하는 단어 출력
	}
}
