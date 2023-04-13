import java.io.*;
import java.util.*;  // para reconocer Collection, ArrayList, Iterator,...
/* Indicamos cuantos elementos deseamos. Obtenemos su valor de forma aleatoria y nos lo muestra
		lista1.java
*/		
class lista1
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
     elemento.add(numero);
	}	  
   int valor;
   Iterator  nodo = elemento.iterator();
   while( nodo.hasNext())
  {
      valor = (Integer)nodo.next( );
      System.out.println(valor+"  ");
  }
}
}