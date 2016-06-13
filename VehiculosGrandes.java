
/**
 * Write a description of class VehiculosGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehiculosGrandes extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class VehiculosGrandes
     */
    public VehiculosGrandes(int peso, int kilometros, Marca marca, int años)
    {
        super( kilometros, marca, años);
        this.peso = peso;
    }

    public int getPeso()
    {
        // put your code here
        return peso;
    }
}
