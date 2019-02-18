package Homework2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Pogo> pogos = new ArrayList<Pogo>();
		ArrayList<ArrayList<Integer>> choices = new ArrayList<ArrayList<Integer>>();
		int dist;
		String type;
		type = scan.next();
		dist = scan.nextInt();
		String line = scan.nextLine();
		scan = new Scanner(line);
		while(scan.hasNext()) {
			Pogo temp = new Pogo();
			temp.setCost(scan.nextInt());
			temp.setJump(scan.nextInt());
			pogos.add(temp);
		}
		scan.close();
		// Sorts pogos before algorithm
		pogos = pogoSort(pogos);
		MyAlgorithms.T1(dist,0,pogos,new ArrayList<Integer>(),choices);
		System.out.println(choices.size());
		for(ArrayList<Integer> x : choices) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
	}
	// Sorts pogo sticks by jump distance in ascending order
	public static ArrayList<Pogo> pogoSort(ArrayList<Pogo> pogos) {
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
