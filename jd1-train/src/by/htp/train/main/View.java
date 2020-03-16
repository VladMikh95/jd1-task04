package by.htp.train.main;

import java.util.Scanner;

public class View {
	
	private Scanner scan = new Scanner(System.in);
	
	private int number;
	
	public int getNumber() {
		return this.number;
	}

	public void start() {
		System.out.println("Введите номер поезда:");
		
		while(scan.hasNextInt() == false) {
			System.out.println("Необходимо ввести число");
			System.out.print("Введите номер поезда:");
		}    
		number = scan.nextInt();
	}
	
	public void printTrain(Train t) {
		if (t == null) {
			System.out.println("Поезд отсутствует");
			return;
		}
		
		System.out.print("Пункт назначения: ");
		if((t.getA() == null) || (t.getA() == " ")) {
			System.out.print("Пункт назначения нуждается в коректировке");
		} else {
			System.out.print(t.getA());
		}
		
		System.out.print(" Номер поезда: ");
		System.out.print(" " + t.getNumberTrain() + " ");
		
		
		System.out.print("Дата отправления: ");
		if (t.getTime().getYear() == 0) {
			System.out.println("Дата нуждается в корректировке");
		} else {
			System.out.println(t.getTime().getDate());
		}
	}
	

}
