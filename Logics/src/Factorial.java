
public class Factorial {
public static void main(String args[]){
	int n=10;
	int factS=fact(n);
	System.out.println(factS);
	
}
static int fact(int n){
	if(n==1){
		return 1;
	}
	else
		return n*fact(n-1);
	}
}
