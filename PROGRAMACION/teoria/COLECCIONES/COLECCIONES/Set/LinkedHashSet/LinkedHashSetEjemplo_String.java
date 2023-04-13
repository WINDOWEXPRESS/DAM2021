import java.io.*;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedHashSetEjemplo_String
{
	//Con cadenas de caracteres que introducimos por teclado.
 public static void main(String [] args)
 {
    Scanner dato = new Scanner(System.in);
	String cadena="";
	LinkedHashSet <String> palabra = new LinkedHashSet<String>();
	int valor;
	// obtener valores
	for(valor=1;valor<5;valor++)
	{	
      System.out.print("Dame un nombre: ");
	  cadena = dato.next();
	  palabra.add(cadena);
	}  
    // visualizar valores
	System.out.println("Visualizaci\u00f3n con un Iterator elemento a elemento");
	Iterator <String>  ver = palabra.iterator();
    while(ver.hasNext())
      System.out.println(ver.next());	
   // podemos verlo como un array todo junto 
   System.out.println("Visualizaci\u00f3n como una cadena todos los elementos juntos");
    System.out.println(palabra);  	
	//Visualización con un for each
	System.out.println("Visualizaci\u00f3n con un for each");
	for( String num : palabra) 
      System.out.println(num);
    System.out.println("Cuantos elementos tenemos "+palabra.size());
   
 }
}
