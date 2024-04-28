/**Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:**/
package dsa;

import java.util.*;

public class Alpha9 {
	public static double sumMajorDiagonal(double[][]m) {
		double sum = 0.0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					sum = sum + m[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int m = sc.nextInt();
		System.out.println("Enter the size of column: ");
		int n = sc.nextInt();
		double a[][] = new double[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		if (m == n) {
			double sum = sumMajorDiagonal(a);
			System.out.println(sum);
		}

	}
}
