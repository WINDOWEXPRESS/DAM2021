import java.util.*;
public class R6{
	public static void main (String[]args){
		Scanner dato = new Scanner(System.in);
	
		System.out.println("Numero de veces de compra en un supermercado:");
			byte nCompra= dato.nextByte();
		System.out.println("Numero de veces de compra en mas de 50euros:");
			byte nCompra50= dato.nextByte();
		System.out.println("Has comprado "+nCompra+" y con un numero de "+nCompra50+" en compra de mas de 50euros");
		
	 }
}  