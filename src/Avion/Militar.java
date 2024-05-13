package Avion;

import Interfaz.IIngresar;

public class Militar extends Avion implements IIngresar {

    private String arma;
    private int cantidadBalas;

    public Militar(String nombreModelo, String marca, float capacidadCombustible, String tipoMotor, int cantidadAsientos, String arma, int cantidadBalas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.arma = arma;
        this.cantidadBalas = cantidadBalas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    @Override
    public String toString() {
        return "Militar " +
                "arma='" + arma + '\'' +
                ", cantidadBalas=" + cantidadBalas +super.toString();
    }

    @Override
    public boolean ingresar() {
        return true;
    }
}
