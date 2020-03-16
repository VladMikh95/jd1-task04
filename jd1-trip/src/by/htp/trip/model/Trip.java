package by.htp.trip.model;

import java.util.Comparator;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. 
 */
public class Trip implements Comparable<Trip> {
	
	private String name;
	
	private TypeOfTrip type;
	
	private String transport;
	
	private String food;
	
	private int numberOfDays;
	
	private int price;
	
	public Trip() {
		
	}
	
	public Trip(String name, TypeOfTrip type, String transport, String food, int numberOfDays, int price) {
		this.name = name;
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfTrip getType() {
		return type;
	}

	public void setType(TypeOfTrip type) {
		this.type = type;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Trip t) {
			return this.name.compareTo(t.getName());
	}
	
	public static Comparator<Trip> typeComparator = new Comparator<Trip>() {

		@Override
		public int compare(Trip t1, Trip t2) {
			return t1.getType().compareTo(t2.getType());
		}
	};
	
	public static Comparator<Trip> transportComparator = new Comparator<Trip>() {

		@Override
		public int compare(Trip t1, Trip t2) {
			return t1.getTransport().compareTo(t2.getTransport());
		}
	};
	
	public static Comparator<Trip> foodComparator = new Comparator<Trip>() {
	
		@Override
		public int compare(Trip t1, Trip t2) {
			return t1.getFood().compareTo(t2.getFood());
		}
	};
	
	public static Comparator<Trip> numberOfDaysComparator = new Comparator<Trip>() {
		
		@Override
		public int compare(Trip t1, Trip t2) {
			return t1.getNumberOfDays() - t2.getNumberOfDays();
		}
	};
	
	public static Comparator<Trip> priceComparator = new Comparator<Trip>() {
		
		@Override
		public int compare(Trip t1, Trip t2) {
			return t1.getPrice() - t2.getPrice();
		}
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trip other = (Trip) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (price != other.price)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trip [name=" + name + ", type=" + type + ", transport=" + transport + ", food=" + food
				+ ", numberOfDays=" + numberOfDays + ", price=" + price + "]";
	}	
}
