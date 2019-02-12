package Homework2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> pogos = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> choices = new ArrayList<ArrayList<Integer>>();
		int dist;
		dist = scan.nextInt();
		String line = scan.nextLine();
		scan = new Scanner(line);
		while(scan.hasNext()) pogos.add(scan.nextInt());
		scan.close();
		// Sorts pogos before algorithm
		Collections.sort(pogos);
		long timeStart = System.currentTimeMillis();
		MyAlgorithm.myAlgorithm(dist,0,pogos,new ArrayList<Integer>(),choices);
		System.out.println(choices.size());
		for(ArrayList<Integer> x : choices) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println((timeEnd - timeStart));
	}
}
