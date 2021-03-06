package edu.unlz.taller.programacion.tp.individual;

public class InmuebleTechado extends Inmueble implements Imprimible, Constantes {

    /**
     * Se declara los atributos
     */
    private Integer cantidadDeAmbiente;
    private boolean tieneCochera;
    private boolean tienePiscina;

    /**
     * Se declara el constructor
     *
     * @param cantidadDeAmbiente
     * @param tieneCochera
     * @param tienePiscina
     * @param domicilio
     * @param superficie
     * @param precio
     * @param reservado
     * @param vendido
     * @param propietario
     */
    public InmuebleTechado(Integer cantidadDeAmbiente, boolean tieneCochera, boolean tienePiscina, String domicilio, Integer superficie, double precio, boolean reservado, boolean vendido, Cliente propietario) {
        super(domicilio, superficie, precio, reservado, vendido, propietario);
        this.setCantidadDeAmbiente(cantidadDeAmbiente);
        this.tieneCochera = tieneCochera;
        this.tienePiscina = tienePiscina;
    }

    /**
     * Metodo beneficio Obtenido
     *
     * @param comision
     * @return
     */
    @Override
    public Double beneficioObtenido(Double comision) {
        if (this.tienePiscina == true && this.tieneCochera == false) {
            return super.beneficioObtenido(comision + COMISION_PISCINA);
        } else if (this.tieneCochera == true) {
            return super.beneficioObtenido(comision + COMISION_COCHERA);
        } else {
            return super.beneficioObtenido(comision);
        }
    }


    /**
     * Se imprime los atributos de la clase
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("\nInmueble Techado" +
                "\n\nInmuble Techado" +
                "\nCantidad de Ambientes: " + getCantidadDeAmbiente() +
                "\nTienen cochera:? " + isTieneCochera() +
                "\nTiene Piscina:? " + isTienePiscina());
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

}
