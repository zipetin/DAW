package EVA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GestionAviones {
	

	static avion[] listaAviones;

	public static void main(String[] args) throws IOException{
	
	InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader lectura = new BufferedReader(entrada);
	
	int opcion=0;
	
	do {
	
	System.out.println("Indica una opcion");
	System.out.println("1 - Crea avion");
	System.out.println("2 - Repostar");
	System.out.println("3 - Orden despegar");
	System.out.println("4 - Orden aterrizar");
	System.out.println("5 - Mostrar informacion");
	System.out.println("0 - Salir");
	
	opcion = Integer.parseInt(lectura.readLine());

	
	switch(opcion){
	
	case 1:
		
		crearavion();
		
		break;
		
   case 2:
		
		repostar();
		
		
		break;
		
		case 3:
		
		despegar();
		
		break;
		
		
	case 4:
		
		aterrizar();
		
		break;
	
		
	case 5:
		
		mostrarInformacion();
		
		break;
	
	case 0:
		
		System.out.println("Ha salido correctamente");
		
		break;
		
		
	default:
		
		System.out.println("Error");
		
		break;
		
	
	}
	
	}while(opcion!=0);
	
}
	
	/**
	 * Realiza la orden de Aterrizar. Solicitando matricula para setear el estado a parado
	 * 
	 */
	private static void aterrizar() throws IOException {

		int matricula=0;
				
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		System.out.println("¿indica la matricula matricula que aterrizará?");
		matricula =Integer.parseInt(lectura.readLine());
		
	
		for(int i=0;i<listaAviones.length;i++) {
			
		
		if(matricula==listaAviones[i].getMatricula())
			{
				System.out.println("Avion con matricula " + matricula + " puede aterrizar");
				listaAviones[i].setEstado("parado");
			}
					else
					{
						System.out.println("La matricula es erronea");
					
					}
			}
	}		
	
	


	/**
	 * Realiza la orden de Despegar. Solicitando destino,consumo y matricula del avion
	 *
	 * 
	 */
	private static void despegar()throws IOException {

		int matricula=0;
		String destino="";
		int consumo=0;
		int querosenoDespegar=50;
				
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		System.out.println("¿Cual es el destino?");
		destino =(lectura.readLine());		
		
		System.out.println("¿Cuantos Kilometros?");
		consumo =Integer.parseInt(lectura.readLine());
		
		System.out.println("¿indica la matricula matricula?");
		matricula =Integer.parseInt(lectura.readLine());
		
		for(int i=0;i<listaAviones.length;i++) {
				
			if(matricula==listaAviones[i].getMatricula())
			{
					
					if(listaAviones[i].getQueroseno()>=querosenoDespegar)
					{
						System.out.println("Tienes el combustible para poder despegar, para llegar a " + destino + " gastaras los sigueintes litros de combustible: " + consumo);
						
						listaAviones[i].setEstado("volando");
					}
					else
					{
						System.out.println("No tienes combustible suficiente");
					
					}
			}
		
		}
		
		
	}


	/**
	 * Realiza Repostar. Solicita matricula y el queroseno a repostar, finalmente lo suma a lo que ya tenia el avion
	 *
	 * 
	 */
	
	
	private static void repostar() throws IOException {

		int matricula=0;
		int repostarQueroseno=0;
		int querosenoactual=0;
		int querosenofinal=0;
				
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		System.out.println("¿indica la matricula matricula?");
		matricula =Integer.parseInt(lectura.readLine());
		
		System.out.println("¿Cuanto quieres repostar?");
		repostarQueroseno =Integer.parseInt(lectura.readLine());	
		
		
		for(int i=0;i<listaAviones.length;i++) {
		
		if(matricula==listaAviones[i].getMatricula())
		{
			querosenoactual=querosenoactual+listaAviones[i].getQueroseno();
			querosenofinal=querosenoactual+repostarQueroseno;
			listaAviones[i].setEstado("parado");
			listaAviones[i].setQueroseno(querosenofinal);
		}
		else
		{
			System.out.println("El numero de dorsal introducido es erroneo");
		
		}
		
		}
		
	}

	/**
	 * Mostrar informacion de avion.
	 *
	 * 
	 */
	private static void mostrarInformacion()throws IOException {

		int matricula=0;
				
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		System.out.println("¿indica la matricula matricula?");
		matricula =Integer.parseInt(lectura.readLine());		
		
		for(int i=0;i<listaAviones.length;i++) {
				
			if(matricula==listaAviones[i].getMatricula())
			{
				listaAviones[i].mostrarInformacion();
			}
			else
			{
				System.out.println("La matricula es erronea");
			
			}
	}
	}

	/**
	 * Crearavion. Solicita el nombre,matricula,numero de pasajeros,queroseno y la compañia a la que pertenece
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static void crearavion()throws IOException{

	
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		
		int cantidadAviones=0;
		String nombre="";
		int matricula=0;
		int numeroPasajeros=0;
		int queroseno=0;
		String compania="";
		String estado="parado";
	
	System.out.println("Cuantos aviones vas a crear?");
	cantidadAviones = Integer.parseInt(lectura.readLine());
	
	listaAviones =new avion[cantidadAviones];
	
	for (int i=0;i<cantidadAviones;i++)
		{		
		 System.out.println("Nombre");
		 nombre = (lectura.readLine());	
		 
		 System.out.println("Matricula");
		 matricula = Integer.parseInt(lectura.readLine());
		 
		 System.out.println("Numero de pasajeros");
		 numeroPasajeros = Integer.parseInt(lectura.readLine());
		 
		 System.out.println("cuanto queroseno");
		 queroseno = Integer.parseInt(lectura.readLine());
		 
		 System.out.println("Compañia?");
		 compania = (lectura.readLine());
		
		listaAviones[i]= new avion (nombre,matricula,numeroPasajeros,queroseno,compania,estado);
		}

}
	
}