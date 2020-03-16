package by.htp.train.main;

public class Train {
	
	private String a;
	
	private int numberTrain;
	
	private Date time;
	
	public Train() {
		
	}
	
	public  Train(String a, int numberTrain, Date time) {
		this.a = a;
		this.numberTrain = numberTrain;
		this.time = time;
	}
		
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public Train getTrainInfo() {
		return this;
	}
}
