
public class InnerClass {
public static void main(String args[]){
//	Inner in=new Inner();
	//Outer.Inner out=new Outer().in;
	Outer out=new Outer();
	out.in.print();
	out.number(5);
	//out.number(9);
	//out.print();
}
}
class Outer{         //outer 
	static String name="Common";
	private String str;
	static int number(int a){
		return a;
	}
	Inner in=new Inner();
	
	 class Inner{  //inner class
		int num;
		void print(){
			System.out.println(name);
			System.out.println(str);
		}
	}
}