
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    private int kilometros;
    private Marca marca;
    private int años;
    private static int constante;
    private int identificador;
    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(  Marca marca, int años, int kilometros)
    {
        this.kilometros = kilometros;
        this.marca = marca;
        this.años = años;
        identificador = constante;
        constante++;
    }
    
    public int getIdentificador()
    {
        return identificador;
    }
    
    public int getKilometros()
    {
        return kilometros;
    }
    
    public Marca getMarca()
    {
        return marca;
    }
    
    public int getAños()
    {
        return años;
    }
}
