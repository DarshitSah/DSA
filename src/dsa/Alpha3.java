//Write a java program to check whether a number is a spy number or not. 
package dsa;
import java.util.Scanner;
public class Alpha3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rev=0;
		int pro=1,sum=0;
		while(n>0) {
			rev=n%10;
			sum=sum+rev;
			pro=pro*rev;
			n/=10;
		}
		if(sum==pro) {
			System.out.println("The number is spy");
		}
		else {
			System.out.println("The number is not spy");
		}

	}

}
