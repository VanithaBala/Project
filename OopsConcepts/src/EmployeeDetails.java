public class EmployeeDetails extends Emp{   // Inheritance 
		double basicPay,pf;
		@Override
		public void showDetails(){
			System.out.println("Employee name:"+getName() );
			System.out.println("Employee id is"+getId());
			}
		public void getSalary(double sal){
		        basicPay=sal/12;
			System.out.println("Basic pay is"+basicPay);  
			}
		public double getSalary(int hra,double sal){      //Method overloading 
			basicPay=(sal/12)*hra;
			return basicPay;
			}
		public void calculatePF(double basicPay){
			pf=basicPay/100;
			System.out.println(pf);
		}
	}

