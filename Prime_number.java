import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number :- ");
		int N = input.nextInt();

		if(N < 0) {
			System.out.println("\nPlease enter only Positive number.");
		}
		else {
			if(N > 1) {
				if(N == 2) {
					System.out.println("\n" + N + " is the only Even Prime Number.");
				}
				else {
					if(((N % 1) == 0) && (N % N) == 0 ){
						System.out.println("\n" + N + " is a Prime Number.");
					}
					else {
						System.out.println("\n" + N + " is not a Prime Number.");
					}
				}
			}
			else {
				System.out.println("\n" + N + " is not a Prime Number.");
			}
		}
	}
}
