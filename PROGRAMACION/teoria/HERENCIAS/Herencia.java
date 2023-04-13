class Humano
{
  protected String nombre;
  private String apellido;  // no puede ser visto desde el main
  //protected String apellido;
  public Humano (String hola, String quetal)
  {
     this.nombre = hola;
     this.apellido = quetal;
  }
  public String nombreCompleto()
  {
     return this.nombre +" "+this.apellido;
  }
  public String identificacion()
  {
    return nombreCompleto() + " soy identificacion";
  }
  public String getApellido()
  {
     return this.apellido;
  }
}
// clase que hereda
class Ciudadano extends Humano
{
  protected String documento;
  public Ciudadano(String soyNombre, String soyApellido, String soyDocumento)
  {
     super(soyNombre, soyApellido);
	 this.documento = soyDocumento;
  }
  public String identificacion()
  {
    return super.identificacion() + ", documento: "+this.documento;
  }
}

public class Herencia
{
  public static void main(String [] args)
  {
    Humano persona1 = new Humano("Juan Carlos","Tercero");
    System.out.println(persona1.nombreCompleto());	
	System.out.println(persona1.nombre);	
	//System.out.println(persona1.apellido);	// da error si es privado
	System.out.println(persona1.getApellido());
	System.out.println(persona1.identificacion());
	Ciudadano persona2 = new Ciudadano("Javier","Perez","Pasaporte");
	System.out.println(persona2.nombreCompleto());	
	System.out.println(persona2.identificacion());
  }
}