
public class Swap {
	public static void main(String args[]){
int n1=90,n2=45;
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println(n1+" "+n2);

	//Strings 
	
	String s1="vani";
	String s2="bala";
	s1=s1+s2;
	//System.out.println(s1);
	s2=s1.substring(0, (s1.length()-s2.length()));
	s1=s1.substring(s2.length());
	System.out.println("after swap:"+s1+" "+s2);
	
	
	int a[]={4,3,2};
	int b[]={9,7,1};
	int i;
	int size=a.length+b.length;
	int temp[]=a;
	a=b;
	b=temp;
	for(int ele:a){
		System.out.println(ele);
	}
	for(int ele:b){
		System.out.println(ele);
	}
	
	
	
		
	}
}
	

