package ch11;
import java.util.*;
public class HasehSetEx5 {
//HashSet에 저장된 객체들을 비교해서 합집합, 교집합, 차집합을 구함
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))//A와 B의 교집합
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))//A-B 그림 그려보기
				setCha.add(tmp);
		}
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A∩B = "+setKyo);
		System.out.println("A∪B = "+setCha);
		System.out.println("A-B = " + setCha);

	}

}
