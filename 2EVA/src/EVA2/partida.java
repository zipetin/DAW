package EVA2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class partida {
	
	private static tablero tablero1;
	
	
public static void main(String[] args) throws IOException{
	
	InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader lectura = new BufferedReader(entrada);
	
	int opcion=0;
	
	do {
	System.out.println("Indica una opcion");
	System.out.println("1 - Mover ficha");
	System.out.println("0 - Salir");
	opcion = Integer.parseInt(lectura.readLine());
	
	switch(opcion){
	
	case 1:
		
		moverFicha();
		
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

private static void moverFicha() {
	// TODO Auto-generated method stub
	
}
	
}	
	
	

