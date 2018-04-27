
public class TypeConversion {
	public static void main(String args[]){
long l=1000000000;
int i=(int)l;
int n=100;
String s=String.valueOf(n);
//System.out.println(s);
String s1=Integer.toString(n);
//System.out.println(s1);
char ch[]=s1.toCharArray();
for(int j=0;i<ch.length;i++){
	//System.out.println(ch[j]+"\n");
	}
System.out.println(i);

	byte b=2;
	char ch1='o';
	int num=ch1;
	float f=ch1;
	double d=ch1;
	long l1=ch1;
	System.out.println(ch1+ num+ f+ d+ l1);
	
}
}

