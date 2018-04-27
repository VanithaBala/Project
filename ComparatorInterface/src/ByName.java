import java.util.*;
public class ByName implements Comparator<Staff>{
public int compare(Staff obj1,Staff obj2){
	String name1=obj1.getName();
	String name2=obj2.getName();
	return name1.compareTo(name2);
}
}
