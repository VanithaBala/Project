
public class thisKeyword {
int a,b;
void getData(int a,int b){
	a=a;
	b=b;
	//System.out.println(a+" "+b);
}
void showData(){
	System.out.println(a+" "+b);
}
/*thisKeyword(int a, int b){
	a=a;
	b=b;
	System.out.println(a+" "+b);
}*/
public static void main(String args[]){
	thisKeyword tk=new thisKeyword();
	tk.getData(3, 4);
	tk.showData();
	
}
}
