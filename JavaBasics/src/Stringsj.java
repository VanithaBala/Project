
public class Stringsj {
public static void main(String args[]){
	String s="java";
	String s1="java".intern();
   String sj=new String("java").intern();
   //System.out.println(s==sj);
  // System.out.println(s.equals(s1));
   String str=null;
   String str1=new String("shah");
     // str=str.concat(8);
   str=str+"value"+7+"value1"+87.54+"value2";
       System.out.println(str);
      // System.out.println(str1.concat(""));
       String value=str1.concat("");
       System.out.println(value);
       System.out.println(str1);
       System.out.println(str1.equals(value));
       System.out.println(str1==value);
       
       
}
}
