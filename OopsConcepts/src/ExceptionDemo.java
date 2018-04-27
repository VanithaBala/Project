
public class ExceptionDemo  {
public static void main(String args[]){
	try{
		int num=90;
		int div=num/0;
	}
	
	/*catch(ArithmeticException e){
		
		System.out.println("do not divide by 0"+e);
		}*/
	
	catch(Exception e){
		e.printStackTrace();
		e.getMessage();
	}
	
	finally{
		System.out.println("execute this");
	}
}
}
