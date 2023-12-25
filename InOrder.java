/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int rand = (int)(Math.random() * 10);
		int i = 0;
		while (rand >= i) {
			System.out.print(rand + " ");
			i = rand;
			rand = (int)(Math.random() * 10);
		}
	}
}
