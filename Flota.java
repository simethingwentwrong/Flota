import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private ArrayList <Vehiculo> flotador;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        flotador = new ArrayList <>();
    }

    public void addVehiculo(Vehiculo vehiculo)
    {
        flotador.add(vehiculo);
    }

    public boolean removeVehiculo(int identificador)
    {
        int i = 0;
        boolean erase = false;
        while(i < flotador.size() && !erase)
        {
            if(flotador.get(i).getIdentificador() == identificador)
            {
                flotador.remove(i);
                erase = true;
            }
            i++;
        }
        return erase;
    }

    public boolean cumplenMedidas()
    {
        boolean variable = false;
        for(Vehiculo vehiculo: flotador)
        {
            if( vehiculo instanceof VehiculosPlazas)
            {
                if (vehiculo instanceof Coche)
                {
                    if (((VehiculosPlazas)vehiculo).getPlazas() <= 5){
                        variable = true;
                    }
                }
                if (vehiculo instanceof FurgonetaPequena)
                {
                    if (((VehiculosPlazas)vehiculo).getPlazas() <= 7)
                    {
                        variable = true;
                    }
                }
            }
            else{
                if (vehiculo instanceof Camion)
                {
                    if (articulado(vehiculo))
                    {
                        if (((Camion)vehiculo).getPeso() <= 3000)
                        {
                            variable = true;
                        }
                    }
                    if (!articulado(vehiculo))
                    {
                        if (((Camion)vehiculo).getPeso() <= 2000)
                        {
                            variable = true;
                        }
                    }
                }
            }
        }
        return  variable;
    }

    public Marca marcaMayoritaria()
    {
        int ford = 0;
        int opel = 0;
        int fiat = 0;
        int citroen = 0;
        for(Vehiculo vehiculo: flotador)
        {
            if (vehiculo.getMarca() == Marca.FORD)
            {
                ford++;
            }
            if (vehiculo.getMarca() == Marca.OPEL)
            {
                opel++;
            }
            if (vehiculo.getMarca() == Marca.FIAT)
            {
                fiat++;
            }
            if (vehiculo.getMarca() == Marca.CITROEN)
            {
                citroen++;
            }
        }
        Marca marca = null;
        if(ford > opel && ford > fiat && ford > citroen)
        {
            marca = Marca.FORD;
        }
        if(opel > ford && opel > fiat && opel > citroen)
        {
            marca = Marca.OPEL;
        }
        if(fiat > opel && fiat > ford && fiat > citroen)
        {
            marca = Marca.FIAT;
        }
        if(citroen > opel && citroen > citroen && citroen > ford)
        {
            marca = Marca.CITROEN;
        }
        return marca;
    }

    public int getDatosVehiculo(int identificador)
    {
        int identificadores = identificador;

        return identificadores;
    }

    private int revision(Vehiculo vehiculo)
    {
        int revision = 0;
        if (vehiculo instanceof Coche)
        {
            if(vehiculo.getMarca() == Marca.FORD)
            {
                revision = 2;
            }
            else{
                revision = 1;
            }
        }
        return revision;
    }
    
    private boolean articulado (Vehiculo vehiculo)
    {
        boolean articulado = false;
        if (vehiculo instanceof Camion)
        {
            if( vehiculo.getMarca() == Marca.FIAT || vehiculo.getMarca() == Marca.FORD )
            {
                articulado = true;
            }
        }
        return articulado;
    }

}
