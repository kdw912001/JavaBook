package ch11;
import java.util.*;
//HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로 Hashtable은 키와 값을 (Object, Object)의 형태로 저장
//Properties는 (String, String)의 형태로 저장
//Properties는 Hashtable을 상속받아 구현한 것이라 Map의 특성상 저장순서를 유지하지 않음
//고로 출력된 순서가 저장순서와는 무관.
//list메서드를 이용하면 Properties에 저장된 모든 데이터를 화면 또는 파일에 편리하게 출력
public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//prop에 키와 값(key, value)를 젖아한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+prop.getProperty(element));
		}
		System.out.println();
		prop.setProperty("size", "20");//size의 값을 20으로 변경
		System.out.println("size="+prop.getProperty("size"));
		System.out.println("capacity="+prop.getProperty("capacity", "20"));
		System.out.println("loadfactor="+prop.getProperty("loadfactor", "0.75"));
		//getProperty()는 Properties에 저장된 값을 읽어오는 일을 하는데 만일 읽어오려는
		//키가 존재하지 않으면 지정된 기본값(defaultValue)을 반환한다.
		
		System.out.println(prop);//prop에 저장된 요소들을 출력한다.
		prop.list(System.out);//prop에 저장된 요소들을 화면(System.out)에 출력한다.
	}

}
