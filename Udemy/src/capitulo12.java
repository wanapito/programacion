
import java.util.Scanner;



public class capitulo12 {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        var nombre = "programacion con java";
        System.out.println("proporciona el nombre: " );
        System.out.println(nombre);
        var id = 1520;
        System.out.println("porporciona el id : ");
        System.out.println(id);
        var precio = 899;
        System.out.println("prporciona el precio:");
        System.out.println(precio);
        boolean varBoolean = true;
        System.out.println("porporciona el envio gratuito = ");
        System.out.println(varBoolean);
        System.out.println(nombre + "#"+ id );
        System.out.println(("precio: ")+"$" + precio);
        var envioGratuito = varBoolean;
        System.out.println("Envio Gratuito:" + varBoolean);
        
  consola.close();  }

}
