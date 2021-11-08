import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number :- ");
		int N = input.nextInt();

		/* temporary variable */
		int a = 0;
		int b = 1;
		int result = 0;

		System.out.println("Fibonacci series :- \n\n");
		while(result <= N) {
			result = a + b;
			a = b;
			b = result;
			if(result >= N) {
				break;
			}
			System.out.println(result);
		}
	}
}
