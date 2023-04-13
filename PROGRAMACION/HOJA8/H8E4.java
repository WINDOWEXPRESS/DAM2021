import java.util.*;
public class H8E4{
	public static void main (String []args){
		Scanner dato = new Scanner(System.in);
		final char J1='O';
		final char J2='X';
		final char Vacio='*';
		int fila = 0;
		int columna=0;
		String caja [][] = new String [3][3];
		//iniciar la tabla
		for(int i =0;i<3;i++){
			for (int j = 0;j<3;j++){
				caja[i][j]="*";
			}
		}
		//visualizar la tabla
		for(int i =0;i<3;i++){
			for (int j = 0;j<3;j++){
				System.out.print(caja[i][j]+" ");
			}
			System.out.println();
		}
		//movimiento de jugador 
		for(int k = 0; k<9;k++){
			if(k%2!=0){ 	//moviemiento J2
				System.out.println("El Jugador2");
				//restricciones de num 1 a 3
				do{	
					System.out.print("Fila:");
					fila = dato.nextInt();
				}while(fila<1||fila>3);
				do{
					System.out.print("Columna:");
					columna = dato.nextInt();
				}while(columna<1||columna>3);
				//Escribir la jugada en la tabla
				for(int i =0;i<3;i++){
					for (int j = 0;j<3;j++){
						//si coincide movimiento vuelve a jugar
						if(fila-1==i&&columna-1==j&&(caja[fila-1][columna-1]=="X"||caja[fila-1][columna-1]=="O")){
							k--;
							break;
						}
						if(fila-1==i&&columna-1==j){
							caja[i][j]="X";
						}
					}
				}
			}else{//moviemiento J1
				System.out.println("El Jugador1");
				do{
					System.out.print("Fila:");
					fila = dato.nextInt();
				}while(fila<1||fila>3);
				do{
					System.out.print("Columna:");
					columna = dato.nextInt();
				}while(columna<1||columna>3);
				//Escribir la jugada en la tabla
				for(int i =0;i<3;i++){
					for (int j = 0;j<3;j++){
						//si coincide movimiento vuelve a jugar
						if(fila-1==i&&columna-1==j&&(caja[fila-1][columna-1]=="X"||caja[fila-1][columna-1]=="O")){
							k--;
							break;
						}
						if(fila-1==i&&columna-1==j){
							caja[i][j]="O";
						}
					}
				}
			}
			//visualizar la tabla por cada movimiento
			for(int a =0;a<3;a++){
				for (int b = 0;b<3;b++){
					System.out.print(caja[a][b]+" ");
				}
				System.out.println();
			}
			//condiciones para ganar
			if(caja[0][0]=="O"&&caja[0][1]=="O"&&caja[0][2]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[1][0]=="O"&&caja[1][1]=="O"&&caja[1][2]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[2][0]=="O"&&caja[2][1]=="O"&&caja[2][2]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][0]=="O"&&caja[1][0]=="O"&&caja[2][0]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][1]=="O"&&caja[1][1]=="O"&&caja[2][1]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][2]=="O"&&caja[1][2]=="O"&&caja[2][2]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][0]=="O"&&caja[1][1]=="O"&&caja[2][2]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][2]=="O"&&caja[1][1]=="O"&&caja[2][0]=="O"){
				System.out.println("El jugador1 ha ganado.");
				break;
			}else if(caja[0][0]=="X"&&caja[0][1]=="X"&&caja[0][2]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[1][0]=="X"&&caja[1][1]=="X"&&caja[1][2]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[2][0]=="X"&&caja[2][1]=="X"&&caja[2][2]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[0][0]=="X"&&caja[1][0]=="X"&&caja[2][0]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[0][1]=="X"&&caja[1][1]=="X"&&caja[2][1]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[0][2]=="X"&&caja[1][2]=="X"&&caja[2][2]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[0][0]=="X"&&caja[1][1]=="X"&&caja[2][2]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}else if(caja[0][2]=="X"&&caja[1][1]=="X"&&caja[2][0]=="X"){
				System.out.println("El jugador2 ha ganado.");
				break;
			}
			if(k==8){
				System.out.println("Empate.");
			}
		}
		
	}
}