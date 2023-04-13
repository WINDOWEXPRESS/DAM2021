import java.io.*;
import java.util.*;
class Pais{
    private String nombre;
    private String capital;
    private String continente;
    private int superficie;
    private int poblacion;

    public Pais( ){
        String nombre;
        char sexo;
        int edad;
        try{
        FileInputStream fich=new FileInputStream("Atlas.txt");
        DataInputStream arch=new DataInputStream(fich);  
        System.out.println("\n\tLISTADO DEL FICHERO\n");
        nombre = arch.readUTF();
        while(nombre != null)
        {
          sexo = arch.readChar();
          edad = arch.readInt();
          System.out.println(nombre+"\t"+sexo+"\t"+edad);	
          nombre = arch.readUTF();
        }
         arch.close();
        }
        catch(FileNotFoundException e){
         System.out.println("No se encontro el archivo");
        }
        catch(IOException e){
        System.out.println("");// para anular el error de fin de fichero
        }
    }
    public Pais(String x){

    }

	public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setCapital(){
        this.capital=capital;
    }
    public String getCapital(String capital){
        return this.capital;
    }
    public void setContinente(String continente){
        this.continente=continente;
    }
    public String getContinente(){
        return  this.continente;
    }
    public void setSuperficie(int superficie){
        this.superficie=superficie;
    }
    public int getSuperficie(){
        return this.superficie;
    }
    public void setPoblacion(int poblacion){
        this.poblacion=poblacion;
    }
    public int getPoblacion(int poblacion){
        return  this.poblacion;
    }

    public static void main(String [] args) throws IOException, EOFException{   
        Pais dato = new Pais();
    }
    
}