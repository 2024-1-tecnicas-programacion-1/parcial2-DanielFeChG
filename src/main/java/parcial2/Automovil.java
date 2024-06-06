package parcial2;

public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    public Automovil(String marca, String modelo, int año, int puertas, TipoCombustible tCombustible) {
        super(marca, modelo, año);
        this.tipoCombustible = tCombustible;
        this.numeroPuertas = puertas;
    }
    public String imprimirInformacion(){
        return(super.imprimirInformacion() + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible);
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    public TipoCombustible getTipoCombustible(){
        return tipoCombustible;
    }
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }


}
