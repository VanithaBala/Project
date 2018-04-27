import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String args[]){
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		hash.put(1, "ten");
		hash.put(2, "nine");
		hash.put(3, "eight");
		hash.put(4, "seven");
		
		
		hash.put(2, "someString");
		String output=hash.get(2);
		System.out.println(output);
		
		for(Map.Entry<Integer, String> entry:hash.entrySet()){
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
}
