import java.util.Arrays;

public class PrimeArray {
public static void main(String args[]){
	int i,j;
	//int ar1[]={4,3,2};
	int x[]={5,4,3,9,10,20};
	int y[]={6,1,2};
	int temp[];
	//System.arraycopy(y, 0, x, 0, length);
	int len=x.length+y.length;
   String s= Arrays.toString(x);
   String s1= Arrays.toString(y);
   String s3=s+s1;
    int[] tem=new int[len];
   ;
    
	System.out.println(x.equals(y));
	for(i=0;i<x.length;i++){
		boolean isPrime=true;
		for(j=2;j<x.length;j++){
		if(x[i]%j==0){
			isPrime=false;
			
		}
		if(isPrime){
			System.out.println(x[i]);
		}
		}
	}
}
}
