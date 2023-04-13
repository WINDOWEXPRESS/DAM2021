import java.util.*;
import java.io.*;

class ej2_b{
	public static void visualizar(String nombre){
		try{	
			FileInputStream entrada = new FileInputStream(nombre);
			DataInputStream registro = new DataInputStream(entrada);
			String cadena;
			cadena = registro.readUTF();
			while(nombre != null){
				System.out.println(cadena);
				cadena = registro.readUTF();
			}	
			registro.close();
		}
		catch(FileNotFoundException x){}
		catch(IOException X){}	   
	}
	
	public static void main(String [] args ) throws IOException, EOFException{
	int temperatura=0;	
	/*Lectura de los ficheros*/
	File [] ficheros;
	File ruta = new File("datos") ;
	int i, c, min=0, max=0, total;
	float media;
	String nombre="";
  
	//filtro de archivos q termina en .dat
	FileFilter filter = new FileFilter(){
		public boolean accept(File f){
			return f.getName().endsWith(".dat");
		}
    };
	
	//filtro de archivos q empieza en A
	/* FilenameFilter filter = new FilenameFilter() {
		public boolean accept(File f, String name){
            return name.startsWith("A");
        }
    };
   */
	ficheros = ruta.listFiles(filter);
	
	System.out.println("Los ficheros son:");
    // Visualizar lista de los ficheros
    for(i = 0; i < ficheros.length; i++){
		System.out.println(ficheros[i].getName());
    }
	System.out.println();
	
	
	//escribir archivos
	FileOutputStream salida = new FileOutputStream("temperatura.new");	
	DataOutputStream grabar = new DataOutputStream(salida);
	//leer archivos
	FileInputStream entrada;
	DataInputStream registro;
	
	int contador;
	for(i=0;i<ficheros.length;i++)
	{
		total=c=0;
		entrada = new FileInputStream(ficheros[i]);	
		registro = new DataInputStream(entrada);
		System.out.println("PROCESANDO LOS REGISTROS DE "+ficheros[i]+"\n");
		try{
			do{
			temperatura = registro.readInt();
		   
/*		   para visualizarlos datos del fichero
		  if(c==10)   {
             System.out.format("%3d\n",temperatura);			
			 c=0;			
		   }
		   else
			 System.out.format("%3d\t",temperatura);			  		 
	*/	   
			if(c==0)  // inicializo las variables máxima y mínima
				min=max=temperatura;
			c++;
			total = total + temperatura;
			if(min > temperatura)
				min = temperatura;
			if(max < temperatura)
				max = temperatura;		   
			}while(temperatura!=65635); 
		}
		catch (IOException x){}	 
		finally{
		 registro.close();			
		 media = total*1.0f / c;
		 nombre = (String) (ficheros[i].toString());
		 nombre = nombre.substring(6);
		 grabar.writeUTF(nombre+" minima "+min+" maxima "+max+" media "+media+"\n");		 
         System.out.println("Grabando registro de la provincia de "+nombre+"\n\n");
		}	
	}// fin del for 	  
	salida.close();
	visualizar("temperatura.new");	
	}  
}