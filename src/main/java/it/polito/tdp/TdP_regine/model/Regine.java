package it.polito.tdp.TdP_regine.model;

import java.util.*;

public class Regine {
	
	// N è il numero di righe e colonne della scacchiera
	// righe e colonne sono numerate da 0 a n-1
	// ad ogni livello posizioniamo una regina in nuova riga
	
	
	// sol parziale: lista delle colonne in cui mettere le regine
	// livello = quante righe sono già piene
	// livello = 0 -> nessuna riga piena (devo mettere la regina nella riga 0)
	// livello = 3 -> 3 righe piene (0 1 2), devo mettere la regina nella riga 3
	
	private void cerca(List<Integer> parziale, int livello) {
		if(livello == N) {
			//caso terminale
		}lese {
			for (int colonna = 0; colonna<N; colonna++) {
				//if la possa mettere nella casella[livello][colonna] è valida
				//se sì, aggiungi a parziale e fai ricorsione
			}
		}
	}

}
