import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {
	public static void main(String args[]){
HashSet hs=new HashSet<String>();
HashSet<Integer> hs1=new HashSet<Integer>();
hs1.add(32);
hs1.add(64);
hs1.add(32);
hs1.add(null);
hs1.add(null);

	hs.add("sik");
	hs.add("shak");
	hs.add("shin");
	hs.add(87d);
  hs1.addAll(hs);
	System.out.println(hs1);
	//
	
	TreeSet ts=new TreeSet<>();
	ts.add(150);
	ts.add(20);
	ts.add(100);
	//ts.add(null);
	//ts.add(null);
	System.out.println(ts);
	System.out.println(ts.ceiling(100));
	System.out.println(ts.floor(100));
	System.out.println(ts.lower(150));
	System.out.println(ts.higher(100));
	
	
	}
}
