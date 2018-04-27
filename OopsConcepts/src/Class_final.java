
public final class Class_final {
	final int a;
	Class_final(){
		a=100;
	}
	//a=90;
	final int print(){
		int s1;
		System.out.println("0");
		return 0;
	}
	final int print(int n1){
		System.out.println("1");
		return n1;
	}

public static void main(String args[]){
	Class_final cf=new Class_final();
	cf.print();
	cf.print(1);
	}
}
