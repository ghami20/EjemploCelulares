import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Dueño Nicolas = new Dueño("Nicolas","1234","1234");
		Dueño Rodrigo = new Dueño("Rodrigo","1234","1234");

		Celular iphone12 = new Celular(Nicolas,"saskj2213","Iphone 12",10);
		
		Celular iphone15 = new Celular(Rodrigo,"saskj2213","Iphone 15",100);

		String[] menu = {
			"Llamar","Recargar bateria","Ver estado celular","Salir"	
		};
		int opcion = 0;
		do {
			opcion= JOptionPane.showOptionDialog(null, "Seleccione una opción", null, opcion, opcion, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duración de llamada"));
				iphone15.Llamar(iphone12, duracion);
				break;
			case 1:
				iphone15.recargarBateria();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, iphone15);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "See you next time...");
				break;
			default:
				break;
			}
		
		} while (opcion!=3);
		
		
	}
}
