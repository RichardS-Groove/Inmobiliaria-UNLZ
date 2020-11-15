package edu.unlz.taller.programacion.tp.individual;

import java.util.Objects;

public class Inmueble implements Imprimible {

    /**
     * Se declara los atributos
     */
    private String domicilio;
    private Integer superficie;
    private Double precio;
    private boolean reservado;
    private boolean vendido;
    private Cliente propietario;

    /**
     * Se declara el constructor
     *
     * @param domicilio
     * @param superficie
     * @param precio
     * @param reservado
     * @param vendido
     * @param propietario
     */
    public Inmueble(String domicilio, Integer superficie, double precio, boolean reservado, boolean vendido, Cliente propietario) {
        this.setDomicilio(domicilio);
        this.setSuperficie(superficie);
        this.setPrecio(precio);
        this.reservado = reservado;
        this.vendido = vendido;
        this.setPropietario(propietario);
    }


    /**
     * Se imprime los atributos de la clase y el objeto Cliente.
     */
    @Override
    public void imprimirDatos() {
        System.out.println("\nInmueble" +
                "\n\nDomicilio: " + getDomicilio() +
                "\nSuperficie: " + getSuperficie() +
                "\nPrecio: " + getPrecio() +
                "\nReservado: " + isReservado() +
                "\nVendido: " + isVendido());
        propietario.imprimirDatos();
    }

    /**
     * Se implementa un metodo para poder agregar o cambiar la comisión.
     *
     * @param comision
     * @return
     */
    public Double beneficioObtenido(Double comision) {
        if (this.isVendido() || this.isReservado()) {
            return this.precio * comision;
        }
        return comision;
    }


    /**
     * Se mejora el metodo Equals
     * Condicónes:
     * 1) Que pertenezca a la misma instancia
     * 2) Que tenga los mismos atributos a la clase
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (o instanceof Cliente)
            return true;

        Inmueble inmueble = (Inmueble) o;

        return Double.compare(inmueble.precio, precio) == 0 &&
                reservado == inmueble.reservado &&
                vendido == inmueble.vendido &&
                Objects.equals(domicilio, inmueble.domicilio) &&
                Objects.equals(superficie, inmueble.superficie) &&
                Objects.equals(propietario, inmueble.propietario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domicilio, superficie, precio, reservado, vendido, propietario);
    }

    /**
     * Se declara los Getter & Setter
     *
     * @return
     */
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }


}
