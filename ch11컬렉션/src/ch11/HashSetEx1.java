package ch11;
import java.util.*;
public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","4","4","4"};
		//중복된 값은 저장되지 않는다.
		//add메서드는 객체를 추가할 떄 HastSet에 이미 같은 객체가 있으면 중복으로 간주하고 저장하지 않는다.
		//'1'이 두번 출려도이었는데 둘다 '1'로 보이지만 사실 하나는 String인스턴스이고 \
		//다른 하나는 Integer인스턴스로 서로 다른 객체이므로 중복으로 간주하지 않는다.
		Set set =  new HashSet();
		
		for(int i=0; i<objArr.length;i++) {
			set.add(objArr[i]);//HashSet에 objArr의 요소들을 저장
		}
		//HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);

	}

}
