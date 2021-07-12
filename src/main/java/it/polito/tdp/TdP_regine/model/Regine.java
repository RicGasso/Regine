package it.polito.tdp.TdP_regine.model;

import java.util.*;

public class Regine {
	
	private int N;
	private List<Integer> soluzione;
	
	
	public List<Integer> risolvi(int N){
		this.N= N;
		List<Integer> parziale = new ArrayList<Integer>();
		this.soluzione = null;
		
		cerca(parziale, 0);
		
		return this.soluzione;
	}
	
	// N è il numero di righe e colonne della scacchiera
	// righe e colonne sono numerate da 0 a n-1
	// ad ogni livello posizioniamo una regina in nuova riga
	
	
	// sol parziale: lista delle colonne in cui mettere le regine
	// livello = quante righe sono già piene
	// livello = 0 -> nessuna riga piena (devo mettere la regina nella riga 0)
	// livello = 3 -> 3 righe piene (0 1 2), devo mettere la regina nella riga 3
	
	//cerca = true : trovato; cerca = false : continua
	private boolean cerca(List<Integer> parziale, int livello) {
		if(livello == N) {
			//caso terminale
			System.out.println(parziale);
			this.soluzione=new ArrayList<>(parziale);
			return true;
			
		}else {
			for (int colonna = 0; colonna<N; colonna++) {
				//if la possa mettere nella casella[livello][colonna] è valida
				//se sì, aggiungi a parziale e fai ricorsione
				
				if(posValida(parziale, colonna, livello)) {
					parziale.add(colonna);
					boolean trovato = cerca(parziale, livello+1);
					if(trovato)
						return true;
					parziale.remove(parziale.size()-1); //backtracking 
					
				}
				
			}
			return false;
		}
	}

	private boolean posValida(List<Integer> parziale, int colonna, int livello) {
		// controlla se viene mangiata in verticale
		if(parziale.contains(colonna))
			return false;
		//controlla le diagonali: devo confrontare la posizione(livello, colonna) con (r,c)delle regine esistenti
		for(int r=0; r<livello; r++) {
			int c = parziale.get(r);
			
			if(r+c==livello+colonna || r-c==livello-colonna) {
				return false;
			}
		}
		
		return true; 
	}

}
