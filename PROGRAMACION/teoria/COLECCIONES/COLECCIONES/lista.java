import java.io.*;
import java.util.*;

class lista
{
	public static void main(String [] args){
	//Collection  es un  interfaz y no puede instanciarse
		Collection <Integer> elemento = new ArrayList <Integer>(); 
		elemento.add(25);
		elemento.add(54);
		elemento.add(23);
		int valor;
		Iterator  nodo = elemento.iterator();
		/* while( nodo.hasNext()){
			valor = (Integer)nodo.next( );
			System.out.println(valor+"  ");
		} */
		for(Integer lo:elemento){
			valor = (Integer)nodo.next( );
			System.out.print(valor+"  ");
		}
	}
}