import java.util.Arrays;
public class H7E2{
	public static void main(String[]args){
		int rep=0;
		int saltoLinea =0;
		int dim [] = new int [200];
		//sacar 200 numeros de valores entre 1 - 50.
		for(int i = 0 ; i <dim.length;i++){
			dim [i] = (int)(Math.random()*50+1);
		}
		//imprimir esos 200 num
		for(int num = 0 ;num<dim.length;num++){
			System.out.print((num+1)+"."+dim[num]+"		");
			saltoLinea=saltoLinea+1;
			if(saltoLinea==10){
				System.out.println(" ");
				saltoLinea=0;
			}
		}
		System.out.println(" ");
		//buscar num de rep de cada num
		for(int num = 1 ;num<=50;num++){
			for(int cont=0;cont<dim.length;cont++){
				if(num==dim[cont])
					rep = rep+1;
			}
			System.out.print("El "+num+" ha repetido:"+rep+"	");
			saltoLinea=saltoLinea+1;
			if(saltoLinea==5){
				System.out.println(" ");
				saltoLinea=0;
			}
			rep = 0;
		}
	}
}