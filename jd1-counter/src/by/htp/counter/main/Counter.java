package by.htp.counter.main;

import java.util.Random;

public class Counter {
	
	private int i;
	
	private int max = 10;

	public void initRandom() {
		Random r  = new Random();
		i = r.nextInt(10);
	}
	
	public void initStart() {
		i = 0;
	}
	
	public void plus() {
		if (i == max) {
			i = 0;
		} else {
			i++;
		}
	}
	
	public void minus() {
		if (i > 0) {
			i--;
		}
	}
	
	public int getI() {
		return this.i;
	}
	
	public int getMax() {
		return this.max;
	}
}
