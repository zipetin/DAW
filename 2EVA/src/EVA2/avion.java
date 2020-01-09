package EVA2;

public class avion {

	String nombre="";
	int matricula=0;
	int numeroPasajeros=0;
	int queroseno=0;
	String compania="";
	String estado="";
	/*esto es un comentariooooooooooooo*/
	public avion(String nombre, int matricula, int numeroPasajeros, int queroseno, String compania, String estado) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.numeroPasajeros = numeroPasajeros;
		this.queroseno = queroseno;
		this.compania = compania;
		this.estado=estado;
	}

	
	public void mostrarInformacion()
	{
		
		System.out.println("A continuacion mostramos la informacion del avion: ");
		System.out.println("nombre: "+ nombre );
		System.out.println("matricula: " + matricula);
		System.out.println("numeroPasajeros: " + numeroPasajeros);
		System.out.println("queroseno: "+ queroseno);
		System.out.println("compania: "+ compania);
		System.out.println("estado: "+ estado);
		System.out.println("------------------------------------------");

		
	}
		
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getQueroseno() {
		return queroseno;
	}

	public void setQueroseno(int queroseno) {
		this.queroseno = queroseno;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
}

