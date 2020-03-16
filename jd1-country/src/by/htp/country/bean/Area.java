package by.htp.country.bean;

import java.util.List;

public class Area {
	
	private String name;
	
	private List<District> districts;
	
	private String centerOfArea;
	
	public Area() {
		
	}
	
	public Area(String name, List<District> districts, String centerOfArea) {
		this.name = name;
		this.districts = districts;
		this.centerOfArea = centerOfArea;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public String getCenterOfArea() {
		return centerOfArea;
	}

	public void setCenterOfArea(String centerOfArea) {
		this.centerOfArea = centerOfArea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((centerOfArea == null) ? 0 : centerOfArea.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		
		Area other = (Area) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (centerOfArea == null) {
			if (other.centerOfArea != null) {
				return false;
			}
		} else if (!centerOfArea.equals(other.centerOfArea)) {
			return false;
		}
		
		if (districts == null) {
			if (other.districts != null) {
				return false;
			}
		} else if (!districts.equals(other.districts)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Area [name=" + name + ", districts=" + districts + ", centerOfArea=" + centerOfArea + "]";
	}
}
