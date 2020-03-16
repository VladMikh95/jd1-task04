package by.htp.airline.view;

import java.util.List;

import by.htp.airline.bean.Airline;


public class View {
	
	public void print(Airline[] airlines) {
		for(Airline item : airlines) {
			System.out.println(item);
		}
	}
	
	public void print(List<Airline> airlines) {
		for(Airline item : airlines) {
			System.out.println(item);
		}
	}

}
