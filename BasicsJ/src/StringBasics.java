
public class StringBasics {
public static void main(String args[]){
	String s="vani";
	String s1="vani";
	//System.out.println(s==s1);
	String s2=new String("vani");
	String s3=new String("vani");
	String s4=s3.intern();
	 s3.intern();
	//System.out.println(s4);
	//System.out.println(s3==s4);
	//System.out.println(s2.equals(s3));
   //System.out.println(s2.equals(s3));
	String str="bala";
	String str1=new String("bala").intern();
	String ant=new String("krishna");
	String ant1=new String("krishna").intern();
	System.out.println(str==str1);
	System.out.println(ant.equals(ant1));
  final String s11="dharani";
  final String s12="dharu";
 // s11="ddddd";
  String s13=s11+s12;
  System.out.println(s13);
  String strArr[]={"java","js"};
  String st="java";
  System.out.println((strArr[0]==st));
  String ch=new String(new char[]  {'a','b','c','d'});
  System.out.println(ch);
}
}
