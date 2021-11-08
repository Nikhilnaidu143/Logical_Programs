import java.util.Scanner;

public class Reverse_a_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number :- ");
		int N = input.nextInt();

		int result = 0;
		int remainder = 0;

		while( N > 0 ) {
			remainder = N % 10;
		    N = N / 10;
			result = result * 10 + remainder;
		}
		System.out.println("\nReversed Number :- " + result);
	}
}
