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
public class Gerente extends Personas {
    
    private String usuario;
    private String password;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String password, String cargo, int id, String nombre, int edad, String sexo, String estado, double altura, double peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", password=" + password + ", cargo=" + cargo + '}';
    }
    
    
    
    
    
}