/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicaprocalmacenados.clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Alexander-Siguenza
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private Connection cnn;
    private String Insertar = "CALL pro_nuevo_usuario(?,?,?,?)";
    private String Modificar = "CALL ModificarEmpleados(?,?,?,?,?)";
    private String Eliminar = "CALL BorrarEmpleados(?)";

    public Usuario() {
        cnn = Conexion.Conectar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void proc_ver_Usuario() {
    }

    public String proc_nuevo_Usuario() {
        String resultado;
        try {
            CallableStatement cmst = cnn.prepareCall("CALL pro_nuevo_usuario(?,?,?,?)");  
            cmst.setString(1,nombre);
            cmst.setString(2,apellido);
            cmst.setInt(3,edad);
            cmst.setString(4,correo);
            cmst.execute();
            resultado = " Los datos se ingresaron exitosamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }

    public void proc_eliminar_Usuario() {
    }

    public void proc_actualizar_Usuario() {
    }

}
