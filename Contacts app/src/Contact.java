import java.io.*;
import java.util.*;

public class Contact {
	// public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	String name;
	String phoneNo;
	String email, address,total,jobTitle,companyName;
	/*void getOrganization() {
		String jobTitle;
		String companyName;
		System.out.println(" Orgaization details:\n");
		System.out.println("Enter Job title");
		//jobTitle = input.nextLine();
		System.out.println("Enter Company name:");
		companyName = input.nextLine();
	}*/

	void createContact() throws FileNotFoundException, IOException {
		int no,i;
		try{
		Properties p=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\Vanitha\\Desktop\\java IO\\store.dat");
		if(fin!=null){
		 p.load(fin);
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Vanitha\\Desktop\\java IO\\store.dat");
		System.out.print("Enter how many number of contacts you want to create:\n");
		no=input.nextInt();
		for(i=0;i<no;i++){
		System.out.println("Enter Name:");
		name=br.readLine();
		//name = input.nextLine();
		System.out.println("Enter Phone number:");
		phoneNo=br.readLine();
		//phoneNo = input.nextDouble();
		System.out.println("Enter Address");
		address=br.readLine();
		//address = input.nextLine();
		//getOrganization();;
		System.out.println("Organization Details\n");
		System.out.println("Enter JobTitle");
		jobTitle=br.readLine();
		System.out.println("Enter Company name");
		companyName=br.readLine();
		System.out.println("Contact created successfully!");
		}
		for(i=0;i<no;i++){
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Vanitha\\Desktop\\java IO\\store.dat"));
		bw.write(name);
		bw.write(phoneNo);
		bw.write(address);
		bw.write(jobTitle);
		bw.write(companyName);
		//total="Name:"+name+"Phone number:"+phoneNo+"Address:"+address+"Job title:"+jobTitle+"Company name:"+companyName;
		bw.close();
		fout.close();
		}
		}
		catch(Exception e){
		System.out.println(e);
	}
	}
	void viewContact(){
		String fContent;
		try{
			FileReader fread=new FileReader("store.bat");
			String linetxt=null;
		BufferedReader bufferedReader=new BufferedReader(fread);
		while((linetxt=bufferedReader.readLine())!=null){
			System.out.println(linetxt);
		}
		bufferedReader.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	  /*System.out.println("Name" +name);
	  System.out.println("Phone number" +phoneNo);
	  System.out.println("Address" +address);*/

	}
}
