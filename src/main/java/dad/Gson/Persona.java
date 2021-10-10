package dad.Gson;

public class Persona {
	
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Persona() {
		this("Daniel","Cabrera Cabrera", 25); 
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		this.Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	
	public String toString() {
		return String.format("---------------\n"
				+ "Nombre: %s\n"
				+ "Apellidos: %s\n"
				+ "Edad: %d\n"
				+"---------------"
				,Nombre,Apellidos,Edad);
	}
	

}
