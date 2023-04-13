import java.util.Arrays;
public class H7E3{
	public static void main(String[]args){
		long fact=1;
		int num1=1;
		long dim [] = new long [16];
		for(int i = 0 ; i <dim.length;++i){
			dim [i] = fact;
			fact*=(i+1);
		}
		
		for(int num = 0 ;num<dim.length;num++){
			System.out.println("Factorial "+(num)+"!:"+dim[num]);
		
		}
		System.out.println(" ");
		
	}
}