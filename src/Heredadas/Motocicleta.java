package Heredadas;

public class Motocicleta extends VehiculoMotorizado {
    protected String tipoMoto;

    public Motocicleta(String marca, String modelo, String anoFabricacion, String tipoCombustible, String tipoMoto) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.tipoMoto = tipoMoto;
    }

    public String mostrarDetalles() {
        return marca + " " + modelo + " " + anoFabricacion + " " + tipoCombustible + " " + tipoMoto;
    }
}
