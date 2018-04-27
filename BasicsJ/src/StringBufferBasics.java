
public class StringBufferBasics {
public static void main(String args[]){
	StringBuffer sb=new StringBuffer("java");
	sb.append("string");
	System.out.println(sb);
	System.out.println(sb.insert(3, "methods"));
	System.out.println(sb.reverse());
	System.out.println(sb.delete(5, 8));
	
}
}
