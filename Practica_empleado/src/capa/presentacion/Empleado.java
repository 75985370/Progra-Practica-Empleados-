package capa.presentacion;

public class Empleado {
	String nombre;
	String apellido;
	int ci;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public Empleado(String nombre, String apellido, int ci) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
	}

}
