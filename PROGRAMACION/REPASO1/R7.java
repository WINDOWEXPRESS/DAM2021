import java.util.*;
public class R7{
	public static void main(String[]args){
		Scanner dato = new Scanner(System.in);
		short cuadroCuaderno=4;
		short cantLucas=4;
		short cantCross=2;
		short cantNovo=3;
		System.out.println("A que cantidad de cuadernos quieres comprar:");
		short cantCuad = dato.nextShort();
		if (cantCuad<13){
			System.out.println("Has comprado "+cantCuad+" cuadedrnos y no hay obsequio.");
		}else if(cantCuad<25){
			System.out.println("Has comprado "+cantCuad+" cuadedrnos con obsequio de:"+cantCuad/cantLucas+" Lucas.");
		}else if(cantCuad<37){
			System.out.println("Has comprado "+cantCuad+" cuadedrnos con obsequio de:"+cantCuad/cantCross+" Cross.");
		}else if(cantCuad>36){
			System.out.println("Has comprado "+cantCuad+" cuadedrnos con obsequio de:"+cantCuad/cantNovo+" Novo, "+cantCuad/cantLucas+" Lucas y "+cantCuad/cantLucas+" de Cross.");
		}
	}
}