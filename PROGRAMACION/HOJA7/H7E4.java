import java.util.Arrays;
public class H7E4{
	public static void main(String[]args){
		int valor = 85;
		long dim [] = new long [30];
		//dar valor a tabla
		for(int i = 0 ; i <dim.length;++i){
			dim[i]=(int)(Math.random()*150+1);
		}
		//visualizar tabla
		for(int num = 0 ;num<dim.length;num++){
			System.out.print(num+"."+dim[num]+"	");
		
		}
		System.out.println("	");
		//visualizar num<85 y sus posic
		for(int num = 0 ;num<dim.length;num++){
			if(valor>dim[num])
				System.out.println("posicion"+(num)+"	Valor:
			"+dim[num]);
		
		}
		System.out.println(" ");
		
	}
}