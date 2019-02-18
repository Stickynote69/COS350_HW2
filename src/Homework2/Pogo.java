package Homework2;

public class Pogo {
	private int cost;
	private int jump;
	
	public Pogo() {
		this.cost = -1;
		this.jump = -1;
	}
	
	public Pogo(int cost, int jump) {
		this.cost = cost;
		this.jump = jump;
	}
	
	public int getCost() {return this.cost;}
	public void setCost(int cost) {this.cost = cost;}
	public int getJump() {return this.jump;}
	public void setJump(int jump) {this.jump = jump;}
}
