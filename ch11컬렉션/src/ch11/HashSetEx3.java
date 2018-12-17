package ch11;

import java.util.*;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		//Person 클래스는 name과 age를 멤버변수로 갖는다.
		//이름(name)과 나이(age)가 같으면 같은 사람으로 인식
		//두 인스턴스의 name과 age의 값이 같음에도 불구하고 서로 다른 것으로 인식
		
		System.out.println(set);
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
}
