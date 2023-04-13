import java.util.*;
public class R4{
	public static void main(String[]args){
		Scanner dato = new Scanner(System.in);
		System.out.println("Introducir un numero entero: ");
		int num = dato.nextInt();
		if (num<10&&num>-10){
			System.out.println("El numero tiene 1 cifra.");
		}else if (num<100&&num>-100){
			System.out.println("El numero tiene 2 cifra.");
		}else if (num<1000&&num>-1000){
			System.out.println("El numero tiene 3 cifra.");
		}else if (num<10000&&num>-10000){
			System.out.println("El numero tiene 4 cifra.");
		}else
			System.out.println("El numero tiene mas de 4 cifra.");
	}
}