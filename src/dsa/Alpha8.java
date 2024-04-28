/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array. */

package dsa;
import java.util.Scanner;
public class Alpha8 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int M=sc.nextInt();
		System.out.println("Enter the number of column:");
		int N=sc.nextInt();
		int a[][]=new int [M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				sum+=a[i][j];
			}
		}
		System.out.print(sum+" ");
		
	}

}
