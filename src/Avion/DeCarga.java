package Avion;

import Interfaz.IIngresar;

public class DeCarga extends Avion implements IIngresar {
    private int cantidadKgTransportar;

    public DeCarga(String nombreModelo, String marca, float capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadKgTransportar) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, 0);
        this.cantidadKgTransportar = cantidadKgTransportar;
    }

    public int getCantidadKgTransportar() {
        return cantidadKgTransportar;
    }

    public void setCantidadKgTransportar(int cantidadKgTransportar) {
        this.cantidadKgTransportar = cantidadKgTransportar;
    }

    @Override
    public String toString() {
        return "De carga " +
                "cantidadKgTransportar=" + cantidadKgTransportar +super.toString();
    }

    @Override
    public boolean ingresar() {
        return true;
    }

    public String descargar()
    {
        return "Descargando contenido";
    }
}
