
public class ExceptionClass extends Throwable{
public static void main(String args[]){
	try{
	int num=9;
	int div=9/0;
	//return;
	try{
	System.out.println("print");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	catch(ArithmeticException e){
		System.out.println(e);
		return;
	}
	
	finally{
		System.out.println("anything to be executed");
	}
}
	
	//System.out.println("execute or not");
}

