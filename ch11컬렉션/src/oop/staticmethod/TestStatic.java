package oop.staticmethod;

public class TestStatic {

	public static void main(String[] args) {
		System.out.println("value : "+StaticMethod.getValue());
		
		StaticMethod.setValue("static method test");
		System.out.println("value : "+StaticMethod.getValue());
	
		StaticMethod.toUpper();
		System.out.println("value : "+StaticMethod.getValue());
	
		System.out.println("글자갯수 : "+StaticMethod.valueLength());

		StaticMethod.setChar(6, '-');
		System.out.println("value : "+StaticMethod.getValue());
		
		String result = StaticMethod.valueConcat("실습문제");
		System.out.println("result : "+result);
	}
}
