
package ProtectoraAnimalesPeluditos;
public class Gato extends Animal{
    public Gato(String n, int e)
    {
        super(n,e);
    }
    
    @Override
    public String toString()
    {
        return "Gato: "+super.toString();
    }
    
}
