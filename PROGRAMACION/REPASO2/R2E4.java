import java.util.*;
public class R2E4{
	public static void main(String[]args){
		int anio=0;
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Introduzca anio para saber si es bisiesto: ");
		anio = dato.nextInt();
		
		if ((anio%4==0)&&(anio%100!=0 || anio%400==0)){
			System.out.println("El año es bisiesto");
		}else{
			System.out.println("El año no es bisiesto");
		}
	}
}