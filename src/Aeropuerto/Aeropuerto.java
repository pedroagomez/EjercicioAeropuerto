package Aeropuerto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Avion.*;
public class Aeropuerto {
    private String nombre;
    private String direccion;
    private int codigoInternacional;
    private static int codigoMobil=0;
    private int capacidadOperacion;  // cantidad de aviones que puede alojar

    private HashMap<String,Hangar>mapaAeropuerto;

    public Aeropuerto(String nombre, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoInternacional = codigoInternacional++;
        this.capacidadOperacion = capacidadOperacion;
        this.mapaAeropuerto = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }


    public int getCodigoInternacional() {
        return codigoInternacional;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public void setCapacidadOperacion(int capacidadOperacion) {
        this.capacidadOperacion = capacidadOperacion;
    }

    public String agregarAvion(String nombreHangar, Avion avion)
    {
        String mensaje= "";
        Hangar hangar= null;
        if(capacidadOperacion>=cantidadAviones())
        {
            if(mapaAeropuerto.containsKey(nombreHangar))
            {
                hangar=mapaAeropuerto.get(nombreHangar);
            }
            else
            {
                hangar=new Hangar(nombreHangar);
            }
            hangar.agregarAvion(avion);
            mapaAeropuerto.put(nombreHangar,hangar);
            mensaje="Avion agregado";
        }
        else
        {
            mensaje= "Capacidad maxima superada";
        }
        return mensaje;

    }

    public String listar()
    {
        StringBuilder builder=new StringBuilder();
        Iterator<Map.Entry<String,Hangar>>it=mapaAeropuerto.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Hangar> conjunto=it.next();
            builder.append("Nombre Hangar : "+conjunto.getKey()).append("\n");
            Hangar hangar= conjunto.getValue();
            builder.append(hangar.listar()).append("\n");
        }
        return builder.toString();
    }

    public String despegarAvionesHangar(String nombreHangar)
    {
        StringBuilder builder= new StringBuilder();
        Hangar hangar = mapaAeropuerto.get(nombreHangar);
        builder.append(hangar.despegar()).append("\n");
        return builder.toString();
    }

    public int cantidadAviones()
    {
        int total=0;
        Iterator<Map.Entry<String,Hangar>>it=mapaAeropuerto.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Hangar> conjunto=it.next();
            Hangar hangar= conjunto.getValue();
            total+=hangar.cantidadAviones();
        }
        return total;
    }

    public int cantidadAvionesEnHangar(String nombre) {
        int total = 0;
        Hangar hangar = mapaAeropuerto.get(nombre);
        if (hangar != null) { // Verificar si el hangar no es nulo
            total = hangar.cantidadAviones();
        }
        return total;
    }

    public String verHangares()
    {
        StringBuilder builder=new StringBuilder();
        Iterator<Map.Entry<String,Hangar>> it=mapaAeropuerto.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Hangar>conjunto=it.next();
            builder.append(conjunto.getKey()).append("\n");
        }
        return builder.toString();
    }
}
