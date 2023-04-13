class Humano
{
  public String nombre;
  public String apellido; 
  public Humano (String nombre, String apellido)
  {
     this.nombre = nombre;
	 this.apellido = apellido;
  }
  public String nombreCompleto()
  {
     return nombre +" "+apellido;
  }
  public String identificacion()
  {
    return nombreCompleto();
  }
 }
// clase que hereda
class Ciudadano extends Humano
{
  protected String documento;
  public Ciudadano(String nombre, String apellido, String documento)
  {
     super(nombre, apellido);
	 this.documento = documento;
  }
  public String identificacion()
  {
    return super.identificacion() + ", documento: "+this.documento;
  }
}

class Herencia1
{
  public static void main(String [] args)
  {
    Humano persona1 = new Humano("Juan Carlos","Tercero");
    System.out.println(persona1.nombreCompleto());	
	System.out.println(persona1.nombre);	
	System.out.println(persona1.identificacion());
	Ciudadano persona2 = new Ciudadano("Javier","Perez","Pasaporte");
	System.out.println(persona2.nombreCompleto());	
	System.out.println(persona2.identificacion());
  }
}