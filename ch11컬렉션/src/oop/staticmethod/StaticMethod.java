package oop.staticmethod;

public class StaticMethod {
	private static String value = "test";
	
	public static void setValue(String v) {
		value = v;
	}
	
	public static String getValue() {
		return value;
	}
	
	public static void toUpper() {
		char[] carr = value.toCharArray();
		
		for(int i=0; i<carr.length;i++) {
			if(carr[i]>=97&&carr[i]<=122)
				carr[i]-=32;
		}
		value = String.valueOf(carr);
	}
	
	public static void setChar(int index, char ch) {
		char[] carr = value.toCharArray();
		carr[index] = ch;
		value = String.valueOf(carr);
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String s) {
		return value+s;
	}
}
