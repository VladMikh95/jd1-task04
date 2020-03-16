package by.htp.customer.main;

import by.htp.customer.bean.Customer;
import by.htp.customer.logic.CustomerLogic;
import by.htp.customer.view.View;


/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
 * set- и get- методы и метод  toString().  Создать второй класс, агрегирующий массив типа  
 * Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести
 * эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, 
 * номер банковского счета. 
 * Найти и вывести: 
 * a) список покупателей в алфавитном порядке;  
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 */
public class Main {

	public static void main(String[] args) {
		View view = new View();
		CustomerLogic cl = new CustomerLogic();
		Customer[] customers = new Customer[] {new Customer(1, "Иванов", "Сергей", "Иванович", "ул.Ленина,д.11", 12345, 23654),
				new Customer(2, "Сидоров", "Андрей", "Семонович", "ул.Колоса,д.21", 17435, 56743),
				new Customer(3, "Петров", "Петр", "Петрович", "ул.Калинина,д.23", 53782, 17595),
				new Customer(4, "Иванов", "Иван", "Иванович", "ул.Ленина,д.1", 87653, 56890)};	
		
		System.out.println("Начальный массив клиентов");
		view.print(customers);
		System.out.println("////////////");
		System.out.println("Сортировка ФИО клиентов по алфавиту");
		cl.sortByName(customers);
		view.print(customers);
		System.out.println("////////////");
		System.out.println("Список клиентов в заданном диапазоне");
		view.print(cl.findCardInInterval(customers, 20000, 70000));
		System.out.println("////////////");
		
	}

}
