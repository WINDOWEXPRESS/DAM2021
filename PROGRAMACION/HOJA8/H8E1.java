import java.util.*;
public class H8E1{
	public static void main (String []args){
		String signo="",signoP="+",signoN="-";
		
		Scanner dato = new Scanner(System.in);
		String arrays [][]= new String[2][15];
		for (int i=0;i<2;i++){
			if(i==0){
				for(int j=0;j<15;j++){
					//||signo.equals("2")==false
					signo="";
					while (signo.equals("+")==false||signo.equals("-")==false){
						System.out.print(i+" Exponente "+j+" + or -:");
						System.out.print(signo.equals("+"));
						System.out.print(signo.equals("-"));
						signo =dato.nextLine();
						if(signo.equals("+")){
							arrays[i][j]="+";
						}else{
							arrays[i][j]="-";
						}
						if(signo.equals("+")==false){
							System.out.println("Solo signo \"+\"o \"-");
						}
					}
				}
			}
			/* if(i==1){
				for(int j=0;j<15;j++){
					System.out.print(i+" Exponente "+j+" + or -:");
					System.out.print(signo.equals("+"));
					System.out.print(signo.equals("-"));
					signo =dato.nextLine();
					if(signo.equals("+")){
						arrays[i][j]="+";
					}else{
						arrays[i][j]="-";
					}
					if(signo.equals("+")==false){
						System.out.println("Solo signo \"+\"o \"-");
					}
				}
			} */
		}
	}
}