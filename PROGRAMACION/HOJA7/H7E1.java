import java.util.Arrays;
public class H7E1{
	public static void main(String[]args){
		int max =0;
		int min =100;
		int posiMax=0;
		int posiMin=0;
		
		int dim [] = new int [15];
		
		for(int i = 0 ; i <dim.length;i++){
			dim [i] = (int)(Math.random()*100);
		}
		for(int num = 0 ;num<dim.length;num++){
			System.out.print(num+"."+dim[num]+"	");
			if (max<dim[num]){
				max=dim[num];
				posiMax=num;
			}
			if(min>dim[num]){
				min=dim[num];
				posiMin=num;
			}	
		}
		System.out.println(" ");
		System.out.print("Max :"+max+"\t posiMax:"+(posiMax+1)+"\nMin:"+min+"\t posiMin:"+(posiMin+1));
	}
}