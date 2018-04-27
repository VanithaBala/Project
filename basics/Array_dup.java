package basics;

import java.util.*;

public class Array_dup {

	public static void main(String args[]) {
		int i, j, count = 0;
		int a[] = { 1, 1, 3, 4, 5, 5, 7, 8 };
		// Scanner obj = new Scanner(System.in);
		System.out.print("The repeated numbers in the array is:" + "\n");
		for (i = 0; i <= a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i] + " ");
					count++;
				}
			}
		}
		System.out.print("The number of elements repeated in the array" + " " + count);

	}
}
