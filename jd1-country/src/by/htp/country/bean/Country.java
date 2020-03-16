package by.htp.country.bean;

import java.util.List;

public class Country {
	
	private String name;
	
	private List<Area> areas;
	
	private String capital;
	
	private int square;
	
	public Country() {
		
	}
	
	public Country(String name, List<Area> areas, String capital, int square) {
		this.name = name;
		this.areas = areas;
		this.capital = capital;
		this.square = square;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
	public int calcCountOfAreas() {
		return getAreas().size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + square;
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
		
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (areas == null) {
			if (other.areas != null) {
				return false;
			}
		} else if (!areas.equals(other.areas)) {
			return false;
		}
		
		if (capital == null) {
			if (other.capital != null) {
				return false;
			}
		} else if (!capital.equals(other.capital)) {
			return false;
		}
		
		if (square != other.square) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", areas=" + areas + ", capital=" + capital 
				+ ", square=" + square + "]";
	}
	
	
}
