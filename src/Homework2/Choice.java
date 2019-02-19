package Homework2;
import java.util.*;

public class Choice {
	private ArrayList<Integer> path;
	private ArrayList<Integer> cost;
	
	public Choice() {
		this.path = null;
		this.cost = null;
	}
	public Choice(ArrayList<Integer> path) {
		this.path = path;
		this.cost = null;
	}
	public Choice(ArrayList<Integer> path, ArrayList<Integer> cost) {
		this.path = path;
		this.cost = cost;
	}
	
	public ArrayList<Integer> getPath() {return this.path;}
	public void setPath(ArrayList<Integer> path) {this.path = path;}
	public ArrayList<Integer> getCost() {return this.cost;}
	public void setCost(ArrayList<Integer> cost) {this.cost = cost;}
	
	public int getPathCost() {
		int pCost = 0;
		for(int x : cost)
			pCost += x;
		return pCost;
	}
	

}
