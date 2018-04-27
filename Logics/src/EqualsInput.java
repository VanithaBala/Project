
public class EqualsInput {
public static void main(String args[]){
	int num=10;
	int i,j;
	int ar[]={2,8,6,4,1,3,7};
	for(i=0;i<ar.length;i++){
		for(j=i+1;j<ar.length;j++){
			if(ar[i]+ar[j]==num){
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}
	
}
}
