package by.htp.book.main;

import by.htp.book.bean.Book;
import by.htp.book.logic.BookLogic;
import by.htp.book.view.View;

/*
 *  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и 
 *  get- методы и метод  toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book, 
 *  с  подходящими  конструкторами  и  методами. Задать критерии выбора данных и вывести эти данные 
 *  на консоль. Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, 
 *  тип переплета. Найти и вывести:  
 *  a) список книг заданного автора;  
 *  b) список книг, выпущенных заданным издательством; 
 *  c) список книг, выпущенных после заданного года. 
 */
public class Main {

	public static void main(String[] args) {
		BookLogic bl = new BookLogic();
		View view = new View();
		Book[] books = new Book[] {new Book("Атлант расправил плечи", "Айн Рэнд", "Альпина", 2011, 1650, "50.00", "твердый"),
				new Book("Братья Карамазовы", "Федор Достоевский", "Эксмо", 2007, 800, "15.00", "твердый"),
				new Book("На едине с собой", "Марк Аврелий", "АСТ", 2017, 384, "14.00", "твердый"),
				new Book("Изучаем Java", "Кэтти Сьерра", "Эксмо", 2012, 704, "25.00", "мягкий"),
				new Book("Философия Java", "Брюс Эккель", "Питер", 2009, 638, "65.00", "твердый"),
				new Book("Думай как математик", "Барбара Оакли", "Альпина", 2015, 243, "30.00", "мягкий")};
		
		view.print(books);
		System.out.println("/////////////");
		System.out.println("Поиск по автору");
		view.print(bl.findBookByAuthor(books, "Федор Достоевский"));
		System.out.println("/////////////");
		System.out.println("Поиск по издательству");
		view.print(bl.findBookByPublishingCompany(books, "Эксмо"));
		System.out.println("/////////////");
		System.out.println("Список книг выпущенных после");
		view.print(bl.findBookAfterYear(books, 2010));
		

	}

}
