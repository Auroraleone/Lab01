package it.polito.tdp.Lab01.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Parole {
	
	//private Map<String, String> parole;
	private List<String> paroleLista;
	//int contatore;
		
	public Parole() {
		//parole = new TreeMap<>();
		//contatore = 0;
		paroleLista = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//String s = p+contatore;
		//parole.put(s.toLowerCase(), p);
		paroleLista.add(p);
		//contatore++;

	}
	
	public List<String> getElenco() {
		LinkedList <String> lista = new LinkedList<String>(paroleLista);
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		//parole.clear();
		paroleLista.clear();
	}
	
	public void removeParola(String p) {
		paroleLista.remove(p);  

		
	}
			


}