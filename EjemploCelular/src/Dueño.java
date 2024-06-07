
public class Dueño {
	private String nombre;
	private String numero;
	private String dni;
	
	public Dueño(String nombre, String numero, String dni) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Dueño [nombre=" + nombre + ", numero=" + numero + ", dni=" + dni + "]";
	}
	
	
	
	
}
