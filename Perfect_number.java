import java.util.Scanner;

public class Perfect_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number :- ");
		int N = input.nextInt();

		int sum = 0;
		for(int i = 1; i < N; i++ ) {
			if((N % i) == 0) {
				sum += i;
			}
			else {
				continue;
			}
		}
		if(sum == N) {
			System.out.println("\n" + N + " is a Perfect Number.");
		}
		else {
			System.out.println("\n" + N + " is not a Perfect Number.");
		}
	}
}
