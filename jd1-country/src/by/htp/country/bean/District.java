package by.htp.country.bean;

import java.util.List;

public class District {
	
	private String name;
	
	private List<City> cities;
	
	private String centerOfDitrict;
	
	public District() {
		
	}
	
	public District(String name, List<City> cities, String centerOfDistrict) {
		this.name = name;
		this.cities = cities;
		this.centerOfDitrict = centerOfDistrict;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public String getCenterOfDitrict() {
		return centerOfDitrict;
	}

	public void setCenterOfDitrict(String centerOfDitrict) {
		this.centerOfDitrict = centerOfDitrict;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((centerOfDitrict == null) ? 0 : centerOfDitrict.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
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
		
		District other = (District) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (centerOfDitrict == null) {
			if (other.centerOfDitrict != null) {
				return false;
			}
		} else if (!centerOfDitrict.equals(other.centerOfDitrict)) {
			return false;
		}
		
		if (cities == null) {
			if (other.cities != null) {
				return false;
			}
			
		} else if (!cities.equals(other.cities)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "District [name" + name + ", cities=" + cities + ", centerOfDitrict=" 
				+ centerOfDitrict + "]";
	}
	
	
	

}
