import java.util.LinkedList;

public class LinkedListEx {
public static void main(String args[]){
	LinkedList<Double> l1=new LinkedList<Double>();
	LinkedList l2=new LinkedList();
	l2.add("vani");
	l2.add("pradeep");
	l2.add("suder");
	l1.add(34d);
	l1.add(54.3);
	System.out.println(l1.addAll(l2)+" "+l1);
	System.out.println(l1.peek());
	System.out.println(l1.poll());
	

	
}
}
