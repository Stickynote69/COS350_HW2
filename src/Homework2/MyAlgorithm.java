package Homework2;
import java.util.ArrayList;

public class MyAlgorithm {
	
	public static void myAlgorithm(int n, int count, ArrayList<Integer> pogos, ArrayList<Integer> jump, ArrayList<ArrayList<Integer>> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(int x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x);
				choices.add(steps);
			}
			// If the distance traveled is less than end distance, jump is recorded and myAlgorithm is called again
			else if(count + x < n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x);
				myAlgorithm(n,count + x,pogos,steps,choices);
			}
		}
	}
}
