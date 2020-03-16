package by.htp.airline.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.airline.bean.Airline;
import by.htp.airline.bean.Time;

public class AirlineLogic {
	
	public List<Airline> findForDestination(Airline[] airlines, String destination) {
		List<Airline> result = new ArrayList<Airline>();
		
		for(Airline a: airlines) {
			if(a.getDestination().compareTo(destination) == 0) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public List<Airline> findForWeakday(Airline[] airlines, String weakday) {
		List<Airline> result = new ArrayList<Airline>();
		
		for(Airline a: airlines) {
			if(a.getWeakday().compareTo(weakday) == 0) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public List<Airline> findForWeakdayAndTime(Airline[] airlines, String weakday, Time time) {
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> temp = findForWeakday(airlines, weakday);
		
		for(Airline a: temp) {
			if(a.getDepartureTime().getHour() > time.getHour()) {
				result.add(a);
			} else if (a.getDepartureTime().getHour() == time.getHour()) {
				if(a.getDepartureTime().getMinute() > time.getMinute()) {
					result.add(a);
				}
			}
		}
		
		
		return result;
	}

}
