
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
    private static int constante = 0;
    private int identificador;
    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(int numPlazas, int kilometros, Marca marca, int años)
    {
        this.kilometros = kilometros;
        this.marca = marca;
        this.años = años;
        if (constante == 0){
            constante = 1;
        }
        else{
            constante++;
        }
        identificador = constante;
    }
    
    
    
}
