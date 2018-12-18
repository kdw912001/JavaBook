package ch11;
import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		//HashMap에 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장해서 반환
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			//next()는 Object 클래스 이미 때문에 형변환
			System.out.println("이름 : "+e.getKey()+", 점수 : "+e.getValue());
		}
		set = map.keySet();
		//HashMap에 저장된 모든 키가 저장된 Set을 반환
		System.out.println("참가자 명단 : "+set);
		//참가자 명단 : [안자바, 김자바, 강자바, 이자바]
		
		Collection values = map.values();
		//HashMap에 저장된 모든 값을 컬렉션의 형태로 반환
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.min(values));
	}

}
