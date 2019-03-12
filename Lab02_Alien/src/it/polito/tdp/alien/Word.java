package it.polito.tdp.alien;

public class Word {

	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord.toLowerCase();
		this.translation = translation.toLowerCase();
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Word w = (Word)arg0;
		if(this.alienWord.compareTo(w.getAlienWord())==0 && this.translation.compareTo(w.getTranslation())==0){
			return true;
		}
		else
			return false;
	}
	
	
	
}
