public  class Testing{

 static class Test{
	/*static Test(){
		 System.out.println("no args ");
	 }*/
	/*static Test(int n){
		 System.out.println(n);
	 }*/
	 void display(){
		 System.out.println("normal method");
	 }
	 static void display1(){
		 System.out.println("static");
	 }
 }
 public static void main(String args[]){
	 Test t=new Test();
	// Test t1=new Test(0);
	// Test.display1();
	 
 }
}