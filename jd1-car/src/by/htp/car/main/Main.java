package by.htp.car.main;

import by.htp.car.Logic.CarLogic;
import by.htp.car.bean.Car;
import by.htp.car.bean.Engine;
import by.htp.car.bean.Wheel;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 *  менять колесо, вывести на консоль марку автомобиля
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		CarLogic cl = new CarLogic();
		Car car = new Car("Scoda Karoq", "blue", 50, 0, new Wheel(40), 
				new Engine("бензин", 150, 6.3, false), false);
		
		cl.move(car);
		cl.fillTheTank(car, 40);
		cl.move(car);
		cl.replaceWheel(car.getWheel());
		System.out.println(car.getBrand());
	}

}
