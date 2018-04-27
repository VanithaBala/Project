import java.util.HashSet;
import java.util.*;
public class StaticChild extends Statickey {
public static void main(String args[]){
	String s1=new String("vanitha");
	String s2="vanitha";
	//System.out.println(s1==s2);
	HashSet<String> name=new HashSet<String>();
	System.out.println(name.add("vani"));
	System.out.println(name.add("sasi"));
	System.out.println(name.add("vani"));
	//System.out.println(name);
	HashMap<String,String> name1=new HashMap<>();
	name1.put("name101", "vani");
	name1.put("name101","bala");
	name1.put("", "");
	name1.put("name102", "");
	System.out.println(name1);
	for(Map.Entry<String, String> entry:name1.entrySet()){
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}