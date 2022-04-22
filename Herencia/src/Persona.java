
public class Persona {
	private long dni;
	private String nombre;

	public Persona() {
		dni = -1;
		nombre = "";
	}

	public Persona(long nuevoDni, String nuevoNombre) {
		this.dni = nuevoDni;
		this.nombre = nuevoNombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
