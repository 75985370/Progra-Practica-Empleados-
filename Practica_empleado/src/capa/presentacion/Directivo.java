package capa.presentacion;

public class Directivo extends Empleado {
	String Capacidad;
	String Profecion;
	public String getCapacidad() {
		return Capacidad;
	}
	public void setCapacidad(String capacidad) {
		Capacidad = capacidad;
	}
	public String getProfecion() {
		return Profecion;
	}
	public void setProfecion(String profecion) {
		Profecion = profecion;
	}
	public Directivo(String nombre, String apellido, int ci, String capacidad, String profecion) {
		super(nombre, apellido, ci);
		Capacidad = capacidad;
		Profecion = profecion;
	}
	public String toString() {
		String Dato= "Capacidad: "+this.Capacidad+"\nProfecion:"+this.Profecion;
		return Dato;
	}
	
	

}
