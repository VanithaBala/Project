import java.util.ArrayList;

public class ArrayListEx {
public static void main(String args[]){
	ArrayList names=new ArrayList();
	names.add("suder");
	names.add("pradeep");
	names.add("vanit");
	
	for(int i=0;i<names.size();i++){
		System.out.println(names.get(i));
	}
	
	names.add(1, "vicky");
}
}