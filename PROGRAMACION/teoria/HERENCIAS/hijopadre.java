class prueba
{
  public static void main(String [] args)
  {
    hijo h = new hijo();
    h.mostrar();
    h.getDato();
  }
}

class padre
{
 protected int dato;
 public void m()
 {
   System.out.println("metodo del padre ");
 }
}// fin clase padre
class hijo extends padre
{
  private int dato;
  public void m()
  {
    System.out.println("metodo del hijo ");
    super.dato = 10;
    dato = 20;
  }
  public void getDato()
  {
    System.out.println(super.dato);
  }
  public void mostrar()
  {
    this.m();
    m();
    super.m();
  }
}

