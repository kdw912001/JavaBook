package oop.method;

public class Test2 {

	public static void main(String[] args) {
		NonStaticSample samp = new NonStaticSample();
		
		int[] iar = samp.intArrayAllocation(5);
		samp.display(iar);
		
		samp.swap(iar, 0, 1);
		samp.display(iar);
		
		samp.sortDescendint(iar);
		samp.display(iar);
		
		samp.sortAscendint(iar);
		samp.display(iar);
		
		System.out.println(samp.countChar("apple",'p'));
	
		System.out.println(samp.totalValue(10, 1));
		
		System.out.println(samp.pCharAt("abcddd", 1));
		
		System.out.println(samp.pConcat("aa", "bb"));
	}
}
