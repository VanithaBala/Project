
public class EmployeeMain {
public static void main(String args[]){
	PFcal obj=new PFcal();
	obj.setId(102);
	obj.setName("Vanitha");
	obj.showDetails();
	obj.calculatePF(30000);
	obj.getSalary(30000);
	obj.getSalary(15,50000);
}
}
