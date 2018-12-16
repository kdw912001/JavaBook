package oop.method;

public class NonStaticSample {
	public NonStaticSample() {}
	
	public int[] intArrayAllocation(int length) {
		int[] ar = new int[length];
		
		for(int i=0; i<ar.length;i++) {
			ar[i] = (int)(Math.random()*100)+1;
		}
		
		return ar;
	}
	
	public void display(int[] par) {
		System.out.print("배열 값들 : ");
		for(int i=0; i<par.length;i++) {
			System.out.print(par[i]+"  ");
		}
		System.out.println();
	}
	
	public void swap(int[]ar,int i, int j) {
		int tmp = ar[i];
		ar[i]=ar[j];
		ar[j]=tmp;
	}
	
	public void sortDescendint(int[]ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j])
					swap(ar,i,j);
			}
		}
	}
	
	public void sortAscendint(int[] ar) {
		for(int i=0; i<ar.length-1;i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[i]>ar[j])
					swap(ar,i,j);
			}
		}
	}
	
	public int countChar(String str, char ch) {
		int count=0;
		
		if(str!=null&& str.length()>0) {
			int i=0;
			while(i<str.length()) {
				if(str.charAt(i)==ch)
					count++;
				i++;
			}
		}
		return count;
	}
	
	public int totalValue(int first, int second) {
		int sum=0;
		for(int k=Math.min(first, second);k<=Math.max(first, second);k++) {
			sum +=k;
		}
		return sum;
	}
	
	public char pCharAt(String s, int index) {
		char ch = '\u0000';
		if(s!=null && s.length()>0) {
			char[] arr= s.toCharArray();
			ch=arr[index];
		}
		
		return ch;
	}
	public String pConcat(String s1, String s2) {
		return s1+s2;
	}
	
}
