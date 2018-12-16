package ch11;
import java.util.*;
public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; //자르고자 하는 글자의 갯수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		System.out.println(length);
		List list = new ArrayList(length/LIMIT + 10); //크기를 약간 여유 있게 잡는다.
		// 43/10 +10=14
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) //길이가 40보다 작거나 같을 떄
				list.add(source.substring(i, i+LIMIT));
			else//길이가 40초과 시 
				list.add(source.substring(i));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
