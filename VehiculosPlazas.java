
/**
 * Write a description of class VehiculosPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosPlazas extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int numPlazas;

    /**
     * Constructor for objects of class VehiculosPlazas
     */
    public VehiculosPlazas( int numPlazas, int kilometros, Marca marca, int años)
    {
        super( kilometros, marca, años);
        this.numPlazas = numPlazas;
    }

    
    public int getPlazas()
    {
        return numPlazas;
    }
}
