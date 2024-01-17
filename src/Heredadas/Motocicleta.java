package Heredadas;

public class Motocicleta extends VehiculoMotorizado {
    protected String tipoMoto;

    public Motocicleta(String marca, String modelo, String anoFabricacion, String tipoCombustible, String tipoMoto) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.tipoMoto = tipoMoto;
    }

    public String mostrarDetalles() {
        return "Marca: " + marca + "\n" +
                "" + "Modelo: " + modelo + "\n" +
                "" + "Año de Fabricacion: " + anoFabricacion + "\n" +
                "" + "Tipo de combustible: " + tipoCombustible + "\n" +
                "" + "Tipo de moto: " + tipoMoto;
    }
}
