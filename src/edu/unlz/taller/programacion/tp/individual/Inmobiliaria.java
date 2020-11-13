package edu.unlz.taller.programacion.tp.individual;

import java.util.ArrayList;

public class Inmobiliaria implements Imprimible {

    /**
     * Atributos
     */
    private String nombre;
    private Integer cantidadDeInmuebles;
    private Integer maximoDeInmuebles = 98;
    private double comision;
    private ArrayList<Inmueble> inmuebles;

    /**
     * Constructor
     *
     * @param nombre
     * @param cantidadDeInmuebles
     * @param comision
     */
    public Inmobiliaria(String nombre, Integer cantidadDeInmuebles, double comision) {
        this.nombre = nombre;
        this.cantidadDeInmuebles = cantidadDeInmuebles;
        this.comision = comision;
        this.inmuebles = new ArrayList<Inmueble>();
    }

    /**
     * Getter & Setter
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeInmuebles() {
        return cantidadDeInmuebles;
    }

    public void setCantidadDeInmuebles(Integer cantidadDeInmuebles) {
        this.cantidadDeInmuebles = cantidadDeInmuebles;
    }

    public Integer getMaximoDeInmuebles() {
        return maximoDeInmuebles;
    }

    public void setMaximoDeInmuebles(Integer maximoDeInmuebles) {
        this.maximoDeInmuebles = maximoDeInmuebles;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    /**
     * Metodos
     */

    public void agregarInmueble(Inmueble inmueble) {
        if (inmueble != null) {
            inmuebles.add(inmueble);
        } else {
            System.out.println("EL OBJETO INMUEBLE ESTA VACIO");
        }
    }

    public void eliminarInmueble(String domicilio) {
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).getDomicilio().equals(domicilio)) {
                inmuebles.remove(i);
                i = i - 1;
            }
        }
    }

    public double beneficioEsperado() {
        double total = 0.0;
        for (Inmueble inmueble : this.inmuebles) {
            if (inmueble != null) {
                if (inmueble.isVendido() != true) {
                    total += (inmueble.getPrecio() * getComision());
                }
            }
        }
        return total;

    }

    public double beneficioObtenido() {
        double total = 0.0;
        double total1 = 0.0;
        for (Inmueble inmueble : this.inmuebles) {
            if (inmueble != null) {
                if (inmueble.isReservado() == true && inmueble.isVendido() == true) {
                    if (inmueble instanceof InmuebleTechado) {
                        InmuebleTechado inmuebletechado = (InmuebleTechado) inmueble;
                        if (((InmuebleTechado) inmueble).isTienePiscina() == true) {
                            double porcet = 0;
                            porcet = ((inmueble.getPrecio() * getComision()) * 0.05);
                            total += ((inmueble.getPrecio() * getComision()) + porcet);
                        } else if (((InmuebleTechado) inmueble).isTieneCochera() == true) {
                            double porcet = 0;
                            porcet = ((inmueble.getPrecio() * getComision()) * 0.06);
                            total1 += ((inmueble.getPrecio() * getComision()) + porcet);
                        }

                    }
                }
            }
        }
        return total + total1;
    }


    @Override
    public void imprimirDatos() {
        System.out.println("\n\nInmobiliaria --->" +
                "\n\nNombre: " + this.nombre +
                "\nCantidad De Inmuebles: " + this.cantidadDeInmuebles +
                "\nMaximo De Inmuebles: " + this.maximoDeInmuebles +
                "\nComision: " + this.comision +
                "\n");

        for (Inmueble inmueble : this.inmuebles) {
            inmueble.imprimirDatos();
        }

    }


}

