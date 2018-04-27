class parent{
	static{
		System.out.println("parent static");
	}
	{
		System.out.println("parent instance block");
	}
	parent(){
		System.out.println("parent constructor");
	}
}
public class InstanceBlock extends parent{
InstanceBlock(){
	System.out.println("child constructor");
}
{
	System.out.println("child instance");
}
static{
	System.out.println("child static");
}
static{
	System.out.println("child static 1");
}
public static void main(String args[]){
InstanceBlock ib=new InstanceBlock();
	//parent p=new parent();
}
}
