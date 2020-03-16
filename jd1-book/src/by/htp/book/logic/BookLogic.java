package by.htp.book.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.bean.Book;

public class BookLogic {
	
	public List<Book> findBookByAuthor(Book[] books, String author) {
		List<Book> result = new ArrayList<Book>();
		
		for (Book b : books) {
			if (b.getAuthor().compareTo(author) == 0) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> findBookByPublishingCompany(Book[] books, String publishingCompany) {
		List<Book> result = new ArrayList<Book>();
		
		for (Book b : books) {
			if (b.getPublishingComapany().compareTo(publishingCompany) == 0) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> findBookAfterYear(Book[] books, int year) {
		List<Book> result = new ArrayList<Book>();
		
		for (Book b : books) {
			if (b.getYearOfPublishing() > year) {
				result.add(b);
			}
		}
		return result;
	}

}
