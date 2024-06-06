package parcial2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    public Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año; 
    }
    public String imprimirInformacion(){
        String infoVehiculo = this.marca+" "+this.modelo+" "+this.año;
        return (infoVehiculo);
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAño(int año){
        this.año = año;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAño(){
        return this.año;
    }
}
