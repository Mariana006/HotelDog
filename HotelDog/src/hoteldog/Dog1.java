package hoteldog;
public class Dog1 {
    private String nombre;
    private String color;
    private String peso;
    
    public void setNombre(String nom){
        nombre=nom;
    }
     public void setColor(String co){
        color=co;
     }
      public void setPeso(String pe){
        peso=pe;
      }
      public String getNombre(){
          return nombre;
      }
      public String getColor(){
          return color;
      }
      public String getPeso(){
          return peso;
      }
      public void Datos(){
          System.out.println("Nombre:"+getNombre());
          System.out.println("Color:"+getColor());
          System.out.println("Peso:"+getPeso());
      }
}