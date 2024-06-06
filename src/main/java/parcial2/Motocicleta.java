package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    public String imprimirInformacion(){
        return(imprimirInformacion() + ", tipo de motocicleta: " + tipoMotocicleta);
    }
    //Yamaha YZF-R3 2021, tipo de motocicleta: DEPORTIVA
    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta){
        this.tipoMotocicleta = tipoMotocicleta;
    }
}
