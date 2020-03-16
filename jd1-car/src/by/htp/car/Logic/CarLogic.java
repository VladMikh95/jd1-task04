package by.htp.car.Logic;

import by.htp.car.bean.Car;
import by.htp.car.bean.Wheel;

public class CarLogic {
	
	public void move(Car car) throws InterruptedException {
		while (car.getAmountOfFuel() > 0) {
			double temp = car.getAmountOfFuel();
			car.getEngine().setActive(true);
			car.getWheel().setRotating(true);
			car.setActive(true);
			car.setAmountOfFuel(temp - car.getEngine().getFuelСonsumption());
			Thread.sleep(1000);
		}
		car.getEngine().setActive(false);
		car.getWheel().setRotating(false);
		car.setActive(false);
		System.out.println("Топливо закончилось!");
	}
	
	public void fillTheTank(Car car, int fuel) {
		if((car.getAmountOfFuel() + fuel) < car.getTank()) {
			car.setAmountOfFuel(fuel);
		} else {
			car.setAmountOfFuel(car.getTank());
		}
	}
	
	public void replaceWheel(Wheel wheel) {
		wheel = new Wheel();
	}

}
