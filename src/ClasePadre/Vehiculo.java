package ClasePadre;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String anoFabricacion;

    public Vehiculo(String marca, String modelo, String anoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
    }

    public String mostrarDetalles() {
        return "Marca: " + marca + "\n" +
                "" + "Modelo: " + modelo + "\n" +
                "" + "Año de Fabricacion: " + anoFabricacion;
    }


    @Override
    public String toString() {

        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}
