/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicaprocalmacenados.utileria;

/**
 *
 * @author Labderecho03
 */
public class Combo {
    
    private int id;
    private String nombre;

    public Combo() {
    }

    public Combo(int pid, String pnombre) {
        id = pid;
        nombre = pnombre;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
}
