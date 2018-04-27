
public class Aggregation {
	public static void main(String args[]){
		Address obj=new Address("north","chennai");
		Student s=new Student("Sathya",obj);
		Staff s1=new Staff("Shan","CSE",obj);
		System.out.println(s.name);
		System.out.println(s.obj.street);
		System.out.println(obj.city);
		System.out.println(s1.name+" "+s1.obj.street);
        
	}

}
class Address{
	 String street,city;
Address(String street,String city){
	this.street=street;
	this.city=city;
}
}
	class Student{
		String name;
		Address obj;
		Student(String name,Address obj){
			this.name=name;
			this.obj=obj;
			}
		}
	class Staff{
		String name,dept;
		Address obj;
		Staff(String name,String dept,Address obj){
			this.name=name;
			this.dept=dept;
			this.obj=obj;
		}
	}
