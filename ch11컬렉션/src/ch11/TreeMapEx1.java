package ch11;
import java.util.*;
//TreeMap은 이진검색트리 형태로 키와 값의 쌍으로 데이터 저장
//검색과 정렬에 정합한 컬렉션 클래스

//검색에 관한 대부분의 경우 HashMap이 더 뛰어남
//범위검색이나 정렬이 필요한 경우에 TreeMap 사용
class TreeMapEx1 {

	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		TreeMap map = new TreeMap();
		
		for(int i=0; i<data.length;i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
		//Iterator을 map으로 받음
		System.out.println("=기본정렬=");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "+printBar('#',value)+" "+value);
		}
		System.out.println();
		
		//map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		Set set= map.entrySet();
		List list = new ArrayList(set); //ArrayList(Collection c)
		
		//static void sort(List list, Comparator c)
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		//TreeMap의 정렬 - 키가 오름차순 정렬
		//Collections.sort(List list, Comparator c)를 이용해서 값에 대한 내림차순 정렬
		System.out.println("=값의 크기가 큰 순서로 정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "+printBar('#',value)+" "+value);
		}
	}
	
	
	static class ValueComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;

				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();

				return  v2 - v1;
			} 
			return -1;
		}
	}	// 	static class ValueComparator implements Comparator {

	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; 
		} 

		return new String(bar); 
	} 
}
