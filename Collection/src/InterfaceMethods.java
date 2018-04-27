import java.util.ArrayList;
import java.util.LinkedList;

public class InterfaceMethods {
public static void main(String args[]){
	ArrayList a1=new ArrayList<>();
	a1.add("element1");
	a1.add(123);
	a1.add(87.43);
	System.out.println(a1);
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("element2 2");
	a2.add("element3 2");
	System.out.println(a2);
	a1.addAll(a2);
	System.out.println(a1);
	a1.remove("");
	//System.out.println(a1.removeAll(a2));
	//System.out.println(a1);
	//a1.removeAll(a2);
	//System.out.println(a1);
	System.out.println(a1.retainAll(a2));
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a2.size());
	a2.clear();
	System.out.println(a2);
	System.out.println(a1.contains("element1"));
	System.out.println(a1.containsAll(a2));
	//System.out.println(a1[0]);
	LinkedList ll=new LinkedList<>();
	ll.add(1);
	ll.addFirst(2);
	ll.addLast(3);
	ll.add(4);
	System.out.println(ll.get(2));
}
}
