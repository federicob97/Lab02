package it.polito.tdp.alienModel;

import java.util.*;

public class AlienDictionary {

	private List<Word> dictionary;
	
	
	
	public AlienDictionary() {
		this.dictionary = new ArrayList<Word>();
	}
	
	public void addWord(String alienWord, String translation) {
		boolean sostituita = false;
		Word w = new Word(alienWord,translation);
		
		for(Word x : dictionary) {
			if(x.equals(w)) {
				dictionary.remove(x);
				dictionary.add(w);
				sostituita=true;
				break;
			}
		}
		
		if(sostituita==false)
			dictionary.add(w);
	}
	
	public String getTranslate(String a) {
		String r="";
		boolean trovata = false;
		for(Word w : dictionary) {
			if(w.getAlienWord().compareTo(a)==0) {
				trovata=true;
				r = w.getTranslation();
				break;
			}
		}
		if(trovata==true)
			return r;
		else
			return "Parola Sconosciuta";
	}

	public void clearDictionary() {
		dictionary.clear();
	}
	
}
