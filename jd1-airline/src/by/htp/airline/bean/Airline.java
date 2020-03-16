package by.htp.airline.bean;

public class Airline {
	
	private String destination;
	
	private int flightNumber;
	
	private String airplaneType;
	
	private Time departureTime;
	
	private String weakday;
	
	public Airline() {
		
	}
	
	public Airline(String destination, int flightNumber, String airplaneType, Time departureTime,
			String weakday) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.weakday = weakday;		
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getWeakday() {
		return weakday;
	}

	public void setWeakday(String weakday) {
		this.weakday = weakday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((weakday == null) ? 0 : weakday.hashCode());
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
		
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null) {
				return false;
			}
		} else if (!airplaneType.equals(other.airplaneType)) {
			return false;
		}
		
		if (departureTime == null) {
			if (other.departureTime != null) {
				return false;
			}
		} else if (!departureTime.equals(other.departureTime)) {
			return false;
		}
		
		if (destination == null) {
			if (other.destination != null) {
				return false;
			}
		} else if (!destination.equals(other.destination)) {
			return false;
		}
		
		if (flightNumber != other.flightNumber) {
			return false;
		}
		
		if (weakday == null) {
			if (other.weakday != null) {
				return false;
			}
		} else if (!weakday.equals(other.weakday)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", departureTime=" + departureTime + ", weakday=" + weakday + "]";
	}
	
	
	

}
