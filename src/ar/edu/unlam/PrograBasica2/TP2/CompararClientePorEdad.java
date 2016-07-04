package ar.edu.unlam.PrograBasica2.TP2;

import java.util.Comparator;

public class CompararClientePorEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return o1.getEdad() - o2.getEdad();
	}

}
