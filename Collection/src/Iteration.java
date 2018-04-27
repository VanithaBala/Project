import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

import java.util.*;
public class Iteration {
	public static void main(String args[]){
	int array[]=new int[7];
	String array1[]={"vani","bala","krishna","suder","",""};
	for(String a:array1){
		System.out.println(a);
	}
	ArrayList<Long> al=new ArrayList<Long>();
	al.add(10l);
	al.add(20l);
	Iterator itr=al.iterator();
	ListIterator ltr=al.listIterator();
	while(ltr.hasNext()){
	ltr.add(301);
		System.out.println(ltr.next());
	}
	ltr.remove();
	//ltr.remove();
	while(ltr.hasPrevious()){
		System.out.println(ltr.previous());
	}
	}
}
