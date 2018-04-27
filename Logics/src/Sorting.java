
public class Sorting {
	public static void main(String args[]){
int[] ar={4,2,7,1,3};
int i,j,temp;
// 1. Arrys.sort() - inbuilt method 

// Sorting an array elements in ascending order
for(i=0;i<ar.length;i++){
	for(j=i+1;j<ar.length;j++){ 
		if(ar[i]>ar[j]){
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
		}
	}
}
for(i=0;i<ar.length;i++){
	System.out.println(ar[i]);
	
}
System.out.println("largest element is"+" s"+ar[ar.length-1]);
System.out.println("smallest element is"+" "+ar[0]);

	}
}