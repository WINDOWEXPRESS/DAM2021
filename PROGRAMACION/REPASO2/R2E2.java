import java.util.*;
public class R2E2{
	public static void main(String[]args){
		int ladoA=0;
		int ladoB=0;
		int ladoC=0;
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Introduzca lado A de un triangulo: ");
		ladoA = dato.nextInt();
		System.out.print("Introduzca lado B de un triangulo: ");
		ladoB = dato.nextInt();
		System.out.print("Introduzca lado C de un triangulo: ");
		ladoC = dato.nextInt();
		
		if (ladoA==ladoB&&ladoB==ladoC){
			System.out.print("Triangulo equilatero.");
		}else if (ladoA==ladoB||ladoB==ladoC||ladoC==ladoA){
			System.out.print("Triangulo isosceles.");
		}else if (Math.pow(ladoA,2)==Math.pow(ladoB,2)+Math.pow(ladoC,2)||Math.pow(ladoA,2)==Math.pow(ladoB,2)+Math.pow(ladoC,2)||Math.pow(ladoA,2)==Math.pow(ladoB,2)+Math.pow(ladoC,2)){
			System.out.print("Triangulo rectangulo");
		}else{
			System.out.print("Triangulo escaleno");
		}
	}
}