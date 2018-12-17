package ch11;
import java.util.*;
public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i=0; i<score.length;i++)
			set.add(new Integer(score[i]));
		System.out.println(set);
		System.out.println("50보다 작은 값 : "+set.headSet(new Integer(50)));
		System.out.println("50보다 크거나 같은 값 : "+set.tailSet(new Integer(50)));
		//교재의 트리 그림 보기
		//headSet메서드:작은값
		//tailSet메서드 : 크거나 값은값
	}

}
