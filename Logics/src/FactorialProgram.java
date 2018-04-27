
public class FactorialProgram {
	
public static void main(String args[]){
	int f=1;
	FactorialProgram fp=new FactorialProgram();
	System.out.println(fp.fact(5));
}
	/*for(i=1;i<n;i++){
		f=f*i;
	}
	System.out.println(f);
}*/
int fact(int n){
	if(n==0){
	return 1;
}
else{
		return  n*fact(n-1);
	}
}
}
