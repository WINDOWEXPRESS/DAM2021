import java.util.*;
import java.io.*;
public class R5{
	public static void main(String[]args)throws IOException{
		String nombreElec=null;

		char elegMens=' ';
		byte pagoType =0,elecType=0,pagoMens=0;
		int cntContado=0 ,cntCre6=0,cntCre12=0,cntCre18=0,cntCre24=0;
		String SiMasVenta=" ";
		
		Scanner dato = new Scanner(System.in);
		Scanner dato1 = new Scanner(System.in);
		do{
			elecType=0;
			pagoType=0;
			while(elecType>4||elecType<1){
				System.out.println("tipos de aparatos electrónicos:\n1.televisores \t2.refrigeradoras \t3.hornos \t4.microondas");
				elecType = dato.nextByte();
				
				switch (elecType){
					case 1:
						nombreElec = "Televisor";		
						break;
					case 2:
						nombreElec= "Refrigeradora";
						break;
					case 3:
						nombreElec = "Hornos";
						break;
					case 4:
						nombreElec = "Microondas";
						break;
				}	
			}
			
			while(pagoType<1||pagoType>2){	
				System.out.println("Tipo de pago : 1.Contado \t2.Credito");
				pagoType = dato.nextByte();
			}
			
			if (pagoType==1){
				System.out.println("Tipo de aparato :"+nombreElec+"\tSu precio es xxx.");
				cntContado=cntContado+1;
			}
			if (pagoType==2){
				
				System.out.println("A cuantas mensualidades:A.6 \tB.12\tC.18\tD.24");
				elegMens = (char)System.in.read();
				}
				switch(elegMens){
					case 'a':
						pagoMens=6;
						cntCre6=cntCre6+1;
						break;
					case 'A':
						pagoMens=6;
						cntCre6=cntCre6+1;
						break;
					case 'b':
						pagoMens=12;
						cntCre12=cntCre12+1;
						break;
					case 'B':
						pagoMens=12;
						cntCre12=cntCre12+1;
						break;
					case 'c':
						pagoMens=18;
						cntCre18=cntCre18+1;
						break;
					case 'C':
						pagoMens=18;
						cntCre18=cntCre18+1;
						break;
					case 'd':
						pagoMens=24;
						cntCre24=cntCre24+1;
						break;
					case 'D':
						pagoMens=24;
						cntCre24=cntCre24+1;
						break;
				}
			

			SiMasVenta = dato1.nextLine();
			System.out.println("Deseas realizar mas ventas?: Si / No");
			SiMasVenta = dato1.nextLine();
		}while(SiMasVenta.equalsIgnoreCase("si"));
		
	if (SiMasVenta.equalsIgnoreCase("no")){
			System.out.println("Numero de veces de ventas al contado:"+cntContado);
			System.out.println("Numero de veces de ventas al credito en 6 meses:"+cntCre6);
			System.out.println("Numero de veces de ventas al credito en 12 meses:"+cntCre12);
			System.out.println("Numero de veces de ventas al credito en 18 meses:"+cntCre18);
			System.out.println("Numero de veces de ventas al credito en 24 meses:"+cntCre24);
		}
	}
}
/* En la feria del hogar se ha encontrado una tienda que vende al contado y al crédito
en 6, 12, 18, 24 mensualidades sus aparatos electrónicos: televisores,
refrigeradoras, hornos y microondas. Se desea saber en cualquier momento cuantas
ventas se han realizado al contado, cuantas, al crédito en 6, cuantas al en 12,
cuantas al en 18, cuantas al en 24 mensualidades. */