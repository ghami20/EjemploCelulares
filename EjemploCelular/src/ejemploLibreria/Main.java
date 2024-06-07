package ejemploLibreria;

public class Main {
	public static void main(String[] args) {
		
		
		Socio yo = new Socio("1","Gamaliel","Corrientes 2036",8);
		
		Libro lunaDePluton = new Libro("10","Luna de pluton","dross",true);
	
		Libro Dune = new Libro("11","Dune","alguien",false);
		
		Libro Mistborn = new Libro("12","Mistborn","B.Sanderson",true);

		yo.SolicitarPrestamo(lunaDePluton);
		yo.SolicitarPrestamo(Dune);
		yo.SolicitarPrestamo(Mistborn);

	}
}
