package Heredadas;

import ClasePadre.Vehiculo;

public class Automovil extends VehiculoMotorizado {
    protected int numero_puertas;

    public Automovil(String marca, String modelo, String anoFabricacion, String tipoCombustible, int numero_puertas) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.numero_puertas = numero_puertas;
    }

    public String mostrarDetalles() {
        return marca + " " + modelo + " " + anoFabricacion + " " + tipoCombustible + " " + numero_puertas;
    }
}
