package Homework2;
import java.util.ArrayList;

public class MyAlgorithms {
	
	public static void myAlgorithm(int n, int count, ArrayList<Pogo> pogos, ArrayList<Integer> jump, ArrayList<Choice> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(Pogo x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x.getJump() == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				choices.add(new Choice(steps));
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
	
	public static void T1(int n, int count, ArrayList<Pogo> pogos, ArrayList<Integer> jump, ArrayList<Integer> c, ArrayList<Choice> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		ArrayList<Integer> costs = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(Pogo x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x.getJump() == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				costs = new ArrayList<Integer>();
				costs.addAll(c);
				costs.add(x.getCost());
				choices.add(new Choice(steps,costs));
			}
			// If the distance traveled is less than end distance, jump is recorded and myAlgorithm is called again
			else if(count + x.getJump() < n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				costs = new ArrayList<Integer>();
				costs.addAll(c);
				costs.add(x.getCost());
				T1(n,count + x.getJump(),pogos,steps,costs,choices);
			}
		}
	}
	public static void T2(int n, int count, int[] piles, ArrayList<Pogo> pogos, ArrayList<Integer> jump, ArrayList<Integer> c, ArrayList<Choice> choices) {
		ArrayList<Integer> steps = new ArrayList<Integer>();
		ArrayList<Integer> costs = new ArrayList<Integer>();
		steps.addAll(jump);
		
		for(Pogo x : pogos) {
			// If the distance traveled is equal to end distance, steps taken are added to choices
			if(count + x.getJump() == n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				costs = new ArrayList<Integer>();
				costs.addAll(c);
				if(piles[count] < 0) costs.add(piles[count]);
				costs.add(x.getCost());
				choices.add(new Choice(steps,costs));
			}
			// If the distance traveled is less than end distance, jump is recorded and myAlgorithm is called again
			else if(count + x.getJump() < n) {
				steps = new ArrayList<Integer>();
				steps.addAll(jump);
				steps.add(x.getJump());
				costs = new ArrayList<Integer>();
				costs.addAll(c);
				if(piles[count] < 0) costs.add(piles[count]);
				costs.add(x.getCost());
				T2(n,count + x.getJump(),piles,pogos,steps,costs,choices);
			}
		}
	}
	
	// Sorts pogo sticks by jump distance in ascending order
	public static ArrayList<Pogo> pogoBubbleSort(ArrayList<Pogo> pogos) {
		boolean changed = false;
		do {
			changed = false;
				for(int x = 0; x < pogos.size() - 1; x++) {
					if(pogos.get(x).getJump() > pogos.get(x + 1).getJump()) {
						Pogo temp = pogos.get(x);
						pogos.set(x, pogos.get(x + 1));
						pogos.set(x + 1,temp);
						changed = true;
					}
				}
			} while(changed); 
		return pogos;
	}
	
}
