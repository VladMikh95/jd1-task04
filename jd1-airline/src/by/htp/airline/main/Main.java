package by.htp.airline.main;

import by.htp.airline.bean.Airline;
import by.htp.airline.bean.Time;
import by.htp.airline.logic.AirlineLogic;
import by.htp.airline.view.View;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, 
 * set- и get- методы и метод    toString().  Создать  второй  класс,  агрегирующий  массив  
 * типа  Airline,  с  подходящими  конструкторами  и методами. Задать критерии выбора данных 
 * и вывести эти данные на консоль. Airline: пункт назначения, номер рейса, тип самолета, 
 * время вылета, дни недели.  
 * Найти и вывести:  
 * a) список рейсов для заданного пункта назначения;  
 * b) список рейсов для заданного дня недели;  
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

	public static void main(String[] args) {
		AirlineLogic al = new AirlineLogic();
		View view = new View();
		Airline[] airlines = new Airline[] {new Airline("Moscow", 101, "Boeing-747", new Time(10, 0), "Monday"),
				new Airline("Berlin", 131, "Airbus A310", new Time(15, 40), "Monday"),
				new Airline("Moscow", 101, "Boeing-747", new Time(10, 0), "Friday"),
				new Airline("Kiev", 134, "Boeing-747", new Time(15, 20), "Sunday"),
				new Airline("London", 243, "Airbus A310", new Time(11, 45), "Friday")};
		
		view.print(airlines);
		System.out.println("///////////////");
		view.print(al.findForDestination(airlines, "Moscow"));
		System.out.println("///////////////");
		view.print(al.findForWeakday(airlines, "Monday"));
		System.out.println("///////////////");
		view.print(al.findForWeakdayAndTime(airlines, "Monday", new Time(15, 20)));
		System.out.println("///////////////");
		
	}
}
