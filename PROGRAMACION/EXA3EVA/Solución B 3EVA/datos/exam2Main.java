import java.io.*;
import java.util.*;
public class exam2Main{
	public static void main(String [] args) throws IOException{
		String provincia;
		exam2 dato = new exam2(); 
		Scanner dato1 = new Scanner(System.in);
		
		File fichero;
		System.out.println("Escribe el nombre de la provincia:");
		provincia = dato1.next();
		fichero = new File(provincia);
		if ( fichero.exists()){
			dato.getTempMinima(fichero);  
			dato.getTempMaxima(fichero);  
			dato.getTempMedia(fichero);  
			dato.guardar(fichero);
		}
		
   }
}