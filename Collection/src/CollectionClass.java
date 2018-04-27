	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
	public class CollectionClass {
		public static void main(String args[]){
			ArrayList<String> al=new ArrayList<String>();
			LinkedList ll=new LinkedList<>();
			al.add("vanitha");
			al.add("bala");
			al.add("krishnan");
			//System.out.println(al);
			Collections.sort(al);
		 System.out.println("Sorted order"+al);
		// Arrays.sort(al);
		 ll.add("pradeep");
		 ll.add("Suderson");
		 ll.add("sasirekha");
		 Collections.copy(al, ll);
		 System.out.println(al);
		 System.out.println(ll);
		 Collections.reverse(ll);
		 System.out.println(ll);
		 Collections.fill(al, "vanit");
		 System.out.println(al);
			  System.out.println(Collections.synchronizedCollection(al));
			  System.out.println(Collections.synchronizedList(ll));
			  System.out.println(Collections.emptyList());
		  }
		}
	


