import java.util.*;
public class ej4_b 
{
    public static void main(String[] args)
	{
      Queue<Nodo> cola = new LinkedList<Nodo>();
	  Nodo elemento;
	  Iterator <Nodo>  siguiente;
	  Scanner ent = new Scanner(System.in);
	  Scanner tex = new Scanner(System.in,"CP850");
	  int lugar, opcion, posicion=0;
	  boolean encontrado=false;
	  String buscar;
	  do{
	     do{
	        System.out.println("1.- A\u00f1adir un elemento a la cola.");
		    System.out.println("2.- Eliminar un elemento de la cola.");
		    System.out.println("3.- Ver si la cola esta vacia.");
		    System.out.println("4.- Buscar un elemento e indicar cuantos elementos tenemos que borrar.");
			System.out.println("5.- Salir.");
		    opcion = ent.nextInt(); 
	     }while(opcion<1|| opcion>5);
	    switch(opcion)
		{
		  case 1:
		       elemento = new Nodo();
		       System.out.println("Nombre: ");
			   elemento.nombre = tex.nextLine().toUpperCase();
			   System.out.println("DNI: ");
			   elemento.dni = tex.nextLine().toUpperCase();
			   cola.add(elemento);
			   break;
		  case 2:
		        if(cola.size()>0)
				    cola.remove();
                  else			   
					System.out.println("La cola esta vacia");
				break;				
		  case 3:
		        if(cola.isEmpty())
				  System.out.println("LA COLA ESTA VACIA");
				 else
				  System.out.println("LA COLA NO ESTA VACIA");	
			    break;
		  case 4:		
                if(cola.size()>0)
				{	
		           lugar=-1;	
			       System.out.println("Nombre a buscar ");
				   buscar = tex.nextLine().toUpperCase();
				   siguiente = cola.iterator();
	               while( siguiente.hasNext())	
	               {   
			         lugar++;
                     elemento = (Nodo)siguiente.next();
					 if(buscar.equals(elemento.nombre))
					 {	 
				       System.out.println(elemento.nombre+"  "+elemento.dni);
					   encontrado=true;
					   posicion=lugar;
					 }
		           }
				   if(encontrado)
				      System.out.println("Tenemos que eliminar "+posicion+" elementos.");
			        else
					  System.out.println("NO LO TENEMOS EN LA LISTA");
				}
				else
				  System.out.println("No tenemos elementos en la cola");	
				break;
		}
	  }while(opcion!=5);      
    }
}

class Nodo
{
   String nombre, dni;
   
   Nodo(){}
}
