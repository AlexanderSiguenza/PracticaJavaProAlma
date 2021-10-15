/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicaprocalmacenados.utileria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Labderecho03
 */
public final class CargarPropiedades {

    public static Properties prop = new Properties();
    InputStream is = null;

    public CargarPropiedades() throws IOException {
        leerPropiedades();
    }

    public static Properties getProp() {
        return prop;
    }

    public static void setProp(Properties prop) {
        CargarPropiedades.prop = prop;
    }

    public void leerPropiedades() throws FileNotFoundException, IOException {
        //is = new FileInputStream(System.getProperty("user.dir") + "\\src\\propiedades\\propiedades.properties");   
        is = new FileInputStream(System.getProperty("user.dir") + "\\configuraciones.properties");    
        prop.load(is);       
    }    
    

}
