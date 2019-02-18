package Homework2;
import java.util.*;

public class Choice {
	private ArrayList<Integer> path;
	private int cost;
	
	public Choice() {
		this.path = null;
		this.cost = -1;
	}
	
	public ArrayList<Integer> getPath() {return this.path;}
	public void setPath(ArrayList<Integer> path) {this.path = path;}
	public int getCost() {return this.cost;}
	public void setCost(int cost) {this.cost = cost;}
	
}
