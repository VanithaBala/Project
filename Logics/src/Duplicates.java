import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {
public static void main(String args[]){
	int i,j,temp;
	String str[]={"vani","pradeep","vani","ani","pradeep"};
	String s;
	int intAr[]={4,5,3,5,2,2,1};
	for(i=0;i<intAr.length;i++){
		for(j=i+1;j<intAr.length-1;j++){
		if(intAr.equals(intAr[j])){
			System.out.println(intAr[i]);
		}
	}
	}
//	for(i=0;i<str.length;i++){
//		for(j=i+1;j<str.length;j++){
//			if(str[i].equals(str[j])){
//				System.out.println(str[i]);
//			}															//Arrays.sort(arrayValue);
																		// Arrays.toString()
//		}
//	}
	//System.out.println(str);
	
	
	Arrays.sort(str);
	for(i=0;i<str.length;i++){
		System.out.println(str[i]);
	}
	System.out.println(Arrays.toString(str));
	
//	for(i=0;i<intAr.length;i++){
//	  if(intAr[i] > intAr[i+1]){
//		 temp= intAr[i];
//		 intAr[i]=intAr[i+1];
//		 intAr[i+1]=temp;
//	  }
//	}
//System.out.println(intAr);

HashSet<String> hm=new HashSet<>();
for(String ele:str){
	if(!hm.add(ele)){
		System.out.println(ele);
	}
}

}
}
