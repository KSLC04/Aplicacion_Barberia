/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_barberia;

public class Cliente extends Persona {
    // Puedes agregar más atributos específicos para Cliente si es necesario

    // Constructor
    public Cliente() {
        super(); // Llama al constructor de Persona
    }
     
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Teléfono: " + getTelefono(); // Muestra el nombre y el teléfono del cliente
    }
}