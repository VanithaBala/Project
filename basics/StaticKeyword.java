package basics;

public class StaticKeyword {
//public static void main(String args[])
	static int i=800;
	static int display(){
		int i=0;
		System.out.println("i value is "+i);
		System.out.println("Static method");
		return i;
	}
	void show(){
		System.out.println("Non static method");
		display();
	}
public static void main(String args[]){
System.out.println(StaticKeyword.i);
StaticKeyword sk=new StaticKeyword();
System.out.println("static keyword through object"+sk.i);
StaticKeyword.display();
//sk.display();
sk.show();
}
}

