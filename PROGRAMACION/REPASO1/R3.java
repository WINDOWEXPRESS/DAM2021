import java.util.*;
public class R3{
	public static void main (String[]args){
		float pago = 0;
		int horaE=0,minE=0;
		int horaS=0,minS=0;
		byte Elegir = 0;
		var dato = new Scanner(System.in);
		//Condicion de numero de dia
		do{
		System.out.println("Dia de estacionamiento: \n1.Lunes \t2.Martes \t3.miercoles \t4.Jueves \n5.Viernes \t6.Sabado \t7.Domingo.");
		Elegir = dato.nextByte();
		}while(Elegir<0||Elegir>7);
		//preio de dia
		if (Elegir==1||Elegir==2||Elegir==3){
			pago = 2;
			System.out.println("El pago es:"+pago+" por hora.");
		}
		if (Elegir==4 || Elegir==5){
			pago = (float)2.50;
			System.out.println("El pago es:"+pago+" por hora.");
		}
		if (Elegir ==6||Elegir==7){
			pago = 3;
			System.out.println("El pago es:"+pago+" por hora.");
		}
		//Tiempo de estacionamiento
		while(horaE<1||horaE>24){
			System.out.print("Horas de estacionamiento:");
			horaE= dato.nextInt();
			if (horaE<1||horaE>24){
				System.out.println("Fallo de hora introducir de formato 24H.");
			}
		}
		while(minE<1||minE>61){
			System.out.print("Minutos de estacionamiento:");
			minE= dato.nextInt();
			if (minE<1||minE>61){
				System.out.println("Fallo de minuto rango de 0 a 60.");
			}	
		}
		while(horaS<1||horaS>24){
			System.out.print("Horas de salir:");
			horaS= dato.nextInt();
			if (horaS<1||horaS>24){
				System.out.println("Fallo de hora introducir de formato 24H.");
			}
		}
		while(minS<1||minS>61){
			System.out.print("Minutos de salir:");
			minS= dato.nextInt();
			if (minS<1||minS>61){
				System.out.println("Fallo de minuto rango de 0 a 60.");
			}	
		}
		//calcular el precio de estacionamiento -falta algunos condiciones
		if(horaE==horaS&&minE>=minS-5){
			System.out.print("El pago es gratis.");
		}
		if(horaE==horaS&&minE<minS-5){
			System.out.print("El pago es :"+pago);
		}
		if((horaS-horaE)==1&&minE>54&&minS<6){
			minS=60+minS;
			if(minS-minE<6){
				System.out.print("El pago1 es gratis");
			}else
				System.out.print("El pago2 es:"+pago*2);
		}
		if(horaS-horaE>1){
			System.out.print("El pago4 es:"+(pago*(horaS-horaE)));
		}
	}
}