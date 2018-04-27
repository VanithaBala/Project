import java.util.*;
public class ByAge implements Comparator<Staff> {
 public int compare(Staff obj1,Staff obj2){
	 return obj2.getAge()-obj1.getAge();
 }
}
