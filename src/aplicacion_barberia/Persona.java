/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_barberia;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Persona {
    String nombre , telefono;
    
     // Constructor por defecto
    public Persona() {
        nombre = "-";
        telefono = "-";
    }

    // Constructor con parámetros
    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void setNombre(String nom){
    nombre = nom;
    }
    
    public void setNombre(){
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setTelefono(String tel){
    telefono = tel;
    }
    
    public void setTelefono(){
        telefono = JOptionPane.showInputDialog("Ingrese su telefono");
    }
    
    public String getTelefono(){
        return telefono;
    }
    
}