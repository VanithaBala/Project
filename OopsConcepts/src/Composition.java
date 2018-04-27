
public class Composition {
public static void main(String args[]){
	

	Library l=new Library();
	//l=null;
	l.getBooks("steve");
	
}
}
class Book{
	String bName;
	void show(String bName){
		System.out.println(this.bName=bName);
	}
}
class Library{
	Book b1;
	Library(){
		this.b1=new Book();
	}
	void getBooks(String auth){
		String author=auth;
		b1.show("apl");
		//System.out.println("Book name is" +b1.show());
		System.out.println("Author  name is"+author);
	}
}