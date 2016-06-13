
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculosGrandes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Camion
     */
    public Camion(int peso, int kilometros, Marca marca, int años)
    {
        super(peso, kilometros, marca, años);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
