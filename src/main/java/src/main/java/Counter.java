package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void resets(x) {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
