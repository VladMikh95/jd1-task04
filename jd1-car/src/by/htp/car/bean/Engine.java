package by.htp.car.bean;

public class Engine {
	
	private String fuel;
	
	private int power;
	
	private double fuelСonsumption;
	
	private boolean active;
	
	public Engine(String fuel, int power, double fuelConsumption, boolean active) {
		this.fuel = fuel;
		this.power = power;
		this.fuelСonsumption = fuelConsumption;
		this.active = active;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getFuelСonsumption() {
		return fuelСonsumption;
	}

	public void setFuelСonsumption(int fuelСonsumption) {
		this.fuelСonsumption = fuelСonsumption;
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
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + (int) fuelСonsumption;
		result = prime * result + power;
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
		
		Engine other = (Engine) obj;
		if (active != other.active) {
			return false;
		}
		
		if (fuel == null) {
			if (other.fuel != null) {
				return false;
			}
		} else if (!fuel.equals(other.fuel)) {
			return false;
		}
		
		if (fuelСonsumption != other.fuelСonsumption) {
			return false;
		}
		
		if (power != other.power) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + ", power=" + power + ", fuelСonsumption=" + fuelСonsumption + ", active="
				+ active + "]";
	}
}
