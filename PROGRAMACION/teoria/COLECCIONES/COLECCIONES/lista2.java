import java.io.*;
import java.util.*;  // para reconocer Collection, ArrayList, Iterator,...
/* Variación del anterior para buscar un elemento y lo borramos.
		lista2.java
*/		
class lista2
{
public static void main(String [] args) throws ClassCastException
{
   Scanner dato = new Scanner(System.in);
   //Collection  es un  interfaz y no puede instanciarse
   Collection  elemento = new ArrayList(); 
   int cuantos, numero;
   do{
      System.out.println("CUANTOS ELEMENTOS DESEA ENTRE 1 Y 25 ");
	  cuantos = dato.nextInt();  
	  }while(cuantos<0 || cuantos >25);
    for(int i=1;i<cuantos;i++)
	{
     numero = (int)(Math.random()*200);
	 System.out.print(numero+"   ");
     elemento.add(numero);
	}	  
   int valor, buscado;
   System.out.println("\nQUE ELEMENTO DESEA BORRAR ");
   buscado = dato.nextInt();
   Iterator  nodo = elemento.iterator();
   while( nodo.hasNext())
  {
      valor = (Integer)nodo.next( );
	  if(valor==buscado)
	     nodo.remove();      
  }
  // recorremos de nuevo para ver que no se encuentra en la lista.
  nodo = elemento.iterator();// que tome de nuevo los punteros.
  while( nodo.hasNext())
  {
      valor = (Integer)nodo.next( );
	  System.out.print(valor+" - ");
  }
  
  
}
}