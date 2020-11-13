package edu.unlz.taller.programacion.tp.individual;

import java.util.Comparator;

public class InmuebleOrdenPrecioComparator implements Comparator<Inmueble> {

    @Override
    public int compare(Inmueble o1, Inmueble o2) {
        return o1.getPrecio().compareTo(o2.getPrecio());
    }
}
