package rev;

import java.util.Scanner;
public class PrimNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println(" not a prime");
		}
	}


	static boolean isPrime(int num)
	{
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if((num%i)==0) {
				return false;
			}
		
		}
	
		return  true;
	}
}

