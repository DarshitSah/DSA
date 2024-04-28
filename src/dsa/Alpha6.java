//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators, The method signature is
//as follows.

package dsa;

public class Alpha6 {
	public static boolean isOdd(int n) {
		if((n&1)==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isOdd(37));

	}

}
