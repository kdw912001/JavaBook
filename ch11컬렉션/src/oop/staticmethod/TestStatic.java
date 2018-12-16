package oop.staticmethod;

public class TestStatic {

	public static void main(String[] args) {
		System.out.println("value : "+StaticMethod.getValue());
		
		StaticMethod.setValue("static method test");
		System.out.println("value : "+StaticMethod.getValue());
	
		StaticMethod.toUpper();
		System.out.println("value : "+StaticMethod.getValue());
	
		System.out.println("���ڰ��� : "+StaticMethod.valueLength());

		StaticMethod.setChar(6, '-');
		System.out.println("value : "+StaticMethod.getValue());
		
		String result = StaticMethod.valueConcat("�ǽ�����");
		System.out.println("result : "+result);
	}
}
