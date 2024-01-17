package Heredadas;

import ClasePadre.Vehiculo;

public class VehiculoMotorizado extends Vehiculo {
    protected String tipoCombustible;

    public VehiculoMotorizado(String marca, String modelo, String anoFabricacion, String tipoCombustible) {
        super(marca, modelo, anoFabricacion);
        this.tipoCombustible = tipoCombustible;
    }

    public String mostrarDetalles() {
        return marca + " " + modelo + " " + anoFabricacion + " " + tipoCombustible;
    }

    @Override
    public String toString() {
        return "VehiculoMotorizado{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacion='" + anoFabricacion + '\'' +
                '}';
    }
}
