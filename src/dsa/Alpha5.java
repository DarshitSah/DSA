//*Write a java method to calculate the sum of digits of a given number until the number is a
//single digit. The method signature is as follows.
//public static int sum_Of_Digits(int n)

package dsa;
import java.util.*;

public class Alpha5 {
	public static int sumOfDigits(int n) {
		int r = 0;
		while(n>10) {
			int sum=0;
		while (n > 0) {
			r = n % 10;
			sum += r;
			n /= 10;
		}
		n=sum;
		}
		return n;

	}

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sumOfDigits(n);
		System.out.println(sumOfDigits(n));

	}

}
