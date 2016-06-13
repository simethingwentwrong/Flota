
/**
 * Write a description of class VehiculosGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosGrandes extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class VehiculosGrandes
     */
    public VehiculosGrandes( Marca marca, int años,int kilometros,int peso)
    {
        super( marca, años,kilometros);
        this.peso = peso;
    }

    public int getPeso()
    {
        return peso;
    }
    
    
}
