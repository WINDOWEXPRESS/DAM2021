import java.io.*;

class RegistroAutor
{
   int codigo;
   String nombre, apellidos, nacionalidad;
   
   public void separar(RegistroAutor registro, String linea)
   {
	 String [] datos;
	 String copia="";
	 int i, ini,fin;
     datos = linea.split(";"); 
     for(i=0;i<datos.length;i++)
	 {	       
       copia=""; 
	   if(i!=0)
	   {	   
		  copia = datos[i].substring(1,datos[i].length()-1);
		  switch(i)
          {
			case 1: nombre = copia;        nombre = completar(nombre,17);                break;
            case 2: apellidos = copia;     apellidos = completar(apellidos,24);          break;
            case 3:	nacionalidad = copia;  nacionalidad = completar(nacionalidad,15);    break;			
		  }
	   }		  
	     else
		  codigo = Integer.parseInt(datos[i]);	 
	 }  
   } 
     
	 public static String completar(String cadena, int longitud)
	 {
	   int i;
	   String copia="";
	   if(cadena.length()> longitud)
	   {	   
           if(cadena.charAt(0)=='"')
		        copia=cadena.substring(1,longitud);
		     else
				copia=cadena.substring(0,longitud); 		
	   }	
	     else
		 {			
		   if(cadena.charAt(0)=='"')
		      copia=cadena.substring(1, cadena.length());	 
             else
  			   copia=cadena.substring(0,cadena.length()); 	 		  
	       for(i=cadena.length();i<longitud;i++)
		     copia += " ";      
		 }
	//	System.out.println(copia+copia.length()); 
	   return copia.toUpperCase();
	 }
	 
	 
	 public static int buscar(String nombre, String apellidos)throws  IOException, EOFException
	 {
	   int i=1, z=0;
	   RegistroAutor fila = new RegistroAutor();
	   RandomAccessFile regAutorL = new RandomAccessFile("autor.dir","r");	 
	  // para que tenga el mismo formato
	   nombre = nombre.toUpperCase();
	   nombre = fila.completar(nombre,17);
	   apellidos = apellidos.toUpperCase();
	   apellidos = fila.completar(apellidos,24);
	   System.out.println(nombre+" "+apellidos);
	   try{
		   do{
			    regAutorL.seek(i*66);   
				try{ 
				fila.codigo = regAutorL.readInt();
				fila.nombre = regAutorL.readUTF();
			    fila.apellidos = regAutorL.readUTF();
			    fila.nacionalidad = regAutorL.readUTF();	
				}
				catch(IOException x )
				{ i++; }
	            if(fila.nombre.equals(nombre) && fila.apellidos.equals(apellidos))
				{							
	  			  regAutorL.close();					
				  return fila.codigo;						
				}	 			
				i++;
		   }while(i<72);
	   }
       catch(IOException x)	   
	   {
	    
	   }	  
	   regAutorL.close();
	   return 0;	 
	 }

// para el ejercicio 3
	 
	

}