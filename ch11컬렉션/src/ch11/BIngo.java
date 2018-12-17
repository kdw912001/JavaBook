package ch11;

import java.util.*;

public class BIngo {

	public static void main(String[] args) {
		Set set = new HashSet();
//		Set set = new LinkedHashSet();
//몇 번 실행해보면 같은 숫자가 비슷한 위치에 나온다는 사실을 발견할 수 있는데 
//HashSet은 저장된 순서를 보장하지 않고 자체적인 저장방식에 따라 순서가 결정됨.
//이 경우에는 HashSet보다 LinkedHashSet이 더 나은 선택
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25;i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		Iterator it = set.iterator();
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board[i].length;j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j]<10?"  ":" ")+board[i][j]);
			}
			System.out.println();
		}
	}//main
}
