package basics;

public class Subclass extends Super_key{
		int num=1000;
		Subclass(){
			System.out.println("default constructor of child class");
		}
		Subclass(int no){
			super(10);

			System.out.println("parameterized constructor of child class");

		}
		void print(){
			System.out.println(super.num);
		}
		void display(){
			System.out.println("child class method");
			super.display();

		}
		public static void main(String args[]){
			Subclass s=new Subclass();
			s.print();
			s.display();
			Subclass s1=new Subclass(20);
		}
	}

