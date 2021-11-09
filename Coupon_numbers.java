import java.util.Scanner;

public class Coupon_numbers {
	public static int random(int N) {
		return (int)(Math.random()*N);   /* generating random numbers */
	}

	public static int distinctCoupon(int N) {
		boolean[] isCollected = new boolean[N];  /* iscollected[i] = true if i is already collected */
		int count = 0;
		int distinct = 0;  /* number of distint numbers collected */

		while(distinct < N) {
			int value = random(N);
			count++;
			if( !isCollected[value] ) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int N = input.nextInt();
		int count = distinctCoupon(N);  /* calling distinct coupon by passing N integer parameter */
		System.out.println(count);
		input.close();
	}
}
