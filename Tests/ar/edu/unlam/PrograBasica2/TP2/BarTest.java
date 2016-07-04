package ar.edu.unlam.PrograBasica2.TP2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BarTest {

	@Test
	public void mostrarClientesOrdenadosAlfabeticamente(){
		
		Bar bar = new Bar();
		
		Cliente cliente1 = new Cliente(20,"B");
		Cliente cliente2 = new Cliente(30, "C");
		Cliente cliente3 = new Cliente(18, "A");
		
		bar.abrirBar();
		
		bar.ingresaCliente(cliente1);
		bar.ingresaCliente(cliente2);
		bar.ingresaCliente(cliente3);
		
		bar.presentaClientes();
		
		assertEquals(cliente3.getNombre(), bar.getLista().first().getNombre());
				
	}
	
	@Test
	public void comprobarQueElBarEstaAbiertoSinClientes(){
		
		Bar bar = new Bar();
		
		bar.abrirBar();
		
		int sinclientes = 0;
		Boolean abierto = true;
		
		assertEquals(sinclientes, bar.getLista().size());
		assertEquals(abierto, bar.verEstadoDelBar());
		
	}



	@Test
	public void comprobarQueSoloEntraUnHomero(){
		
		Bar bar = new Bar();
		
		bar.abrirBar();
		
		Cliente cliente1 = new Cliente(20,"Homero");
		Cliente cliente2 = new Cliente(21, "Homero");
		Cliente cliente3 = new Cliente(30, "Carlos");
		
		bar.ingresaCliente(cliente1);
		bar.ingresaCliente(cliente2);
		bar.ingresaCliente(cliente3);
		
		int cantesperada = 2;
		
		assertEquals(cantesperada,bar.getLista().size());
		
	}
	
	@Test
	public void comprobarQueNoEntranClientesSiNoEstaAbierto(){
		
		Bar bar = new Bar();
		
		Cliente cliente1 = new Cliente(20,"Homero");
		Cliente cliente2 = new Cliente(21, "Marcos");
		Cliente cliente3 = new Cliente(30, "Carlos");
		
		bar.ingresaCliente(cliente1);
		bar.ingresaCliente(cliente2);
		bar.ingresaCliente(cliente3);
		
		Integer cantgenteadentro = 0;
		
		assertEquals(cantgenteadentro ,bar.getGenteAdentro());
	}


	@Test
	public void mostrarClientesOrdenadosPorEdad(){
		
		CompararClientePorEdad comparar = new CompararClientePorEdad();
		Bar bar = new Bar(comparar);
		
		Cliente cliente1 = new Cliente(35, "Jose");
		Cliente cliente2 = new Cliente(25, "Zonia");
		Cliente cliente3 = new Cliente(27, "Raul");
		Cliente cliente4 = new Cliente(26, "Carlos");
		Cliente cliente5 = new Cliente(26, "Jorge");
		
		bar.abrirBar();
		
		bar.ingresaCliente(cliente1);
		bar.ingresaCliente(cliente2);
		bar.ingresaCliente(cliente3);
		bar.ingresaCliente(cliente4);
		bar.ingresaCliente(cliente5);
	
		Integer edadesperada = 25;
		
		bar.presentaClientes();
		assertEquals(edadesperada, bar.getLista().first().getEdad());
		
	}
	
	@Test
	public void compararClientes(){
		
		Cliente cliente1 = new Cliente(20,"Carlos");
		Cliente cliente2 = new Cliente(20, "Carlos");
		Cliente cliente3 = new Cliente(21,"Calos");
		Cliente cliente4 = new Cliente(30,"Jose");
		
		assertEquals(true, cliente1.equals(cliente2));
		assertEquals(false, cliente1.equals(cliente3));
		assertEquals(false, cliente1.equals(cliente4));
		assertEquals(false, cliente3.equals(cliente4));
	}

}
