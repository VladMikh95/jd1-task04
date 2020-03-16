package by.htp.text.model;

public class Sentence {
	
	private String sentence = "";
	
	public Sentence() {
		
	}
	
	public Sentence(String str) {
		this.sentence = str;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public void add(Word word) {
		sentence = sentence + word.getWord();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null) {
				return false;
			}
		} else if (!sentence.equals(other.sentence)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}
	
	
	
	
}
