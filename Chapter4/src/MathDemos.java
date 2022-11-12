/*
 * Simple example of how to use Java's Math methods.
 * This program shows that the trig identity sin^2(x) + cos^2(x) = 1 is true
 *  for any value of x.
 */
public class MathDemos {

	public static void main(String[] args) {
		double theta = 9123;
		
		double result = Math.pow(Math.sin(theta), 2) + Math.cos(theta)*Math.cos(theta);
		System.out.println(result);	// Should always see 1.0, regardless of what value was assigned to theta
	}

}
