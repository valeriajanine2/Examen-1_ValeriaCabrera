/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_valeriacabrera;

/**
 *
 * @author Usuario
 */
public class Comic extends Articulos {
    
    private int volumen;
    private String descripcion;
    private int estado;

    public Comic() {
        super();
    }

    public Comic(int volumen, String descripcion, int estado) {
        this.volumen = volumen;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comic{" + "volumen=" + volumen + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    
}