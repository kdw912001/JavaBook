package oop.method;

public class TestRecursiveCall {

	
	public static int fectorial(int num) {
		if(num==1)
			return 1;
		else
			return num*fectorial(num-1);
	}
	public static void main(String[] args) {

		System.out.println("5! : "+fectorial(5));
	}
}
