package by.htp.trip.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TripLogic {
	
	public void choiseTrip(Trip t) {
		System.out.println("Выбрана путевка " + t);
	}
	
	public void sortByName(List<Trip> trips) {
		Collections.sort(trips);
	}
	
	public void sortByType(List<Trip> trips) {
		Collections.sort(trips, Trip.typeComparator);
	}
	
	public void sortByTransport(List<Trip> trips) {
		Collections.sort(trips, Trip.transportComparator);
	}
	
	public void sortByFood(List<Trip> trips) {
		Collections.sort(trips, Trip.foodComparator);
	}
	
	public void sortByNumberOfDays(List<Trip> trips) {
		Collections.sort(trips, Trip.numberOfDaysComparator);
	}
	
	public void sortByPrice(List<Trip> trips) {
		Collections.sort(trips, Trip.priceComparator);
	}
	
	public List<Trip> findTypeOfTrip(List<Trip> trips, TypeOfTrip type) {
		List<Trip> result = new ArrayList<Trip>();
		for (Trip t : trips) {
			if(t.getType() == type) {
				result.add(t);
			}
		}
		return result;
	}
}
