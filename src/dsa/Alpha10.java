package dsa;

import java.util.Scanner;

public class Alpha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sixe of row: ");
		int m = sc.nextInt();
		System.out.println("Enter the sixe of column: ");
		int n = sc.nextInt();
		int a[][] = new int[m + 1][n + 1];
		System.out.println("Enter the element of 1st matrix of " + m + "X" + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
//		for (int i = 0; i < m; i++) {
//			int sum = 0;
//			int j = 0;
//			for (; j < n; j++) {
//				sum = sum + a[i][j];
//			}
//			a[i][n] = sum;
//		}
//		System.out.println("The sum of rows in last column form matrix:");
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j <= n; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//
//		}
		for (int j = 0; j < n; j++) {
			int sumR = 0;
			int i = 0;
			for (; i < m; i++) {
				sumR = sumR + a[i][j];
			}
			a[m][j] = sumR;
		}
		System.out.println("The sum of columns in last row form matrix:");
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();

		}

	}
}
