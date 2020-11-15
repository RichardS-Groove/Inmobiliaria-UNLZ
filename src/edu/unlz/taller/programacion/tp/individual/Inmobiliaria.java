package edu.unlz.taller.programacion.tp.individual;

import java.util.*;

public class Inmobiliaria extends Exception implements Imprimible, Constantes {

    /**
     * Se declara los atributos de la clase
     */
    private String nombre;
    private Integer cantidadDeInmuebles;
    private Integer maximoDeInmuebles = 98;
    private double comision;
    private Set<Inmueble> inmuebles;


    /**
     * Constructor
     *
     * @param nombre
     * @param cantidadDeInmuebles
     * @param comision
     */
    public Inmobiliaria(String nombre, Integer cantidadDeInmuebles, double comision) { //120
        this.nombre = nombre;
        this.cantidadDeInmuebles = cantidadDeInmuebles;
        this.comision = comision;
        this.inmuebles = new HashSet<>();
    }

    /**
     * Metodo Agregar Inmueble
     * Lógica: Se agrega por Objeto
     *
     * @param inmueble
     */
    public void agregarInmueble(Inmueble inmueble) throws YaExisteInmuebleException {
        try {
            if (inmueble != null) {
                for (Inmueble x : this.inmuebles) {
                    if (x.contains(inmueble)) {
                        throw new YaExisteInmuebleException();
                    }
                }
                inmuebles.add(inmueble);
            }
        } catch (YaExisteInmuebleException e) {
            System.out.println("\n\nYaExisteInmuebleException");
        } finally {
            System.out.println("");
        }

    }


    /**
     * Metodo Eliminar Inmueble
     * Vericaciones:
     * 1) Valida que no sea null
     * 2) Valida que el array contenga el obj que ingresara
     * 3) Valida que el inmueble no esté vacios (Es obsoleto y esta demas ponerlo - Pero ayuda a saber para que sirve)
     *
     * @param obj
     */
    public void eliminarInmueble(Inmueble obj) {
        if (obj != null && inmuebles.contains(obj) && inmuebles.isEmpty()) {
            inmuebles.remove(obj);
        }
    }

    /**
     * Metodo Beneficio Esperado!
     * Condición: No incluir inmuebles vendidos
     * Lógica: Precio * Comisión
     *
     * @return
     */
    public double beneficioEsperado() {
        double total = 0.0;
        for (Inmueble inmueble : this.inmuebles) {
            if (inmueble != null && !inmueble.isVendido()) {
                total += (inmueble.getPrecio() * getComision());
            }
        }
        return total;
    }

    /**
     * Metodo Beneficio Obtenido.
     * Se varifica si esta vendido o si esta reservado
     * Se realiza un suma de la comisión agregaga en el metofo de beneficioObtenido.
     *
     * @return
     */
    public Double beneficioObtenido() {
        Double beneficioObtenido = 0.0;
        for (Inmueble unInmueble : this.inmuebles) {
            if (unInmueble.isVendido() || unInmueble.isReservado()) {
                beneficioObtenido += unInmueble.beneficioObtenido(this.comision);
            }
        }
        return beneficioObtenido;
    }


    /**
     * Imprimimos los atributos y declaramos un lopp para poder recorrer el array que tenemos en la clase.
     * Se implimenta el Comparator para las colecciónes Set
     */
    @Override
    public void imprimirDatos() {
        System.out.println("\n\nInmobiliaria" +
                "\n\nNombre: " + this.nombre +
                "\nCantidad De Inmuebles: " + this.cantidadDeInmuebles +
                "\nMaximo De Inmuebles: " + this.maximoDeInmuebles +
                "\nComision: " + this.comision);

        Set<Inmueble> ss = new TreeSet<>(new InmuebleOrdenPrecioComparator());
        ss.addAll(inmuebles);

        for (Inmueble s : ss) {
            s.imprimirDatos();
        }

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

}
