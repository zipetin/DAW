package EVA2;

public class coche {
	
	int dorsal=0;
	String piloto="";
	int posicionGlobal=0;
	String modelo="";
	int distanciaRecorrida=0;
	
public coche(){
	dorsal=0;
	piloto="";
	posicionGlobal=0;
	modelo="";
	distanciaRecorrida=0;
	}

public coche(int indorsal, String inpiloto, int inposicionGlobal, String inmodelo) {

	this.dorsal = indorsal;
	this.piloto = inpiloto;
	this.posicionGlobal = inposicionGlobal;
	this.modelo = inmodelo;
	this.distanciaRecorrida = 0;
}

public coche(int indorsal, String inpiloto, int inposicionGlobal, String inmodelo, int indistanciaRecorrida) {

	this.dorsal = indorsal;
	this.piloto = inpiloto;
	this.posicionGlobal = inposicionGlobal;
	this.modelo = inmodelo;
	this.distanciaRecorrida = indistanciaRecorrida;
}

public void mostrarInformacion()
{
	
	System.out.println("A continuacion mostramos la informacion del vehiculo: ");
	System.out.println("dorsal: "+ dorsal );
	System.out.println("modelo: " + modelo);
	System.out.println("piloto: " + piloto);
	System.out.println("posicionGlobal: "+ posicionGlobal);
	System.out.println("------------------------------------------");

	
}

public int getDorsal() {
	return dorsal;
}

public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}

public String getPiloto() {
	return piloto;
}

public void setPiloto(String piloto) {
	this.piloto = piloto;
}

public int getPosicionGlobal() {
	return posicionGlobal;
}

public void setPosicionGlobal(int posicionGlobal) {
	this.posicionGlobal = posicionGlobal;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getDistanciaRecorrida() {
	return distanciaRecorrida;
}

public void setDistanciaRecorrida(int distancia) {
	this.distanciaRecorrida = distancia;
}
	
}
