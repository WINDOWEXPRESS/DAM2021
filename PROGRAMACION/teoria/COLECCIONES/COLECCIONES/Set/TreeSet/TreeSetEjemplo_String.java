import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class TreeSetEjemplo_String
{
	//Con cadenas de caracteres que introducimos por teclado.
 public static void main(String [] args)
 {
    Scanner dato = new Scanner(System.in);
	String cadena="";
	TreeSet <String> palabra = new TreeSet<String>();
	int valor;
	// obtener valores
	for(valor=1;valor<5;valor++)
	{	
      System.out.print("Dame un nombre: ");
	  cadena = dato.next();
	  palabra.add(cadena);
	}  
    // visualizar valores
	System.out.println("Visualización con un Iterator elemento a elemento");
	Iterator <String>  ver = palabra.iterator();
    while(ver.hasNext())
      System.out.println(ver.next());	
   // podemos verlo como un array todo junto 
   System.out.println("Visualización como una cadena todos los elementos juntos");
    System.out.println(palabra);  	
	//Visualización con un for each
	System.out.println("Visualización con un for each");
	for( String num : palabra) 
      System.out.println(num);
    System.out.println("Cuantos elementos tenemos "+palabra.size());
   
 }
}
