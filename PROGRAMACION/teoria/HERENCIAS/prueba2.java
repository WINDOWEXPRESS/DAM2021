class prueba2
{
  public static void main(String [] args)
  {
    hijo h = new hijo();
    h.getDato();
    hijo p = new hijo(23);    
    p.getDato();

  }
}

class padre
{
 protected int dato;
 padre(int x)
 {
   dato=x;
 }
 padre()
 {
   this.dato=5;
 } 
 
}// fin clase padre
class hijo extends padre
{
  private int dato;
  hijo(int x)
  {
    super(2);
    dato = x;
  }
  hijo()
  {
    dato = 3;
  }
 
  public void getDato()
  {
    System.out.println("DATO PADRE "+super.dato);
    System.out.println("DATO HIJO "+this.dato);
  }
  
}