import java.io.*;
import java.util.*;
// objeto del array List

public class ObjetoList
{   
  String nombre;
  int edad;
  
  ObjetoList(String name, int eda)
  {
    nombre=name;
	edad=eda;
  }
  
 public static void visualizar(ArrayList<ObjetoList> lista)
 {
   int i=0;
   System.out.println("LISTA DE "+lista.size()+" ELEMENTOS.");
   for( ObjetoList numero: lista)
     System.out.println(numero.nombre+"  "+numero.edad);
 }
 
  
  public static void main(String [] args)
  {
    Scanner dato = new Scanner(System.in);   
	String nombre;
	int edad;
	ObjetoList objeto;
	numeroEntero valor;// = new numeroEntero();
    ArrayList<ObjetoList>lista = new ArrayList<ObjetoList>();
	int a;
	for(a=0;a<4;a++)
	{
     System.out.println("NOMBRE: ");
	 nombre = dato.next();
	 System.out.println("EDAD: ");
	 edad = dato.nextInt();
	 objeto = new ObjetoList(nombre,edad);
	 lista.add(objeto);
	}  	
	System.out.println("ELEMENTOS DE LA LISTA "+lista.size());
	visualizar(lista);
  }
}
