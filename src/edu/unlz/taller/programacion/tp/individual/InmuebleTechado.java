package edu.unlz.taller.programacion.tp.individual;

public class InmuebleTechado extends Inmueble {

    /**
     * Se declara los atributos
     */
    private Integer cantidadDeAmbiente;
    private boolean tieneCochera;
    private boolean tienePiscina;

    public InmuebleTechado(Integer cantidadDeAmbiente, boolean tieneCochera, boolean tienePiscina, String domicilio, Integer superficie, double precio, boolean reservado, boolean vendido, Cliente propietario) {
        super(domicilio, superficie, precio, reservado, vendido, propietario);
        this.setCantidadDeAmbiente(cantidadDeAmbiente);
        this.tieneCochera = tieneCochera;
        this.tienePiscina = tienePiscina;
    }

    /**
     * Se declara los Getter y Setter
     *
     * @return
     */
    public Integer getCantidadDeAmbiente() {
        return cantidadDeAmbiente;
    }

    public void setCantidadDeAmbiente(Integer cantidadDeAmbiente) {
        if (cantidadDeAmbiente != null) {
            if (cantidadDeAmbiente > 0) {
                this.cantidadDeAmbiente = cantidadDeAmbiente;
            } else {
                System.out.println("DEBE INGRESAR UN CANTIDAD MAYOR A 0");
            }
        } else {
            System.out.println("DEBE INGREGAR UN VALOR EN CANTIDAD");
        }
        this.cantidadDeAmbiente = cantidadDeAmbiente;
    }

    public boolean isTieneCochera() {
        return tieneCochera;
    }

    public void setTieneCochera(boolean tieneCochera) {
        this.tieneCochera = tieneCochera;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }


    @Override
    public void imprimirDatos() {
        System.out.println("\nObj Inmueble Techado --->" +
                "\n\ndomicilio: " + getDomicilio() +
                "\nSuperficie: " + getSuperficie() +
                "\nPrecio: " + getPrecio() +
                "\nReservado: " + isReservado() +
                "\nVendido: " + isVendido() +
                "\n\nCliente " +
                "\nNombre: " + getPropietario().getNombre() +
                "\nTélefono: " + getPropietario().getTelefono() +
                "\nCorreo: " + getPropietario().getCorreo() +
                "\n\nInmuble Techado" +
                "\nCantidad de Ambientes: " + getCantidadDeAmbiente() +
                "\nTienen cochera:? " + isTieneCochera() +
                "\nTiene Piscina:? " + isTienePiscina());
    }


}
