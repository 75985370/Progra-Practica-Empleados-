package capa.presentacion;

public class Tecnico extends Empleado{
	String Puesto;

	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String Puesto) {
		this.Puesto=Puesto;
	}
	
	public Tecnico(String nombre, String apellido, int ci, String puesto) {
		super(nombre, apellido, ci);
		Puesto = puesto;
	}


	public String toString() {
		String pos= "contrato: "+this.Puesto;
		return pos;
	}

}
