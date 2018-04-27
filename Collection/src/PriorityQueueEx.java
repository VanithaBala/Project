import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String args[]){
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.offer("shin");
		pq.offer("vani");
		pq.add("bala");
		pq.add("abi");
		System.out.println(pq);
		
		ArrayDeque<String> aq=new ArrayDeque<String>();
		aq.add("one");
		aq.push("three");
		aq.push("two");
		System.out.println(aq);
		System.out.println(aq.pop()+" "+aq);
		System.out.println(aq.getFirst()+" "+aq.getLast());
		
		
	}
}
