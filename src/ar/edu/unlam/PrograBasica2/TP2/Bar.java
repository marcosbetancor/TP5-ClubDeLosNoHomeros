package ar.edu.unlam.PrograBasica2.TP2;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Bar {
	
	private TreeSet<Cliente>lista;
	private boolean abierto;
	private Integer genteadentro=0;
	
	public Bar(){
		
		this.lista =new TreeSet<Cliente>();
		abierto = false;
	}
	
	public Bar(TreeSet<Cliente> lista){
		
		this.lista.addAll(lista);
		
	}
	
	public Bar(CompararClientePorEdad comparar){
		
		this.lista = new TreeSet<Cliente>();
		
	}
	
	public void ingresaCliente(Cliente nuevoCliente){
		
		if(abierto){
			
			lista.add(nuevoCliente);
			genteadentro ++;
		
		} else {
			
			
		}
	}

	public TreeSet<Cliente> getLista() {
		return lista;
	}

	public void setLista(TreeSet<Cliente> lista) {
		this.lista = lista;
	}
	
	public Integer getGenteAdentro(){
		return genteadentro;
	}
	
	public void setGenteAdentro(Integer genteadentro){
		
		this.genteadentro = genteadentro;
	}
	public void presentaClientes(){
		
		Iterator<Cliente> cliente = lista.iterator();
		while(cliente.hasNext()){
			try{			
				System.out.println((cliente.next()).toString());
			}catch(NullPointerException e){
				System.err.println("El cliente quebró y se fue a la casa");
			}
		}
		
	}
	
	
	public void abrirBar(){
		abierto = true;
	}
	
	public void cerrarBar(){
		abierto = false;
	}
	
	public boolean verEstadoDelBar(){
		return abierto;
	}
	
}
