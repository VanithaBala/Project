

class SuperClass{
	SuperClass(){
		display();
	}
	SuperClass(int a){
		System.out.println("parameterized constructor");
		int s=a+a;
	}
	void display(){
		String s=new String("vanitha");
		String s1="vanitha";
		System.out.println(s);
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}
class child extends SuperClass{
		child(int a){
			super(a);
		}
}
		
public class Abstractclass {
public static void main(String args[]){
	child d=new child(90);
}
}
