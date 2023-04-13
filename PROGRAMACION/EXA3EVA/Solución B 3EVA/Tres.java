import java.io.*;
import java.util.*;

public class Tres
{
	static Scanner dato = new Scanner(System.in,"CP850");  
	static Scanner entnumero = new Scanner(System.in);  
    public static int listadoAutor(String directo, int num)throws  IOException, EOFException
	{
	   int i=1, z=0;
	   RegistroAutor fila = new RegistroAutor();
	   boolean salir = true;
	   String nombre="", apellidos="";
	   RandomAccessFile regAutor = new RandomAccessFile(directo,"r");	 
	   if(num==1)
	   {
		  System.out.println("NOMBRE DEL AUTOR ");
		  nombre = dato.nextLine();
		  nombre = nombre.toUpperCase();
		  RegistroAutor.completar(nombre,17);
		  System.out.println("APELLIDOS DEL AUTOR ");
		  apellidos = dato.nextLine();
		  apellidos = apellidos.toUpperCase();
		  RegistroAutor.completar(apellidos,24);
	   }  
	   else
		   System.out.println("CODIGO   NOMBRE\t\tAPELLIDOS\t\tNACIONALIDAD");
	   try{
		   do{
			    regAutor.seek(i*66);   
				try{ 
				fila.codigo = regAutor.readInt();
				fila.nombre = regAutor.readUTF();
			    fila.apellidos = regAutor.readUTF();
			    fila.nacionalidad = regAutor.readUTF();					     
				}
				catch(IOException x )
				{ i++; }
				if(num!=1)
				{	
				  if(fila.codigo>0 && fila.codigo<(int)(regAutor.length()/66))
				   {	
				     System.out.format("%4d\t%s%s%s\n",fila.codigo,fila.nombre,fila.apellidos,fila.nacionalidad);	
				     z++;
				   }
				}  
                 else
				 {
                    if(fila.nombre.contains(nombre) && fila.apellidos.contains(apellidos))
					{							
						regAutor.close();					
						return fila.codigo;						
					}	 
				 }	
				i++;
		   }while(i<(int)(regAutor.length()/66));
	   }
       catch(IOException x)	   
	   {
	    System.out.println("ULTIMO REGISTRO "+i);				
	   }	  
	   if(z>0)
	       System.out.println("REGISTROS "+z);
       regAutor.close();
	   return 0;
	}

	
	

	 public static void listadoLibro(String directo, int num)throws IOException
	{
	   int z=0, codigo, existencias, cod_autor;
	   boolean salir = true;
	   String titulo, tipo, editorial, precio, cadena;
	   titulo=tipo=editorial=precio="";
	   codigo=existencias=cod_autor=0;
	   String [] registro;
	   FileReader f = new FileReader(directo);
	   BufferedReader lectura = new BufferedReader(f);
	   while((cadena=lectura.readLine())!=null)
	   {
		  registro = cadena.split(";");
          if(num == Integer.parseInt(registro[6]))
		  {	 
		    System.out.println(registro[0]+" "+registro[1]+" "+registro[3]+" "+registro[4]);			
			z++;
		  }
	     
	    }
		 System.out.println("REGISTROS "+z);		   
			f.close();	   
	}	   
	  
	  
	  public static void buscarAutor(String directo)throws IOException
	  {
		int cod, n_autores;
		long tamanio;
		RegistroAutor fila = new RegistroAutor();
		RandomAccessFile regAutorL = new RandomAccessFile(directo,"r");	 
		System.out.println("Dame el c\u00f3digo del autor ");
		cod = entnumero.nextInt();
		tamanio = regAutorL.length();
		n_autores = (int)(tamanio/66);
		if(n_autores>=cod)
		{
		   regAutorL.seek(cod*66); 
		   fila.codigo = regAutorL.readInt();
		   fila.nombre = regAutorL.readUTF();
		   fila.apellidos = regAutorL.readUTF();
		   fila.nacionalidad = regAutorL.readUTF();	
		   if(fila.codigo!=0)
		     System.out.format("%4d\t%s%s%s\n",fila.codigo,fila.nombre,fila.apellidos,fila.nacionalidad);	
		    else
			 System.out.println("NO ESTA ALMACENADO ESE CODIGO");	
		}
	     else
		  System.out.println("EL FICHERO SOLO TIENE HASTA EL C\u00f2DIGO "+n_autores);	  
		regAutorL.close();
	  }
	  
	  public static void incluirAutor(String directo) throws IOException
	  {
		  RegistroAutor fila = new RegistroAutor();
		  String nombre="", apellidos="", nacionalidad="";
		  int numero, n_autores;
		  long tamanio;
		  RandomAccessFile regAutorL = new RandomAccessFile(directo,"rw");
          System.out.println("DATOS DEL AUTOR A A\u00d1ADIR: ");		  
		  System.out.println("NOMBRE DEL AUTOR ");
		  nombre = dato.nextLine().toUpperCase();
		  //nombre = nombre.toUpperCase();
		  RegistroAutor.completar(nombre,17);
		  System.out.println("APELLIDOS DEL AUTOR ");
		  apellidos = dato.nextLine().toUpperCase();
		  //apellidos = apellidos.toUpperCase();
		  RegistroAutor.completar(apellidos,24);  
		  System.out.println("NACIONALIDAD DEL AUTOR ");
		  nacionalidad = dato.nextLine().toUpperCase();
		  //apellidos = apellidos.toUpperCase();
		  RegistroAutor.completar(nacionalidad,15);
          System.out.println("CODIGO: " );
          numero = entnumero.nextInt();
          tamanio = regAutorL.length();
		  n_autores = (int)(tamanio/66);
		  if(n_autores>=numero)
		  {
		     regAutorL.seek(numero*66); 
             fila.codigo = regAutorL.readInt();
		     fila.nombre = regAutorL.readUTF();
		     fila.apellidos = regAutorL.readUTF();
		     fila.nacionalidad = regAutorL.readUTF();				 
			 if(fila.codigo!=0)
			  System.out.println("En esa posici\u00f3n esta "+fila.nombre+" "+fila.apellidos);	 
		     else
			 {
			   System.out.println("grabando"); 
			   regAutorL.seek(numero*66); 				   
               regAutorL.writeInt(numero);
		       regAutorL.writeUTF(RegistroAutor.completar(nombre,17));
		       regAutorL.writeUTF(RegistroAutor.completar(apellidos,24));
		       regAutorL.writeUTF(RegistroAutor.completar(nacionalidad,15));  			 
			 }				 
		  }
          else
		  {
			regAutorL.seek(n_autores*66); 		  
			System.out.println("Le cambiamos el c\u00f3digo por "+n_autores);
            regAutorL.writeInt(n_autores);
		    regAutorL.writeUTF(RegistroAutor.completar(nombre,17));
		    regAutorL.writeUTF(RegistroAutor.completar(apellidos,24));
		    regAutorL.writeUTF(RegistroAutor.completar(nacionalidad,15));  			 
		  }			  
		  regAutorL.close();
	  }
}