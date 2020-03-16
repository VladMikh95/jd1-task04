package by.htp.train.main;

public class TrainLogic {
	
	public Train getTrainNum(Train[] a, int n) {
		if (a == null) {
			return null;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].getNumberTrain() == n) {
				return a[i];
			}
		}
		return null;
	}

}
