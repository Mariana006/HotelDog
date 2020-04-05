package hoteldog;
import java.util.Scanner;
public class HotelDog {

    public static void main(String[] args) {
        Scanner ingresoSt=new Scanner(System.in);
  
        String nombre;
        String color;
        String peso;
        
        Dog1 inf =new Dog1();
        
        System.out.print("Ingresa el Nombre de tu Perro:\n");
        nombre = ingresoSt.nextLine();
        System.out.println("Ingresa el Coloer de tu Perro:\n");
        color=ingresoSt.nextLine();
        System.out.println("Ingresa el Peso de tu Perro:\n");
        peso=ingresoSt.nextLine();
        inf.setNombre(nombre);
        inf.setColor(color);
        inf.setPeso(peso);
        inf.Datos();
    }
    
}
