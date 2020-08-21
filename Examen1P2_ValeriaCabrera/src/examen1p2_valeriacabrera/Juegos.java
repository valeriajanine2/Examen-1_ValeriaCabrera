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
public class Juegos extends Articulos{
    
    private int edicion;
    private String casa;
    private String pais;

    public Juegos() {
        super();
    }

    public Juegos(int edicion, String casa, String pais) {
        this.edicion = edicion;
        this.casa = casa;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Juegos{" + "edicion=" + edicion + ", casa=" + casa + ", pais=" + pais + '}';
    }
    
    
    
}
