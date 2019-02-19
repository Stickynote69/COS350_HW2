package Homework2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		ArrayList<Choice> choices = new ArrayList<Choice>();
		ArrayList<ArrayList<Pogo>> pogoTests = new ArrayList<ArrayList<Pogo>>();
		
		// First test with example set {5 -1 0 2 1 -10 1 2 3}
		ArrayList<Pogo> pogos1 = new ArrayList<>(Arrays.asList(new Pogo(2,1),new Pogo(2,3)));
		int[] piles1 = new int[30];
		piles1 = fill(piles1);
		piles1[0] = -1;
		piles1[1] = -10;
		int dist1 = 5;
		
		// Second test with example set {10 -5 0 4 2 -8 2 3 4}
		ArrayList<Pogo> pogos2 = new ArrayList<>(Arrays.asList(new Pogo(4,2),new Pogo(4,3)));
		int[] piles2 = new int[30];
		piles2 = fill(piles2);
		piles2[0] = -5;
		piles2[2] = -8;
		int dist2 = 10;
		
		long timeStart1 = System.currentTimeMillis();
		MyAlgorithms.T2(dist1,0,piles1,pogos1,new ArrayList<Integer>(),new ArrayList<Integer>(),choices);
		long timeEnd1 = System.currentTimeMillis();
		
		System.out.println("This is testing for E");
		// When input is "E"
		System.out.println(choices.size());
		for(Choice x : choices) {
			System.out.print(x.getPathCost() + " ");
			for(int y : x.getPath()) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("This is testing for M");
		// When input is "M"
		int min1 = choices.get(0).getPathCost();
		int index1 = 0;
		for(int x = 1; x < choices.size(); x++) {
			if(choices.get(x).getPathCost() < min1) {
				min1 = choices.get(x).getPathCost();
				index1 = x;
			}	
		}
		System.out.print(min1 + " ");
		for(int x : choices.get(index1).getPath())
			System.out.print(x + " ");
		
		System.out.println("\nRun time: " + (timeEnd1 - timeStart1));
		
		choices = new ArrayList<Choice>();
		long timeStart2 = System.currentTimeMillis();
		MyAlgorithms.T2(dist2,0,piles2,pogos2,new ArrayList<Integer>(),new ArrayList<Integer>(),choices);
		long timeEnd2 = System.currentTimeMillis();
		
		System.out.println("This is testing for E");
		// When input is "E"
		System.out.println(choices.size());
		for(Choice x : choices) {
			System.out.print(x.getPathCost() + " ");
			for(int y : x.getPath()) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("This is testing for M");
		// When input is "M"
		int min2 = choices.get(0).getPathCost();
		int index2 = 0;
		for(int x = 1; x < choices.size(); x++) {
			if(choices.get(x).getPathCost() < min2) {
				min2 = choices.get(x).getPathCost();
				index2 = x;
			}	
		}
		System.out.print(min2 + " ");
		for(int x : choices.get(index2).getPath())
			System.out.print(x + " ");
		
		System.out.println("\nRun time: " + (timeEnd2 - timeStart2));
		
	}
	
	public static int[] fill(int [] p) {
		for(int x = 0; x < p.length - 1; x++)
			p[x] = 0;
		return p;
	}
}
