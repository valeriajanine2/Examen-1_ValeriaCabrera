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
public class Figuras extends Articulos {
    
    private String descripcion;
    private String instrucciones;
    private String garantía;

    public Figuras() {
        super();
    }

    public Figuras(String descripcion, String instrucciones, String garantía) {
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.garantía = garantía;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantía() {
        return garantía;
    }

    public void setGarantía(String garantía) {
        this.garantía = garantía;
    }

    @Override
    public String toString() {
        return "Figuras{" + "descripcion=" + descripcion + ", instrucciones=" + instrucciones + ", garant\u00eda=" + garantía + '}';
    }
    
    
    
}
