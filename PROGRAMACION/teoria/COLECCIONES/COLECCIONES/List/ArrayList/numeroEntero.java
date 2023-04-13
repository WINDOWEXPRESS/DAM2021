import java.io.*;
import java.util.*;
// generamos 20 números aleatorios y los visualizamos

public class numeroEntero
{   
 public static void visualizar(ArrayList<Integer> lista)
 {
   int i=0;
   System.out.println("LISTA DE "+lista.size()+" ELEMENTOS.");
   for( Integer numero: lista){
    
    if(numero<4)
       System.out.println(numero+"--");
	 else
	  lista.set(i,numero+10);
	i++;  
	  }
 }
 public static void visualizar1(ArrayList<Integer> lista)
 {
   
   System.out.println("LISTA DE "+lista.size()+" ELEMENTOS.");
   for( Integer numero: lista){
      
       System.out.println(numero+"--");
	
	  }
 }
  
  public static void main(String [] args)
  {
    numeroEntero valor;// = new numeroEntero();
    ArrayList<Integer>lista = new ArrayList<Integer>();
	int a;
	for(a=0;a<20;a++)
	{
     
	 lista.add((int)(Math.random()*10));
	}  	
	System.out.println("ELEMENTOS DE LA LISTA "+lista.size());
	visualizar(lista);
    visualizar1(lista);

  }
}
