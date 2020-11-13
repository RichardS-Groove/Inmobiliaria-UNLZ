package edu.unlz.taller.programacion.tp.individual;

import java.util.Objects;

public class Inmueble implements Imprimible {

    /**
     * Se declara los atributos
     */
    private String domicilio;
    private Integer superficie;
    private double precio;
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
     * Se declara los Getter & Setter
     *
     * @return
     */
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        if (domicilio != null) {
            this.domicilio = domicilio;
        } else {
            System.out.println("DEBE COMPLETAR UN DOMICILIO");
        }
        this.domicilio = domicilio;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        if (superficie != null) {
            this.superficie = superficie;
        } else {
            System.out.println("LA SUPERFICIE INGRESADA NO ES LA CORRECTA");
        }
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("EL PRECIO DEBE SER MAYOR A CERO");
        }
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
        if (propietario != null) {
            if (propietario.equals(propietario)) {
                this.propietario = propietario;
            } else {
                System.out.println("EL OBJETO NO PERTENECE A LA CLASE DE CLIENTE");
            }
        } else {
            System.out.println("OBJETO IBGRESADO ESTAVACIO");
        }
        this.propietario = propietario;
    }


    @Override
    public void imprimirDatos() {
        System.out.println("\n\nObj Inmueble --->" +
                "\n\nDomicilio: " + getDomicilio() +
                "\nSuperficie: " + getSuperficie() +
                "\nPrecio: " + getPrecio() +
                "\nReservado: " + isReservado() +
                "\nVendido: " + isVendido() +
                "\n\nCliente " +
                "\nNombre: " + propietario.getNombre() +
                "\nTélefono: " + propietario.getTelefono() +
                "\nCorreo: " + propietario.getCorreo() +
                "\n");
    }

    /**
     * Se valida que pertenezca a la misma instancia
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
        if (o instanceof Cliente) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(propietario);
    }
}
