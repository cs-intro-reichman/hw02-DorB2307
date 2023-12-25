
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false, girl = false;
		int count = 0;
		while (!boy || !girl) {
			count += 1;
			if ((int)(Math.round(Math.random())) == 0) {
				boy = true;
				System.out.print("b ");
			}
			else {
				girl = true;
				System.out.print("g ");
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
