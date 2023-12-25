/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int count2 = 0, count3 = 0, count4 = 0;
		double sum = 0;
		for (int i = 0; i < T; i++) {
			boolean boy = false, girl = false;
			int count = 0;
			while (!boy || !girl) {
				count += 1;
				if ((int)(Math.round(Math.random())) == 0) {
					boy = true;
				}
				else {
					girl = true;
				}
			}
			sum += count;
			if (count == 2) count2 += 1;
			if (count == 3) count3 += 1;
			if (count >= 4) count4 += 1;
		}
		System.out.println("Average: " +  sum / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2);
		System.out.println("Number of families with 3 children: " + count3);
		System.out.println("Number of families with 4 or more children: " + count4);
		if (count4 > count3 && count4 > count2) {
			System.out.println("The most common number of children is 4 or more.");
		}
		else if (count3 > count4 && count3 > count2) {
			System.out.println("The most common number of children is 3.");
		}
		else {
			System.out.println("The most common number of children is 2.");
		}
	}
}
