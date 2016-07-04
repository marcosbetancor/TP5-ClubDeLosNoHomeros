package ar.edu.unlam.PrograBasica2.TP2;

public class Cliente implements Comparable<Cliente> {
	private Integer edad;
	private String nombre;
	
	public Cliente(Integer edad, String nombre){
		
		this.edad = edad;
		this.nombre = nombre;
	
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Object obj){
		
		if(obj instanceof Cliente){
			
			Cliente diferente = (Cliente)obj;
			
			if(this.getNombre().equalsIgnoreCase(diferente.getNombre())&&
					this.getEdad().equals(diferente.getEdad())){
				
				return true;
			
			}else {
				
				return false;
				
			}
			
		} else {
			
			return false;
			
		}
		
	}
	
	/*Como sobreescribí el método equals estoy obligado a sobreescribir el 
	método hashCode()*/
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
}
	
	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public String toString(){
		
		return("Nombre: " + this.getNombre() + " Edad: " + this.getEdad() );
	}
}
