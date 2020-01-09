package EVA2;

public class circuito {
		
	int longitud=0;
	String ubicacion="";
	String nombre="";
	
	public circuito(int longitud, String ubicacion, String nombre) {
		this.longitud = longitud;
		this.ubicacion = ubicacion;
		this.nombre = nombre;	}
	public void mostrarinfo() {
		
		System.out.println("El circuito " + nombre + " contiene lo siguiente:");
		System.out.println("longitud: " + longitud + " KM");
		System.out.println("ubicacion: " + ubicacion);
		System.out.println("|---------------------------|");
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void pintaCircuito(coche listaCoche[])  {

		int dorsal=0;
		int distaciaRecorrida=0;
		String total="";
			
		
		for(int i=0;i<listaCoche.length;i++)
		{
		dorsal=listaCoche[i].getDorsal();
		
		distaciaRecorrida=listaCoche[i].getDistanciaRecorrida();
		
			for(int x=0;x<=distaciaRecorrida;x++) {
				
				System.out.print("*");
				
			}
			System.out.println("[" + dorsal + "]");
	
	
		}
		System.out.println("|----------------------------|");

		
	}	

}
