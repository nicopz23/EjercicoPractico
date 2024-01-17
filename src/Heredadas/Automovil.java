package Heredadas;

public class Automovil extends VehiculoMotorizado {
    protected int numero_puertas;

    public Automovil(String marca, String modelo, String anoFabricacion, String tipoCombustible, int numero_puertas) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.numero_puertas = numero_puertas;
    }

    public String mostrarDetalles() {
        return "Marca: " + marca + "\n" +
                "" + "Modelo: " + modelo + "\n" +
                "" + "Año de Fabricacion: " + anoFabricacion + "\n" +
                "" + "Tipo de combustible: " + tipoCombustible + "\n" +
                "" + "Numero de puertas: " + numero_puertas;
    }
}
