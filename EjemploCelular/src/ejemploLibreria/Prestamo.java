package ejemploLibreria;

public class Prestamo {

	
	private String nrosocio;
	private String codigo;
	private String fecha;
	public Prestamo(String nrosocio, String codigo, String fecha) {
		super();
		this.nrosocio = nrosocio;
		this.codigo = codigo;
		this.fecha = fecha;
	}
	public String getNrosocio() {
		return nrosocio;
	}
	public void setNrosocio(String nrosocio) {
		this.nrosocio = nrosocio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Prestamo [nrosocio=" + nrosocio + ", codigo=" + codigo + ", fecha=" + fecha + "]";
	}
	
	
}
