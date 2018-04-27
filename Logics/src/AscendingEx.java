import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class AscendingEx {
	public static void main(String args[]){
		int x[]={8,3,9,1,6};
		int i,j,temp;
		// Array Ascending using Arrays.sort() function 
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		// without method
		
		for(i=0;i<x.length;i++){
			for(j=i+1;j<x.length;j++){
			if(x[i]>x[j]){	
				temp=x[i];					//Integer array
				x[i]=x[j];
				x[j]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(x));
		
		// String ascending 
		String y[]={"vani","ani","bala"};
		String ch=y.toString();
		char[] ar=ch.toCharArray();
	
		//System.out.printl);
		// another method
		TreeSet<String> ts=new TreeSet<>();
		for(i=0;i<y.length;i++){
			ts.add(y[i]);
		}
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}
		
	}
