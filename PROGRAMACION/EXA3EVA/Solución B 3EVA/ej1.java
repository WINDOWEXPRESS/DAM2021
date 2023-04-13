public class ej1
{
  public static void main(String [] args)
  {
     RegistroAutor elemento = new RegistroAutor();
	 elemento.separar(elemento, "16;\"PEARL S\".;\"BUCK\";\"ESTADOUNIDENSE");
	 System.out.println(elemento.codigo+" "+elemento.nombre+" "+elemento.apellidos+" "+elemento.nacionalidad);
	 System.out.println(elemento.completar(elemento.nombre,17)+".");
	 System.out.println(elemento.completar(elemento.apellidos,24)+".");
	 System.out.println(elemento.completar(elemento.nacionalidad,15)+".");
  }
}
