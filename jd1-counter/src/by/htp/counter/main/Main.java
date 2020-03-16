package by.htp.counter.main;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать 
 * или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите 
 * инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демонстрирующий все возможности 
 * класса.
 */

public class Main {

	public static void main(String[] args) {
		Counter counter  = new Counter();
		
		counter.initRandom();
		System.out.println(counter.getI());
		counter.plus();
		System.out.println(counter.getI());
		counter.minus();
		System.out.println(counter.getI());
		//Проверка обнулится ли счетчик при попытке увеличить счетчик больше заданного диапазона
		while (counter.getI() < counter.getMax()) {
			counter.plus();
		}
		System.out.println(counter.getI());
		counter.plus();
		System.out.println(counter.getI());
		
		counter.initRandom();
		System.out.println(counter.getI());
		counter.initStart();
		System.out.println(counter.getI());
		counter.minus();
		System.out.println(counter.getI());
		

	}

}
