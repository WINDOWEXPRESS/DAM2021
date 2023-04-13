import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
// ejemplo para números enteros
public class HashSetEjemplo
{
 public static void main(String [] args)
 {

	HashSet <Integer> numeros = new HashSet<>();
	int valor;
	// obtener valores
	for(valor=1;valor<15;valor++)
	  numeros.add((int)(Math.random()*10));
    // visualizar valores con Iterator
	System.out.println("Visualizaci\u00f3n con un Iterator");
	Iterator <Integer>  ver = numeros.iterator();
    while(ver.hasNext())
      System.out.println(ver.next());	
   // podemos verlo como un array, con solo una instrucción
   System.out.println("Visualizaci\u00f3n como un solo elemento en un array");
    System.out.println(numeros);  
 }
}
