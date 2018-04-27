package basics;

public class Duplication {
	public static void main(String args[]) {
		int ar[] = { 1,2,1,4,5,2 };
		//int len = ar.length;
		int i, j,count=0;
		for (i = 0; i<=ar.length; i++) {
			for (j = i + 1; j <ar.length; j++) {
				if (ar[i] == ar[j]){
					System.out.print(ar[i]+ "  "+ "\n");
					count++;
				
				}
			}
		}
		System.out.println("No of elements repeated in an array"+ count);
	}
}
