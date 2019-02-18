package Homework2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Pogo> pogos = new ArrayList<Pogo>();
		ArrayList<Choice> choices = new ArrayList<Choice>();
		int[] coinPiles;
		int dist;
		String type;
		type = scan.next();
		dist = scan.nextInt();
		coinPiles = new int[dist];
		String line = scan.nextLine();
		scan = new Scanner(line);
		while(scan.hasNext()) {
			int pile = scan.nextInt();
			int location = scan.nextInt();
			coinPiles[location] = pile;
			Pogo temp = new Pogo();
			temp.setCost(scan.nextInt());
			temp.setJump(scan.nextInt());
			pogos.add(temp);
		}
		scan.close();
		
		// Sorts pogos before algorithm
		pogos = MyAlgorithms.pogoBubbleSort(pogos);
		MyAlgorithms.T1(dist,0,pogos,new ArrayList<Integer>(), new ArrayList<Integer>(),choices);
		if(type.equals("E")) {
			System.out.println(choices.size());
			for(Choice x : choices) {
				System.out.print(x.getPathCost() + " ");
				for(int y : x.getPath()) {
					System.out.print(y + " ");
				}
				System.out.print("\n");
			}
		}
		else {
			int min = choices.get(0).getPathCost();
			int index = 0;
			for(int x = 1; x < choices.size(); x++) {
				if(choices.get(x).getPathCost() < min) {
					min = choices.get(x).getPathCost();
					index = x;
				}	
			}
			System.out.print(min + " ");
			for(int x : choices.get(index).getPath())
				System.out.print(x + " ");
		}
	}
}
