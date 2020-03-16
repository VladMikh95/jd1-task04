package by.htp.car.bean;

public class Car {
	
	private String brand;
	
	private String color;
	
	private int tank;
	
	private double amountOfFuel;
	
	private Wheel wheel;
	
	private Engine engine;
	
	private boolean active;
		
	public Car() {
		
	}
	
	public Car(String brand, String color, int tank, double amountOfFuel, Wheel wheel, Engine engine, boolean active) {
		this.brand = brand;
		this.color = color;
		this.tank = tank;
		this.amountOfFuel = amountOfFuel;
		this.wheel = wheel;
		this.engine = engine;
		this.active = active;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public int getTank() {
		return tank;
	}

	public void setTank(int tank) {
		this.tank = tank;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmountOfFuel() {
		return amountOfFuel;
	}

	public void setAmountOfFuel(double amountOfFuel) {
		this.amountOfFuel = amountOfFuel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + tank;
		result = prime * result + (int) amountOfFuel;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		
		Car other = (Car) obj;
		if (active != other.active) {
			return false;
		}
		
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		
		if (engine == null) {
			if (other.engine != null) {
				return false;
			}
		} else if (!engine.equals(other.engine)) {
			return false;
		}
		
		if (wheel == null) {
			if (other.wheel != null) {
				return false;
			}
		} else if (!wheel.equals(other.wheel)) {
			return false;
		}
		
		if (amountOfFuel != other.amountOfFuel) {
			return false;
		}
		
		if (tank != other.tank) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", tank=" + tank +", amountOfFuel" 
				+  amountOfFuel + ", wheel=" + wheel + ", engine=" + engine + ", active="	+ active + "]";
	}
	
	

}
