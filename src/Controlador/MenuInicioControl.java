
package Controlador;

import Vista.MenuInicioVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;


// Aqui tenemos una clase especial para controlar los eventos
// del MenuPrincipal

public class MenuInicioControl implements WindowListener, ActionListener{ // WindowListener se encarga de los eventos sobre la ventana, cuando cerramos... maximixamos  

    public MenuInicioVista mp; //inicializamos el obj
    
    public MenuInicioControl (MenuInicioVista obj){ //esto se hace para poder actuar con la otra clase desde esta
        mp = obj;   
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        evento_salir();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    private void evento_salir() {
        int respuesta = JOptionPane.showConfirmDialog(mp, "Desea realmente salir de la aplicacion?", //mensaje que muestra la ventana emergente
                "Confirmacion", //mensaje titulo de la ventana emergente (se ve en la barra superior)
                JOptionPane.YES_NO_OPTION); //da a elegir si salir o no
        
        if (respuesta ==JOptionPane.YES_NO_OPTION) //Si le das yes se sale
            System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}