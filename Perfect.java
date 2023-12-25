/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		String str = args[0] + " is a perfect number since " + args[0] + " = ";
		int N = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				sum += i;
				str += i + " + ";
			}
		}
		if (sum == N) {
			System.out.println(str.substring(0, str.length() - 2));
		}
		else {
			System.out.println(N + " is not a perfect number");
		}
	}
}
