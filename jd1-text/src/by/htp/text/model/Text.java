package by.htp.text.model;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 * консоль текст, заголовок текста.  
 */
public class Text {
	
	private String header = "";
	
	private String body  = "";

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
		
	public void setHeader(Word word) {
		this.header = word.getWord();
	}
	
	public void setHeader(Sentence sentence) {
		this.header = sentence.getSentence();
	}
	
	public void add(Word word) {
		body = body + word.getWord();
	}
	
	public void add(Sentence sentence) {
		body = body + sentence.getSentence();
	}
	
	public void add(String string) {
		body = body + string;
	}
	
	public void printHeader() {
		System.out.println(header);
	}
	
	public void printBody() {
		System.out.println(body);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
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
		
		Text other = (Text) obj;
		if (body == null) {
			if (other.body != null) {
				return false;
			}
		} else if (!body.equals(other.body)) {
			return false;
		}
		
		if (header == null) {
			if (other.header != null) {
				return false;
			}
		} else if (!header.equals(other.header)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Text [header=" + header + ", body=" + body + "]";
	}

}
