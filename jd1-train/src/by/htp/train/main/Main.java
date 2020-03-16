package by.htp.train.main;

/*
 *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов 
 *  массива по номерам поездов.  Добавьте  возможность  вывода  информации  о  поезде,  номер  которого
 *  введен  пользователем.  Добавьте возможность сортировки массив по пункту назначения, причем поезда 
 *  с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 */
public class Main {

	public static void main(String[] args) {
		Train train;
		View v = new View();
		TrainLogic tl = new TrainLogic();
		Train[] t = new Train[] {new Train("Минск", 1, new Date(2020, 1, 3, 12, 10)),
				 new Train("Гомель", 2, new Date(2020, 1, 5, 10, 0)),
				 new Train("Москва", 3, new Date(2019, 1, 6, 12, 30)),
				 new Train("Могилев", 4, new Date(2020, 1, 3, 12, 0)),
				 new Train("Витебск", 5, new Date(2020, 1, 5, 12, 10))};
		
		v.start();
		train = tl.getTrainNum(t, v.getNumber());
		v.printTrain(train);

	}

}
