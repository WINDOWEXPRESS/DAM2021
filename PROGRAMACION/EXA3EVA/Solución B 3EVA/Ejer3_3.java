import java.io.*;
import java.util.*;

class Ejer3_3
{
   public static void main(String [] args)throws  IOException, EOFException
   {
	 Scanner dato = new Scanner(System.in);
	 int opcion=0, i, numautor;  
	 String ficAutorDir="AUTOR.DIR";
	 String [] menu = {"1.- BUSCAR UN AUTOR.", "2.- A\u00d1ADIR UN NUEVO ESCRITOR.", "3.- LISTADO DE LIBROS POR AUTOR.", "4.- LISTADO AUTORES", "5.- TERMINAR."};
	  do{
	      do{
			  for(i=0;i<menu.length;i++)
				  System.out.println(menu[i]);
			  try{
			     System.out.println("ELEGIR OPCION ");
			     opcion = dato.nextInt();
			  }
			  catch(Exception x)
              { System.out.println("DATO NO VALIDO. ES NUMERICO Y ENTERO.");
				dato.nextLine();
			  }			  			 
		  } while(opcion>5 || opcion<1);
		  switch(opcion)
		  {
			 case 1: Tres.buscarAutor(ficAutorDir);			break;
			 case 2: Tres.incluirAutor(ficAutorDir);		break;
			 case 3: numautor = Tres.listadoAutor(ficAutorDir,1);			       
			         if(numautor!=0)
					    Tres.listadoLibro("LIBRO.txt",numautor);
                       else
                         System.out.println("AUTOR INEXISTENTE");       break; 
			 case 4: numautor=Tres.listadoAutor(ficAutorDir,-1);	break;			 
  		  }
	  }while(opcion!=5);
   }   
}