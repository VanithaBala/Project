import java.util.*;
public class DoCompare {
public static void main(String args[]){
	//Staff s=new Staff();
	
	/*s[0].setAge(20);
	s[0].setName("Ruk");
	s[1].setAge(25);
	s[1].setName("Khan");*/
	ArrayList<Staff> obj=new ArrayList<Staff>();
	obj.add(new Staff("pradeep",25));
	obj.add(new Staff("suder",30));
	obj.add(new Staff("vanit",20));
	System.out.println("before comparison");
	for(Staff s:obj){
		System.out.println(s.getName()+" "+s.getAge());
	}
	Collections.sort(obj, new ByName());
	System.out.println("compare by name");
	for(Staff s:obj){
		System.out.println(s.getName()+" "+s.getAge());
	}
	Collections.sort(obj, new ByAge());
	System.out.println("compare by age");
	for(Staff s:obj){
		System.out.println(s.getName()+" "+s.getAge());
	}
	String one="Hello";
	String two="Hello";
	if(one.equals(two)){
		System.out.println("one==two");
	}
}
}
