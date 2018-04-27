
public class DuplicatesEx {
public static void main(String args[]){
	int a[]={1,1,2,3,2,4};
	int i,j;
	// finding ARRAY duplicates
	
	for(i=0;i<a.length;i++){
		for(j=i+1;j<a.length-1;j++){
			if(a[i]==a[j]){
				System.out.println(a[i]);
			}
		}
	}
	
	String b[]={"one","one","two","three","two"};
	//finding STRING array duplicates 
	
	for(i=0;i<b.length;i++){
		for(j=i+1;j<b.length-1;j++){
			if(b[i].equals(b[j])){
				System.out.println(b[i]);
			}
		}
	}
	
}
}
