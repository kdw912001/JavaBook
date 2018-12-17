package ch11;
import java.util.*;
//ArrayList 카피 및 Iterator의 remove()사용
public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10;i++) {
			original.add(i+"");
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext())
			copy1.add(it.next());
		
		System.out.println("= Original에서 copy1로 복사(copy) =");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		
		it = original.iterator(); //Iterator는 재상이 안되므로, 다시 얻어와야한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
			//Iterator의 remove()는 단독으로 쓰일 수 없고, next()와 같이 써야한다.
			//next()의 호출 없이 remove()를 호출하면 IllegalStateException 이 발생한다.
		}
		System.out.println("=Original에서 copy2로 이동(move) = ");
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);
	}
}
