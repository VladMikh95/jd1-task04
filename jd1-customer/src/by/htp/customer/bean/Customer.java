package by.htp.customer.bean;

public class Customer {
	
	private int id;
	
	private String name;
	
	private String surname;
	
	private String midName;
	
	private String address;
	
	private int cardNumber;
	
	private int bankAccountNumber;
	
	public Customer(int id, String surname, String name, String midName, String address, 
					int cardNumber, int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.midName = midName;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNumber;
		result = prime * result + cardNumber;
		result = prime * result + id;
		result = prime * result + ((midName == null) ? 0 : midName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		
		if (bankAccountNumber != other.bankAccountNumber) {
			return false;
		}
		
		if (cardNumber != other.cardNumber) {
			return false;
		}
		
		if (id != other.id) {
			return false;
		}
		
		if (midName == null) {
			if (other.midName != null) {
				return false;
			}	
		} else if (!midName.equals(other.midName)) {
			return false;
		}
		
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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
		return "Customer [id=" + id + ", surname=" + surname +", name=" + name  + ", midName=" 
				+ midName + ", address=" + address + ", cardNumber=" + cardNumber 
				+ ", bankAccountNumber=" + bankAccountNumber + "]";
	}
	
	
	
}
