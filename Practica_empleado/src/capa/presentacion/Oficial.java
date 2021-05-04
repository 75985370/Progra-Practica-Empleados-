package capa.presentacion;

public class Oficial extends Empleado{
	String Contrato;
	String oficio;
	public String getContrato() {
		return Contrato;
	}
	public void setContrato(String contrato) {
		Contrato = contrato;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public Oficial(String nombre, String apellido, int ci, String contrato, String oficio) {
		super(nombre, apellido, ci);
		Contrato = contrato;
		this.oficio = oficio;
	}
	public String toString() {
		String Dato= "contrato: "+this.Contrato+"\noficio:"+this.oficio;
		return Dato;
	}
}
