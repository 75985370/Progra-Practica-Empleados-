package capa.presentacion;
import java.util.ArrayList;
import java.util.Scanner;
public class Testempleado {
	public static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Directivo> directivo=new ArrayList<Directivo>();
		ArrayList<Oficial> oficial=new ArrayList<Oficial>();
		ArrayList<Tecnico> tecnico=new ArrayList<Tecnico>();
		int opcion;
		do {
			menu();
			opcion=in.nextInt();
			switch(opcion) {
			
			case 1:
				RegistraempleadoDirectivo(directivo);
				break;
			case 2:
				Registraempleadooperario(oficial,tecnico);
				break;
			case 0:
				System.out.println("Espere unos minutos el sistema esta guardando datos..");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=0);

	}
	public static void menu() {
		System.out.println("========================REGISTRO EMPLEADOS====================");
		System.out.println("1.Registro Empleado Directivo");
		System.out.println("2.Registro Empleado operario");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void RegistraempleadoDirectivo(ArrayList<Directivo> directivo) {
		int option;
		do {
			menu_D();
			option=in.nextInt();
			switch(option) {
			case 1:
				nuevodirectivo(directivo);
				break;
			case 2:
				listardirectivo(directivo);
				break;
			case 3:
				Eliminardirectivo(directivo);
				break;
			case 4:
				Editardirectivo(directivo);
				break;
			case 0:
				System.out.println("Espere un momento porfavor\n");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(option!=0);
	}
	public static void nuevodirectivo(ArrayList<Directivo> directivo) {
		System.out.print("Nombre:");
		in.nextLine();
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Ci:");
		int Ci=in.nextInt();
		System.out.print("Capacidad:");
		in.nextLine();
		String capacidad=in.nextLine();
		System.out.print("Profecion:");
		String profecion=in.nextLine();
		Directivo Directivo=new Directivo(nombre,apellido,Ci,capacidad,profecion);
		directivo.add(Directivo);
	}
	public static void listardirectivo(ArrayList<Directivo> directivo){
		for(int i=0; i<directivo.size(); i++) {
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("Directivo:"+(i+1)+" ◄ Nombre ►"+directivo.get(i).getNombre());
			System.out.println("Directivo:"+(i+1)+" ◄ Apellido ►"+directivo.get(i).getApellido());
			System.out.println("Directivo:"+(i+1)+" ◄ Ci ►"+directivo.get(i).getCi());
			System.out.println("Directivo:"+(i+1)+" ◄ Capacidad ►"+directivo.get(i).getCapacidad());
			System.out.println("Directivo:"+(i+1)+" ◄ Profecion ►"+directivo.get(i).getProfecion());
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		}
	}
	public static void 	Eliminardirectivo(ArrayList<Directivo> directivo) {
		System.out.println("Eliminar de la lista a directivo");
		System.out.println("Ingrese nombre: ");
		in.nextLine();
		int band=0;
		int Ci=in.nextInt();
		for(Directivo i:directivo) {
			if(i.getCi()==Ci) {
				directivo.remove(i);
				System.out.println("Directivo Eliminado!!!!!!!!!!!");
				band=1;
				break;
			}
		}
		if(band==0) {
			System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
		}
			
	}
	public static void Editardirectivo(ArrayList<Directivo> directivo) {
		System.out.println("CI Del Directivo: ");
		int Ci=in.nextInt();
		
		for(Directivo i:directivo) {
			if(i.getCi()==Ci) {
				EditarDatos(i);
				break;
			}
		
				
		}
	}
	public static void mostrarDirectivo(Directivo directivo) {
		
		System.out.println("Nombre ►"+directivo.getNombre());
		System.out.println("Apellido ►"+directivo.getApellido());
		System.out.println("Ci ►"+directivo.getCi());
		System.out.println("Capacidad ►"+directivo.getCapacidad());
		System.out.println("Profecion ►"+directivo.getProfecion());
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		
	}
	public static void EditarDatos(Directivo directivo) {
		mostrarDirectivo(directivo);
		System.out.println("========================================");
		System.out.println("Editando Datos de Directivo");
		System.out.println("========================================");
		in.nextLine();
		System.out.print("Nombre:");
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Capacidad:");
		String capacidad=in.nextLine();
		System.out.print("Profecion:");
		String profecion=in.nextLine();
		if(nombre!=null) {
			directivo.setNombre(nombre);
		}
		if(apellido!=null)
		{
			directivo.setApellido(apellido);
		}
		if(capacidad!=null){
			directivo.setCapacidad(capacidad);
		}
		if(profecion!=null) {
			directivo.setProfecion(profecion);
		}
}
	///////////////////////////
	public static void menu_D() {
		System.out.println("========================REGISTRO EMPLEADOS====================");
		System.out.println("1.Registrar Nuevo Directivo");
		System.out.println("2.Listar Directivo");
		System.out.println("4.Eliminar Directivo");
		System.out.println("4.Editar Directivo");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void Registraempleadooperario(ArrayList<Oficial> oficial,ArrayList<Tecnico> tecnico) {
		int option;
		do {
			menu_O();
			option=in.nextInt();
			switch(option) {
			case 1:
				RegistroOficial(oficial);
				break;
			case 2:
				Registrotecnico(tecnico);
				break;
			case 0:
				System.out.println("Espere un momento porfavor\n");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(option!=0);
	}
	
	public static void menu_O() {
		System.out.println("========================REGISTRO EMPLEADOS====================");
		System.out.println("1.Registro Oficial");
		System.out.println("2.Registro Tecnico");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void RegistroOficial(ArrayList<Oficial> oficial) {
		int Opciones;
		do {
			menu_OF();
			Opciones=in.nextInt();
			switch(Opciones) {
			case 1:
				AñadirNuevoOficial(oficial);
				break;
				
			case 2:
				ListaOficial(oficial);
				break;
			case 3:
				
				EliminarOficial(oficial);
				break;
			case 4:
				EditarOficial(oficial);
			case 0:
				System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(Opciones!=0);
	}
	public static void AñadirNuevoOficial(ArrayList<Oficial> oficial) {
		System.out.print("Nombre:");
		in.nextLine();
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Ci:");
		int Ci=in.nextInt();
		System.out.print("Contrato:");
		in.nextLine();
		String contrato=in.nextLine();
		System.out.print("Oficio:");
		String oficio=in.nextLine();
		Oficial Oficial=new Oficial(nombre,apellido,Ci,contrato,oficio);
		oficial.add(Oficial);
	}
	public static void 	EliminarOficial(ArrayList<Oficial> oficial) {
		System.out.println("Eliminar de la lista a oficial");
		System.out.println("Ingrese Ci: ");
		in.nextLine();
		int band=0;
		int Ci=in.nextInt();
		for(Oficial i:oficial) {
			if(i.getCi()==Ci) {
				oficial.remove(i);
				System.out.println("Oficial Eliminado!!!!!!!!!!!");
				band=1;
				break;
			}
		}
		if(band==0) {
			System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
		}
			
	}
	public static void ListaOficial(ArrayList<Oficial> oficial){
		for(int i=0; i<oficial.size(); i++) {
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("Directivo:"+(i+1)+" ◄ Nombre ►"+oficial.get(i).getNombre());
			System.out.println("Directivo:"+(i+1)+" ◄ Apellido ►"+oficial.get(i).getApellido());
			System.out.println("Directivo:"+(i+1)+" ◄ CI ►"+oficial.get(i).getCi());
			System.out.println("Directivo:"+(i+1)+" ◄ Contrato ►"+oficial.get(i).getContrato());
			System.out.println("Directivo:"+(i+1)+" ◄ Oficio ►"+oficial.get(i).getOficio());
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		}
	}
	public static void EditarOficial(ArrayList<Oficial> oficial){
		System.out.println("CI Del Oficial: ");
		int Ci=in.nextInt();
		
		for(Oficial i:oficial) {
			if(i.getCi()==Ci) {
				EditarDatos(i);
				break;
			}
		
				
		}
	}
	public static void mostraroficial(Oficial oficial) {
		
		System.out.println("Nombre ►"+oficial.getNombre());
		System.out.println("Apellido ►"+oficial.getApellido());
		System.out.println("Ci ►"+oficial.getCi());
		System.out.println("Capacidad ►"+oficial.getContrato());
		System.out.println("Capacidad ►"+oficial.getOficio());
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		
	}
	public static void EditarDatos(Oficial oficial) {
		mostraroficial(oficial);
		System.out.println("========================================");
		System.out.println("Editando Datos de Oficial");
		System.out.println("========================================");
		in.nextLine();
		System.out.print("Nombre:");
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Contrato:");
		String contrato=in.nextLine();
		System.out.print("Oficio:");
		String oficio=in.nextLine();
		if(nombre!=null) {
			oficial.setNombre(nombre);
		}
		if(apellido!=null)
		{
			oficial.setApellido(apellido);
		}
		if(contrato!=null){
			oficial.setContrato(contrato);
		}
		if(oficio!=null){
			oficial.setOficio(oficio);
		}
	}
	public static void menu_OF() {
		System.out.println("========================REGISTRO OFICIAL====================");
		System.out.println("1.Nuevo Oficial");
		System.out.println("2.Lista Oficial");
		System.out.println("3.Eliminar Oficial");
		System.out.println("4.Editar Oficial");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void Registrotecnico(ArrayList<Tecnico> tecnico) {
		int Opciones;
		do {
			menu_Tec();
			Opciones=in.nextInt();
			switch(Opciones) {
			case 1:
				AñadirNuevoTecnico(tecnico);
				break;
				
			case 2:
				Listatecnico(tecnico);
				break;
			case 3:
				Eliminartecnico(tecnico);
				break;
			case 4:EditarTecnico(tecnico);
				break;
			case 0:
				System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(Opciones!=0);
	}
	public static void AñadirNuevoTecnico(ArrayList<Tecnico> tecnico) {
		System.out.print("Nombre:");
		in.nextLine();
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Ci:");
		int Ci=in.nextInt();
		System.out.print("Puesto:");
		in.nextLine();
		String puesto=in.nextLine();
		Tecnico Tecnico=new Tecnico(nombre,apellido,Ci,puesto);
		tecnico.add(Tecnico);
	}
	public static void Listatecnico(ArrayList<Tecnico> tecnico){
		for(int i=0; i<tecnico.size(); i++) {
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("Directivo:"+(i+1)+" ◄ Nombre ►"+tecnico.get(i).getNombre());
			System.out.println("Directivo:"+(i+1)+" ◄ Apellido ►"+tecnico.get(i).getApellido());
			System.out.println("Directivo:"+(i+1)+" ◄ Ci ►"+tecnico.get(i).getCi());
			System.out.println("Directivo:"+(i+1)+" ◄ Puesto ►"+tecnico.get(i).getPuesto());
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		}
	}
	public static void 	Eliminartecnico(ArrayList<Tecnico> tecnico) {
		System.out.println("Eliminar de la lista a tecnico");
		System.out.println("Ingrese nombre: ");
		in.nextLine();
		int band=0;
		int Ci=in.nextInt();
		for(Tecnico i:tecnico) {
			if(i.getCi()==Ci) {
				tecnico.remove(i);
				System.out.println("tecnico Eliminado!!!!!!!!!!!");
				band=1;
				break;
			}
		}
		if(band==0) {
			System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
		}
			
	}
	public static void EditarTecnico(ArrayList<Tecnico> tecnico){
		System.out.println("CI Del Tecnico: ");
		int Ci=in.nextInt();
		
		for(Tecnico i:tecnico) {
			if(i.getCi()==Ci) {
				EditarDatos(i);
				break;
			}
		
				
		}
	}
	public static void mostrarTecnicos(Tecnico tecnico) {
		
		System.out.println("Nombre ►"+tecnico.getNombre());
		System.out.println("Apellido ►"+tecnico.getApellido());
		System.out.println("Ci ►"+tecnico.getCi());
		System.out.println("Capacidad ►"+tecnico.getPuesto());
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		
	}
	public static void EditarDatos(Tecnico tecnico) {
		mostrarTecnicos(tecnico);
		System.out.println("========================================");
		System.out.println("Editando Datos de Tecnicos");
		System.out.println("========================================");
		in.nextLine();
		System.out.print("Nombre:");
		String nombre=in.nextLine();
		System.out.print("Apellido:");
		String apellido=in.nextLine();
		System.out.print("Puesto:");
		String puesto=in.nextLine();
		if(nombre!=null) {
			tecnico.setNombre(nombre);
		}
		if(apellido!=null)
		{
			tecnico.setApellido(apellido);
		}
		if(puesto!=null){
			tecnico.setPuesto(puesto);
		}
	}
	public static void menu_Tec() {
		System.out.println("========================REGISTRO TECNICO====================");
		System.out.println("1.Nuevo Tecnico");
		System.out.println("2.Lista Tecnico");
		System.out.println("3.Eliminar Tecnico");
		System.out.println("4.Editar Tecnico");
		System.out.println("0. Salir");
		System.out.print("►►►");
	}

}
