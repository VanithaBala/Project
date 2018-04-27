package basics;

	class TestExceptionChild extends This_Ex{
		  void msg()throws NullPointerException{
		    System.out.println("TestExceptionChild");
		  }
		  public static void main(String args[]){
		   This_Ex p=new TestExceptionChild();
		   p.msg();
		  }
		}

