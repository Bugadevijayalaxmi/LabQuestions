package test_project;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a = 0, b = 1, sum, i, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in the Fibonacci series:");
	    n = sc.nextInt();
		System.out.println("Fibonacci series up to " + n + " terms:");
		System.out.println(a);
		System.out.println(b);
		{
			for (i = 3; i <= n; i++) {
				sum = a + b;
	            a = b;
	            b = sum;
	            System.out.println(sum);
			}
	    }
	}
}