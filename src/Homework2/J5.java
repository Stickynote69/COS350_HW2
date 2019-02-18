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
		pogos = MyAlgorithms.pogoSort(pogos);
		MyAlgorithms.myAlgorithm(dist,0,pogos,new ArrayList<Integer>(),choices);
		System.out.println(choices.size());
		if(type.equals("E")) {
			for(Choice x : choices) {
				for(int y : x.getPath()) {
					System.out.print(y + " ");
				}
				System.out.print("\n");
			}
		}
		else {
			System.out.println("Fuck");
		}
	}
	
}
