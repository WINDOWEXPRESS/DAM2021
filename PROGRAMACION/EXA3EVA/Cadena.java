package com.hecho_yo;

public class Cadena{
	public static void main(String []args){
		
		Datos cadena = new Datos();
		cadena.separar(cadena,"16;\"PEARL S.\";\"BUCK\";\"ESTADOUNIDENSE\"");
		cadena.completar(cadena.getNombre(),17);
		cadena.completar(cadena.getApellidos(),24);
		cadena.completar(cadena.getNacionalidad(),15);
	}
	
}

class Datos{
	
	private int codigo;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}
	
	
	public String completar(String texto,int tam){
		String copia="";
		if(texto.length()>tam){
			System.out.println("Dato "+texto+" mayor que restriccion de longitud "+tam);
			texto=texto.substring(0,tam);
			System.out.println(texto);
		}else{
			copia = texto;
			for(int i = copia.length() ;i<=tam;i++){
				copia += " ";
			}
			copia+=".";
			System.out.println(copia);
		}
		return copia.toUpperCase();
	}
	
	public void separar(Datos cadena,String texto){
		String[] datos;
		datos=texto.split(";");
		
		for(int i = 0;datos.length>i;i++){
			for(int j = 0;j<datos[i].length();j++){
				if(datos[i].charAt(j) == '\"'){
					datos[i] = datos[i].substring(0+1,datos[i].length()-1);
				}
			}
		}
		
		this.codigo= Integer.parseInt(datos[0]);
		this.nombre=datos[1];
		this.apellidos=datos[2];
		this.nacionalidad=datos[3];
	}
	

}