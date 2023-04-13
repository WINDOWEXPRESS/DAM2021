import java.io.*;
import java.util.*;

public class Elemento
{   
  public static void main(String [] args)
  {
    ArrayList<String> lista = new ArrayList<String>();
	int a;
      lista.add("antonio");
	  lista.add("juan");
	  lista.add("maria");
	  lista.add("silvia");
	  String nuevo ="roberto", otro="maria";
	  lista.add(3,nuevo);
      int i=0;	  
	  System.out.println("ELEMENTOS DE LA LISTA "+lista.size());
	  Iterator<String> nombreIterator = lista.iterator();
	  while(i<(lista.size())){
  	      String elemento = nombreIterator.next();		  
		    if(elemento.contains(otro))
	  	       System.out.print("SE ENCUENTRA "+elemento+" posicion "+i);
			   // System.out.println(i+" "+ elemento);
			  else
			   System.out.println("--"+lista.get(i));
		  i++;
	  }	   
  }
}
