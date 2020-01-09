package EVA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carrera {

	static coche[] listaCoche;
	static int fecha=0;
	static String clima="";
	static int longitudCarrera=0;
	static circuito circuito1;
	
	public static void main(String[] args) throws IOException, InterruptedException{

		
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		int opcion=0;
		
		do {
		
		System.out.println("Indica una opcion");
		System.out.println("1 - Mostrar informacion coche");
		System.out.println("2 - Mostrar informacion circuito");
		System.out.println("3 - Crear circuito");
		System.out.println("4 - Crear coche");
		System.out.println("9 - Empezar carrera");
		System.out.println("0 - Salir");
		
		opcion = Integer.parseInt(lectura.readLine());

		
		switch(opcion){
		
		case 1:
			
			mostrarInfoCoche();
			
			break;
			
	   case 2:
			
			mostrarInfoCircuito();
			
			
			break;
			
		case 3:
			
			crearCircuito();
			
			break;
			

		case 4:
			
			crearVehiculo();
			
			break;
			
			
		case 9:
			
			empezarCarrera();
			
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
	
	private static void crearCircuito()throws IOException{

	
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		int longitud=0;
		String ubicacion="";
		String nombre="";
		
		
	 System.out.println("Nombre del circuito");
	 nombre = (lectura.readLine());	
	 
	 System.out.println("Longitud del circuito");
	 longitud = Integer.parseInt(lectura.readLine());
	 
	 System.out.println("Ubicacion del circuito");
	 ubicacion = (lectura.readLine());
			
	circuito1= new circuito (longitud,ubicacion,nombre);
		
	}

	private static void crearVehiculo() throws IOException{

	
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		int dorsal=0;
		String piloto="";
		int posicionGlobal=0;
		String modelo="";
		int cantidadCoches=0;
		
		
		System.out.println("Cuantos coches vas a crear para correr");
		cantidadCoches = Integer.parseInt(lectura.readLine());
		
		listaCoche =new coche[cantidadCoches];
		
		for (int i=0;i<cantidadCoches;i++) {
			
			
			System.out.println("Indica el dorsal del coche");
			dorsal = Integer.parseInt(lectura.readLine());
			
			System.out.println("Cual es el modelo del coche");
			modelo = (lectura.readLine());
			
			System.out.println("Quien es el piloto?");
			piloto = (lectura.readLine());
			
			System.out.println("Cual es su posicion global");
			posicionGlobal = Integer.parseInt(lectura.readLine());
			
			listaCoche[i]= new coche (dorsal,piloto,posicionGlobal,modelo);

		}

	}
		
	private static void mostrarInfoCoche() throws IOException {

		int informaciónDorsal=0;
				
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader(entrada);
		
		System.out.println("¿Cual es el dorsal del coche?");
		informaciónDorsal =Integer.parseInt(lectura.readLine());		
		
		
		for(int i=0;i<listaCoche.length;i++) {
						
			if(informaciónDorsal==listaCoche[i].getDorsal())
			{
				listaCoche[i].mostrarInformacion();
			}
			else
			{
				System.out.println("El numero de dorsal introducido es erroneo");
			}	
		}
		
	}
	
	private static void mostrarInfoCircuito() {
		
		circuito1.mostrarinfo();
	}
	
	private static void empezarCarrera() throws InterruptedException, IOException {

		 int distancia=0;
		 int aleatorio=0;
		 boolean salir=false;
		 final int META=30;
	

do {
		for(int i=0;i<listaCoche.length;i++)
		{
			
			aleatorio=(int) ((Math.random()*3)+1); // aleatorio de 1 a 3
			distancia=listaCoche[i].getDistanciaRecorrida();

			distancia+=aleatorio;
			listaCoche[i].setDistanciaRecorrida(distancia);
		
			if(listaCoche[i].getDistanciaRecorrida()>=META) {
				salir=true;			
				}
		}		
			//Pause for 3 seconds
			Thread.sleep(3000);

			
			circuito1.pintaCircuito(listaCoche);
						
}while(salir==false);		
		
		
	}	


}



