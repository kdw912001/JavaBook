package ch11;
import java.util.*;
public class HashSetEx4 {
//Ex3과 달리 두 인스턴스의 값이 같으면 중복 안되게 하는 예제

	public static void main(String[] args) {
		HashSet set = new HashSet();
			
		set.add("abc");
		set.add("abc");
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		//HashSet의 add메서드는 새로운 요소를 추가하기 전에 저장된 요소와 같은 것인지 판별하기 위해
		//추가하려는 요소의 equals()와 hashCode()를 호출하기 떄문에
		//equals()와 HashCode()를 목적에 맞게 오버라이딩 해야 한다.
		System.out.println(set);
	}
}
class Person2{
	String name;
	int age;
		
	Person2(String name, int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		//Person2클래에서도 두 인스턴스의 name과 age가 서로 같으면 true를 반환하도록 equals()를 오버라이딩
		
		return false;
	}
	public int hashCode() {
		return (name+age).hashCode();
		//JDK1.8부터 추가된 java.util.Objects클래스의 hash()를 이용해서 작성
		//return Objects.hash(name,age) 가능하면 이렇게 작성
	}
	public String toString() {
		return name+":"+age;
	}
}


