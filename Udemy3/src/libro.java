
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ivan
 */
public class libro {

    public static void main(String arg[]) {
        System.out.println("Proporciona el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

 consola.close();   }

}
