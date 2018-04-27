package basics;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int ar[] = { 2, 4, 3, 1, 5 };
		int i, j;
		System.out.println("Enter the sum number which gives array elements\n");
		int sum = in.nextInt();
		for (i = 0; i < ar.length; i++) {
			for (j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == sum)
					System.out.println("Addition pairs of"+" " + sum+" " + "is"+" " + ar[i] + " " + ar[j]);

			}
		}

	}

}
