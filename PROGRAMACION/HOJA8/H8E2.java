import java.util.*;
public class H8E2{
	public static void main(String args[]){
		Scanner dato = new Scanner(System.in);
		float arrays[][]= new float[3][33];
		float media_asignatura=0;
		float media_clase=0;
	
		char ch1= 'a';
		//imprimir 33 notas aleatorios de cada asignatura
		for (int i = 0 ;i<3;i++){
			for(int j = 0;j<33;j++){
				arrays[i][j]=(float)(Math.random()*10);
			}
		}
		for (int a = 0 ;a<3;a++){
			ch1='a';
			media_asignatura=0;
			System.out.print("Asignatura"+(a+1));
			for(int b = 0;b<33;b++){
				System.out.printf(("	")+(ch1)+":"+"%.2f",arrays[a][b]);
				ch1+=1;
				media_asignatura=media_asignatura+arrays[a][b];
				
			}
			media_asignatura=media_asignatura/33;
			media_clase+=media_asignatura;
			System.out.println();
			System.out.printf("La media de la asignatura"+(a+1)+" : "+"%1.2f",media_asignatura);
			System.out.println();
			System.out.println();
		}
		System.out.printf("La media de la clase es:"+"%1.2f",(media_clase/3));
	}
}