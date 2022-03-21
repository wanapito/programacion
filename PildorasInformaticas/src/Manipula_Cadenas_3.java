/**
 *
 * @author Ivan
 */
public class Manipula_Cadenas_3 {
    public static void main(String[] args) {
        String alumno1, alumno2;
        alumno1="David" ;
        alumno2= "david" ;
        //equals diferencia entre mayuscula y minicualas
        //devuleve true si son iguales o false si son distintos
        System.out.println(alumno1.equals(alumno2));
        //equals ignore case igonora mayusculas minusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
    }
    
}
