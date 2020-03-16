package by.htp.book.bean;

public class Book {
	
	/*
	 *  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  
toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и  методами. 
Задать критерии выбора данных и вывести эти данные на консоль.  
 
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
Найти и вывести:  
a) список книг заданного автора;  
b) список книг, выпущенных заданным издательством;  
c) список книг, выпущенных после заданного года. 

	 */
	
	private String name;
	
	private String author;
	
	private String publishingComapany;
	
	private  int yearOfPublishing;
	
	private int pageCount;
	
	private String price;
	
	private String typeOfBinding;
	
	public Book() {
		
	}
	
	public Book(String name, String author, String publishingCompany, int yearOfPublishing,
				int pageCount, String price, String typeOfBinding) {
		this.name = name;
		this.author = author;
		this.publishingComapany = publishingCompany;
		this.yearOfPublishing = yearOfPublishing;
		this.pageCount = pageCount;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingComapany() {
		return publishingComapany;
	}

	public void setPublishingComapany(String publishingComapany) {
		this.publishingComapany = publishingComapany;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pageCount;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((publishingComapany == null) ? 0 : publishingComapany.hashCode());
		result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
		result = prime * result + yearOfPublishing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		
		if (pageCount != other.pageCount) {
			return false;
		}
		
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		
		if (publishingComapany == null) {
			if (other.publishingComapany != null) {
				return false;
			}
		} else if (!publishingComapany.equals(other.publishingComapany)) {
			return false;
		}
		
		if (typeOfBinding == null) {
			if (other.typeOfBinding != null) {
				return false;
			}
		} else if (!typeOfBinding.equals(other.typeOfBinding)) {
			return false;
		}
		
		if (yearOfPublishing != other.yearOfPublishing) {
			return false;
		}	
		return true;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publishingComapany=" + publishingComapany
				+ ", yearOfPublishing=" + yearOfPublishing + ", pageCount=" + pageCount + ", price=" + price
				+ ", typeOfBinding=" + typeOfBinding + "]";
	}
	

}
