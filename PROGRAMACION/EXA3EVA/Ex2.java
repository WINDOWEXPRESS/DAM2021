import java.io.*;
import java.io.File;
import java.io.FileFilter;

public class Ex2 {

	public static void main(String[] args)throws IOException, EOFException{
		File[] ficheros ;
		File ruta = new File("datos");
		
		FileFilter fileNombre = new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".dat");
			}
		};
		
		ficheros= ruta.listFiles(fileNombre);
		
		System.out.println("Los ficheros son:");
	    // Visualizar lista de los ficheros
	    for(int i = 0; i < ficheros.length; i++){
			System.out.println(ficheros[i].getName());
	    }
		System.out.println();
	}

}
