import java.util.Scanner;

public class Coupon_numbers {
	public static int random() {
		return (int)(Math.random()*1000);   /* generating random numbers */
	}

	public static int distinctCoupon(int N) {
		boolean[] isCollected = new boolean[N];  /* initially this boolean array is filled with false . iscollected[i] = true if i is already collected */
		int count = 0;
		int distinct = 0;  /* number of distint numbers collected */

		while(distinct < N) {
			int value = random();
			count++;
			if( isCollected[value] == false ) {
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
