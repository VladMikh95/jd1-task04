package by.htp.student.main;

import java.util.Arrays;

public class Student {
	
	private String surname;
	
	private String initials;
	
	private int groupNumber;
	
	private int[] performance;
	
	public Student() {
		
	}
	
	public Student(String surname, String initials, int groupNumber, int[] performance) {
		this.surname = surname;
		this.initials = initials;
		this.groupNumber = groupNumber;
		this.performance = performance;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + Arrays.hashCode(performance);
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
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
		
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber) {
			return false;
		}
		
		if (initials == null) {
			if (other.initials != null) {
				return false;
			}
		} else if (!initials.equals(other.initials)) {
			return false;
		}
		
		if (!Arrays.equals(performance, other.performance)) {
			return false;
		}
		
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", initials=" + initials + ", groupNumber=" + groupNumber 
				+ ", performance=" + Arrays.toString(performance) + "]";
	}

}
