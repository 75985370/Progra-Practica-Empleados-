package capa.presentacion;

public class Operario extends Empleado{
String Cargo;
String funciones;
public String getCargo() {
	return Cargo;
}
public void setCargo(String cargo) {
	Cargo = cargo;
}
public String getFunciones() {
	return funciones;
}
public void setFunciones(String funciones) {
	this.funciones = funciones;
}

public Operario(String nombre, String apellido, int ci, String cargo, String funciones) {
	super(nombre, apellido, ci);
	Cargo = cargo;
	this.funciones = funciones;
}
public String toString() {
	String Ope= "Cargo: "+this.Cargo+"\nFunciones:"+this.funciones;
	return Ope;
}
}
