
package ProtectoraAnimalesPeluditos;
public class Perro extends Animal{
    public Perro(String n, int e)
    {
        super(n,e);
    }
   
    @Override
    public String toString()
    {
        return "Perro: "+super.toString();
    }
    
}
