package by.htp.car.bean;

public class Wheel {
	
	private int diameter;
	
	private boolean rotating;
	
	public Wheel() {
		this.diameter = 20;
	}
	
	public Wheel(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public boolean isRotating() {
		return rotating;
	}

	public void setRotating(boolean rotating) {
		this.rotating = rotating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + (rotating ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter) {
			return false;
		}
		
		if (rotating != other.rotating) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", rotating=" + rotating + "]";
	}
	
	
}
