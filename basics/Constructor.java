package basics;

public class Constructor {
	 Constructor(){
		int a=10;
		System.out.println(a);
	 }
	 Constructor(int a){
		 int c=10;
		 c+=a;
	 }
 public static void main(String args[]){
	 Constructor c=new Constructor();
	 Constructor c1=new Constructor();
	
 }
}