import java.io.*;
import java.util.*;

class crearFicheros
{
	
	public static void main(String [] args) throws IOException, EOFException
	{
	   
	   String linea;	
	   RegistroAutor fila = new RegistroAutor();
	   FileReader ficTexto = new FileReader("AUTOR.txt");
	   BufferedReader registro = new BufferedReader(ficTexto);
	   RandomAccessFile regAutor = new RandomAccessFile("AUTOR.DIR","rw");	 
	   try{
	     while((linea = registro.readLine())!=null)
		 {	 
		    fila.separar(fila,linea);
		    System.out.println(fila.codigo+" "+fila.nombre+" "+fila.apellidos+" "+fila.nacionalidad);
			regAutor.seek((fila.codigo)*66);			
			regAutor.writeInt(fila.codigo);
			regAutor.writeUTF(fila.nombre);
			regAutor.writeUTF(fila.apellidos);
			regAutor.writeUTF(fila.nacionalidad);			
	     }
	   }
       catch(EOFException x)	   
	   {ficTexto.close();
	    regAutor.close();
	   }
	  
	}
}