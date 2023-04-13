import java.io.*;
import java.util.*;
public class exam2{	 
	private int tempMinima;
	private int tempMaxima;
	private int tempMedia;
	
	public void getTempMinima(File provincia) throws IOException, EOFException{
		FileInputStream lectura = new FileInputStream(provincia);	 
		DataInputStream elemento = new DataInputStream(lectura);	 
		boolean salir = true;
		int temperatura;
		try{	 
			do{
				temperatura = elemento.readInt();
				if(this.tempMinima>temperatura){
				this.tempMinima=temperatura;
				}
			}while(salir);  	   
		}
		catch(IOException e){
			System.out.println("Fin de datos de temperatura: "+this.tempMinima);
		}  
		finally{	   
			elemento.close();	
		}   
   }
   
   public void getTempMaxima(File provincia) throws IOException, EOFException{
		FileInputStream lectura = new FileInputStream(provincia);	 
		DataInputStream elemento = new DataInputStream(lectura);	 
		boolean salir = true;
		int temperatura;
		try{	 
			do{
				temperatura = elemento.readInt();
				if(this.tempMaxima<temperatura){
				this.tempMinima=temperatura;
				}
			}while(salir);  	   
		}
		catch(IOException e){
			System.out.println("Fin de datos de temperatura: "+this.tempMinima);
		}  
		finally{	   
			elemento.close();	
		}   
   }
   public void getTempMedia(File provincia) throws IOException, EOFException{
		FileInputStream lectura = new FileInputStream(provincia);	 
		DataInputStream elemento = new DataInputStream(lectura);	 
		boolean salir = true;
		int temperatura,ctn=0;
		try{	 
			do{
				temperatura = elemento.readInt();
				this.tempMedia+=temperatura;
				ctn++;
		
			}while(salir);  	   
		}
		catch(IOException e){
			this.tempMedia=this.tempMedia/ctn;
			System.out.println("Fin de datos de temperatura: "+this.tempMedia);
		}  
		finally{	   
			elemento.close();	
		}
   }
	/* public void guardar(File provincia) throws IOException, EOFException{
		RandomAccessFile elemento = new RandomAccessFile(provincia,"");	 
		String[] arrys = new String[3];
		for(int i=0;i<arrys.length;i++){
			if(arrys[i]==arrys[0]){
				elemento.writeInt(array[i]);
				elemento.writeLine(this.tempMinima);
			}
		} 
		elemento.close();	     
	} */
   

}