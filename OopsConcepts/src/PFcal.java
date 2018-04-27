
public class PFcal extends EmployeeDetails{
	@Override
	public void calculatePF(double basicPay) {      // overriding the parent class method
		int empPercent = 5;
		double pf = (basicPay / 100) * empPercent;
		System.out.println("pf is"+ pf);
		
	}
}
