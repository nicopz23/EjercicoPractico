package Main;

import ClasePadre.Vehiculo;
import Heredadas.Automovil;
import Heredadas.Motocicleta;
import Heredadas.VehiculoMotorizado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault","2022","2021");
        VehiculoMotorizado vehiculoMotorizado = new VehiculoMotorizado("Kia","2024","2023","electrico");
        Automovil automovil = new Automovil("Ferrari","2024","2024","gasolina",2);
        Motocicleta motocicleta = new Motocicleta("Yamaha","2023","2022","Gasolina","Deportiva");
        System.out.println("---------------------------------------------------");
        System.out.println(vehiculo.mostrarDetalles());
        System.out.println("---------------------------------------------------");
        System.out.println(vehiculoMotorizado.mostrarDetalles());
        System.out.println("---------------------------------------------------");
        System.out.println(automovil.mostrarDetalles());
        System.out.println("---------------------------------------------------");
        System.out.println(motocicleta.mostrarDetalles());
        System.out.println("---------------------------------------------------");
        System.out.println(vehiculoMotorizado.toString());
    }

}