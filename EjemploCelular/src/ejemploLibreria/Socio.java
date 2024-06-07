package ejemploLibreria;

import javax.swing.JOptionPane;

public class Socio {
	private  String nrosocio;
	private String nombre;
	private String dirección;
	private int cantidadLibros;
	public Socio(String nrosocio, String nombre, String dirección, int cantidadLibros) {
		super();
		this.nrosocio = nrosocio;
		this.nombre = nombre;
		this.dirección = dirección;
		this.cantidadLibros = cantidadLibros;
	}
	public String getNrosocio() {
		return nrosocio;
	}
	public void setNrosocio(String nrosocio) {
		this.nrosocio = nrosocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	@Override
	public String toString() {
		return "Socio [nrosocio=" + nrosocio + ", nombre=" + nombre + ", dirección=" + dirección + ", cantidadLibros="
				+ cantidadLibros + "]";
	}
	public void SolicitarPrestamo(Libro libro) {
		if (this.getCantidadLibros()>=10) {
			JOptionPane.showMessageDialog(null, "Tenes el máximo del ibros a prestar");
		} else {
			if (libro.isDisponible()) {
				JOptionPane.showMessageDialog(null,
						"Se realizará el prestamo del libro: " 
				+ libro.getTitulo()
				+" a la persona: " 
				+ this.getNombre() );
				libro.setDisponible(false);
				this.setCantidadLibros(this.getCantidadLibros()+1);
			} else {
				JOptionPane.showMessageDialog(null, libro.getTitulo() +  " Libro no disponible");
			}
		}
	}
	
}
