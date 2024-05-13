package Avion;

import Interfaz.IMantaComida;

public class Comercial extends Avion implements IMantaComida {
    private int azafatas;

    public Comercial(String nombreModelo, String marca, float capacidadCombustible, String tipoMotor, int cantidadAsientos, int azafatas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.azafatas = azafatas;
    }

    public int getAzafatas() {
        return azafatas;
    }

    public void setAzafatas(int azafatas) {
        this.azafatas = azafatas;
    }

    @Override
    public String toString() {
        return  " Comercial : " +
                "azafatas = " + azafatas+super.toString();
    }

    @Override
    public String manta() {
        return "Entregando manta..";
    }

    @Override
    public String comida() {
        return "Sirviendo comida... ";
    }
}
