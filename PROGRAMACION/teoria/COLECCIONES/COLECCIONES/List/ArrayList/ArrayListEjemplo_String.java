import java.io.*;
import java.util.*;

public class ArrayListEjemplo_String
{
	//Con cadenas de caracteres que introducimos por teclado.
 public static void main(String [] args)
 {
    Scanner dato = new Scanner(System.in);
	String cadena="";
	ArrayList <String> palabra = new ArrayList<String>();
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
    System.out.println("Cuantos elementos tenemos "+palabra.size());
	System.out.println("Muestro un elemento en concreto "+palabra.get(2));
	palabra.set(2,"Anabel");
	System.out.println("He sustituido el elemento 2 "+palabra.get(2));
   //Visualización con un for each
	System.out.println("Visualizaci\u00f3n con un for each");
	for( String num : palabra) 
      System.out.println(num);
 }
}
