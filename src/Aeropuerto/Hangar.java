package Aeropuerto;

import java.util.HashSet;
import java.util.Iterator;

import Avion.*;

public class Hangar {
    private String nombre;
    HashSet<Avion> setAviones;

    public Hangar(String nombre) {
        this.setAviones = new HashSet<>();
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAvion(Avion avion)
    {
        setAviones.add(avion);
    }

    public String listar()
    {
        StringBuilder builder=new StringBuilder();
        Iterator<Avion>it=setAviones.iterator();
        while(it.hasNext())
        {
            Avion avion= it.next();
            builder.append(avion.toString()).append("\n");
        }
        return builder.toString();
    }

    public String despegar()
    {
        StringBuilder builder= new StringBuilder();
        Iterator<Avion>it=setAviones.iterator();
        while(it.hasNext())
        {
            Avion avion= it.next();
            builder.append(avion.despegar()).append("\n");
        }
        return builder.toString();
    }

    public int cantidadAviones()
    {
      return setAviones.size();
    }
}
