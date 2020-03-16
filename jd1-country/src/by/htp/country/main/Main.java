package by.htp.country.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.country.bean.Area;
import by.htp.country.bean.City;
import by.htp.country.bean.Country;
import by.htp.country.bean.District;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры
 */
public class Main {

	public static void main(String[] args) {
		Country country;
		List<City> cities1 = new ArrayList<City>();
		cities1.add(new City("Могилев", 350000));
		District district1 = new District("Могилевский", cities1, "Могилев");
		List<City> cities2 = new ArrayList<City>();
		cities2.add(new City("Бобруйск", 250000));
		District district2 = new District("Бобруйский",cities2, "Бобруйск");
		List<District> districts1 = new ArrayList<District>();
		districts1.add(district1);
		districts1.add(district2);
		Area area1 = new Area("Могилевская", districts1, "Могилев");
		
		List<City> cities3 = new ArrayList<City>();
		cities1.add(new City("Минск", 2000000));
		District district3 = new District("Минский",cities3, "Минск");
		List<City> cities4 = new ArrayList<City>();
		cities2.add(new City("Борисов", 140000));
		District district4 = new District("Борисовский",cities4, "Борисов");
		List<District> districts2 = new ArrayList<District>();
		districts1.add(district3);
		districts1.add(district4);
		Area area2 = new Area("Минская", districts2, "Минск");
		
		List<Area> areas = new ArrayList<Area>();
		areas.add(area1);
		areas.add(area2);
		country = new Country("Республика Беларусь", areas, "Минск", 207000);
		
		
		System.out.println("Столица - " + country.getCapital());
		System.out.println("Количество областей - " +country.calcCountOfAreas());
		System.out.println("Площадь государства - " + country.getSquare());
		
	}
	
}
