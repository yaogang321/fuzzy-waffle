package hello;

public class Fibonacci {
	public static int of(int num) {
		if(num==1||num==2) {
			return 1;
		}
		else {
			return of(num-2) + of(num-1);
		}
	}
}
