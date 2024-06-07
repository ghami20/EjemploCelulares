import javax.swing.JOptionPane;

public class Celular {
	private Dueño dueño;
	private String imei;
	private String modelo;
	private int bateria;
	public Celular(Dueño dueño, String imei, String modelo, int bateria) {
		super();
		this.dueño = dueño;
		this.imei = imei;
		this.modelo = modelo;
		this.bateria = bateria;
	}
	public Dueño getDueño() {
		return dueño;
	}
	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	@Override
	public String toString() {
		return "Celular [dueño=" + dueño + ", imei=" + imei + ", modelo=" + modelo + ", bateria=" + bateria + "]";
	}
	
	public void Llamar(Celular receptor , int duracion) {
		
		if (this.bateria>0 && this.bateria>=duracion) {
			if (receptor.getBateria()>0 && receptor.getBateria()>=duracion) {
				JOptionPane.showMessageDialog(null, "Estas llamando al contacto " + receptor.getDueño().getNombre() +" Con numero"+ receptor.getDueño().getNumero() );
				receptor.setBateria(receptor.getBateria()- duracion);
				this.setBateria(this.getBateria()- duracion);

			} else {
				JOptionPane.showMessageDialog(null,  receptor.getDueño().getNombre() + " no tiene suficiente bateria");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Bateria insuficiente Cargar celular");
		}
		
	}
	public void recargarBateria() {
		int cantidad = 100;
		
		JOptionPane.showMessageDialog(null, "Carga completa" );
		bateria=100;
	}
}

