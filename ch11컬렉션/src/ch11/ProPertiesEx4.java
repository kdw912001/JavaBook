package ch11;
import java.util.*;
public class ProPertiesEx4 {
	
	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		//System 클래스의 getProperties()를 호출하면
		//시스템과 관련된 속성이 저장된 Properties를 가져올 수 있다.
		System.out.println("java.version : "+sysProp.getProperty("java.version"));
		
		System.out.println("user.language : "+sysProp.getProperty("user.language"));
		
		sysProp.list(System.out);

	}

}
