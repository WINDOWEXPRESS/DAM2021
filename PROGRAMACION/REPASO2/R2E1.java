import java.util.*;
public class R2E1{
	public static void main(String[]args){
		int nota=-1;
		int edad=0;
		String genero=" ";
		Scanner dato = new Scanner(System.in);
		while(nota<0||nota>10){
			System.out.print("Introduzca su nota: ");
			nota = dato.nextInt();
		}
		System.out.print("Introduzca su edad: ");
			edad = dato.nextInt();
		System.out.print("Introduzca su genero M/F: ");
			genero = dato.nextLine();
			genero = dato.nextLine();
		
		if (nota>4&&edad>17&&genero.equalsIgnoreCase("F")){
			System.out.print("ACEPTADA");
		}else if (nota>4&&edad>17&&genero.equalsIgnoreCase("M")){
			System.out.print("ACEPTADO");
		}else{
			System.out.print("NO ACEPTADO/A");
		}
	}
}