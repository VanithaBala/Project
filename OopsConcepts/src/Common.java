
public class Common implements Check,Check1,Check2 {
public static void main(String args[]){
	Common c=new Common();
	System.out.println(c.name);
	c.display();

}
public void display(){
	System.out.println("2 nd ");
}
}
