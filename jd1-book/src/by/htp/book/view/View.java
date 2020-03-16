package by.htp.book.view;

import java.util.List;

import by.htp.book.bean.Book;

public class View {
	
	public void print(Book[] books) {
		for(Book item : books) {
			System.out.println(item);
		}
	}
	
	public void print(List<Book> books) {
		for(Book item : books) {
			System.out.println(item);
		}
	}
}
