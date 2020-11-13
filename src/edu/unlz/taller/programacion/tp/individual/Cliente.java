package edu.unlz.taller.programacion.tp.individual;

import java.util.Objects;

public class Cliente {

    /**
     * Se declara los atributos
     */
    public String nombre;
    public String telefono;
    public String correo;

    /**
     * Se crea el constructor
     * @param nombre
     * @param telefono
     * @param correo
     */
    public Cliente(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Getter & Setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(telefono, cliente.telefono) &&
                Objects.equals(correo, cliente.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono, correo);
    }
}
