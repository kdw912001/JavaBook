package ch11;
import java.util.*;
public class VetorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");      
		print(v);   
		
		v.trimToSize(); //빈공간을 없앤다.(용량과 크기가 같아진다)
		System.out.println("===After trimToSize()===");
		print(v);//v의 빈공간을 없애서 size와 capacity를 같게 함 [1,2,3],3,3
		
		v.ensureCapacity(6);//v의 capacity가 최소한 6이 되도록 한다. v의 capacity가 6이상이라면 아무일도 일어나지 않는다
		System.out.println("===After ensureCapacity(6)===");
		print(v);//현재는 v의 capacity가 3이므로 크기가 6인 배열을 생성해서 v의 내용을 복사 [1,2,3],3,6
		
		v.setSize(7);//v의 size가 7이 되도록 한다. capacity가 충분하면 새로 인스턴스를 생성하지 않아도 됨.
		//지금은 cacpacity가 6이므로 새로운 인스턴스를 생성
		//Vector는 capacity가 부조할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가된다.
		System.out.println("===After setSize(7)===");
		print(v);
		//[1,2,3,null,null,null,null],7,12
		
		v.clear();//v의 모든 요소 삭제 
		System.out.println("===After clear()===");
		print(v);//[],0,12
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :"+v.size());
		System.out.println("capacity"+v.capacity());
	}
}
