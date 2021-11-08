import java.util.Scanner;

public class StopWatch {
	public static void stopWatch() {
		Scanner input = new Scanner(System.in);  /* Taking input from user */
		long start_timer = 0;
		System.out.print(" Enter 0 to start: ");
		long start_input = input.nextInt();

		if(start_input == 0) {
			start_timer = System.nanoTime();  /* starting the timer */
		}
		else {
			System.out.println("Enter 0 only to start the timer.");
			return;
		}

		/* temporary variables */
		long end_timer = 0;
		int n = 0;
		while (n != 1) {
			n--;
			System.out.print(" Please enter 1 to stop: ");
			int end_input = input.nextInt();
			if(end_input == 1) {
			    end_timer = System.nanoTime();     /* ending the loop */
				break;
			}
		}
		float elapsed_time = (float) ((end_timer - start_timer)*Math.pow(10 , -9));
		System.out.println("\nElapsed time :-  " + elapsed_time + " seconds.");  /* printing elapsed time */
		input.close();
	}

	public static void main(String[] args) {
		stopWatch();   /* calling stopWatch method */
	}
}
