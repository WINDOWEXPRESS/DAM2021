import java.io.*;
import java.util.*;
// ejemplo para números enteros
public class ArrayListEjemplo
{
 public static void main(String [] args)
 {

	ArrayList <Integer> numeros = new ArrayList<>();
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
	// Podemos visualizarlo como un array con get, y a partir de cualquier posicion
	System.out.println("Visualizaci\u00f3n en order inverso ");
	for(int x=numeros.size()-1;x>=0;x--)
		System.out.print(numeros.get(x)+"  ");		
 }
}
