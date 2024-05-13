package Avion;

import Interfaz.IMantaComida;

public class Privado extends Avion implements IMantaComida {
    private boolean jacuzzi;
    private String claveWifi;
    private static final String wifi= "AAA3";
    private boolean verMundial;

    public Privado(String nombreModelo, String marca, float capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean jacuzzi) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi=wifi;
        this.verMundial=true;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    @Override
    public String toString() {
        return "Privado :" +
                "jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", verMundial=" + verMundial + super.toString();
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
