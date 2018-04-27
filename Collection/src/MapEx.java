import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String args[]){
	Map<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("key1", 1);
	hm.put("key2", 2);
	System.out.println(hm.put("key1", 1));
	
	}

}
