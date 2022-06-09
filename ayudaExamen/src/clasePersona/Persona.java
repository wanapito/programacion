 
package clasePersona;


public class Persona {

    public Persona() {
        setNombre("Luisa Perez");
        setEdad(22);
        setAltura(Float.parseFloat( (String) "1,70".replace(",", ".")  ));
    }

      private String Nombre;
      private int Edad;
      private float Altura;
          
    public float getAltura() {
        return Altura;
    }

     
    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
                 
    public int getEdad() {
        return Edad;
    }
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
                 
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
