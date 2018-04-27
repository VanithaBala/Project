package basics;

public class Aggregation {
 int regNo;
 String name;
 Aggregation(int regNo, String name,Address add){
	 this.regNo=regNo;
	 this.name=name;
	 this.adr=add;
 }
 Address adr;
 public static void main(String args[]){
	// Address adr
	 Address ad=new Address("North","Chennai");
	 Aggregation a1=new Aggregation(11,"Vanit",ad);
	 System.out.println(a1.regNo+ " "+a1.name);
	 System.out.println(a1.adr.street+ " "+a1.adr.city);
 }
}
