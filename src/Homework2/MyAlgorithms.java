package Homework2;
import java.util.ArrayList;

public class MyAlgorithms {
	
	public static void myAlgorithm(int n, int count, ArrayList<Pogo> pogos, ArrayList<Integer> jump, ArrayList<ArrayList<Integer>> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(Pogo x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x.getJump() == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				choices.add(steps);
			}
			// If the distance traveled is less than end distance, jump is recorded and myAlgorithm is called again
			else if(count + x.getJump() < n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				myAlgorithm(n,count + x.getJump(),pogos,steps,choices);
			}
		}
	}
	
	public static void T1(int n, int count, ArrayList<Pogo> pogos, ArrayList<Integer> jump, ArrayList<ArrayList<Integer>> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(Pogo x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x.getJump() == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				choices.add(steps);
			}
			// If the distance traveled is less than end distance, jump is recorded and myAlgorithm is called again
			else if(count + x.getJump() < n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				myAlgorithm(n,count + x.getJump(),pogos,steps,choices);
			}
		}
	}
}
