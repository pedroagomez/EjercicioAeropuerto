package Avion;

import java.util.Objects;

public abstract class Avion {

    private String nombreModelo;
    private String marca;
    private float capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;

    public Avion(String nombreModelo, String marca, float capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(float capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public String toString() {
        return  "Avion :" +
                "nombreModelo = " + nombreModelo + '\'' +
                ", marca ='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos;
    }

    public String aterrizar()
    {
        return "Avion "+getNombreModelo() + " aterrizando ...";
    }
    public String despegar()
    {
        return "Avion "+getNombreModelo() + " despegando ...";
    }

    public String volar()
    {
        return "Avion "+getNombreModelo() + " en vuelo ...";
    }
    @Override
    public boolean equals(Object o) {
        boolean esIgual=false;
        if(o!=null)
        {
            if(o instanceof Avion)
            {
                Avion avion=(Avion)o;
                if(avion.getNombreModelo().equalsIgnoreCase(getNombreModelo()) && avion.tipoMotor.equalsIgnoreCase(getTipoMotor()))
                {
                    esIgual=true;
                }
            }
        }
        return esIgual;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
