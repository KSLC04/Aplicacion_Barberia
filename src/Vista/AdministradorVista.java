package Vista;

import Controlador.AdministradorControl;
import Modelo.Barberia;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministradorVista extends JFrame {
    private AdministradorControl controlador;

    public AdministradorVista(AdministradorControl controlador) {
        this.controlador = controlador;
        initUI();
    }

    private void initUI() {
        setTitle("Administrador - Menú");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        

        // Crear botones para las opciones del menú
        JButton btnCrearCliente = new JButton("Crear Cliente");
        btnCrearCliente.setBounds(100, 30, 200, 30);
        add(btnCrearCliente);

        JButton btnEliminarCliente = new JButton("Eliminar Cliente");
        btnEliminarCliente.setBounds(100, 70, 200, 30);
        add(btnEliminarCliente);

        JButton btnCrearEmpleado = new JButton("Crear Empleado");
        btnCrearEmpleado.setBounds(100, 110, 200, 30);
        add(btnCrearEmpleado);

        JButton btnEliminarEmpleado = new JButton("Eliminar Empleado");
        btnEliminarEmpleado.setBounds(100, 150, 200, 30);
        add(btnEliminarEmpleado);

        JButton btnVerClientes = new JButton("Ver Clientes");
        btnVerClientes.setBounds(100, 190, 200, 30);
        add(btnVerClientes);

        JButton btnVerEmpleados = new JButton("Ver Empleados");
        btnVerEmpleados.setBounds(100, 230, 200, 30);
        add(btnVerEmpleados);

        // Añadir ActionListeners para cada botón
        btnCrearCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.crearCliente();
            }
        });

        btnEliminarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarCliente();
            }
        });

        btnCrearEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.crearEmpleado();
            }
        });

        btnEliminarEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarEmpleado();
            }
        });

        btnVerClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.verListadoClientes();
            }
        });

        btnVerEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.verListadoEmpleados();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        AdministradorControl adminControl = new AdministradorControl(barberia);
        new AdministradorVista(adminControl); // Inicia la ventana gráfica de administrador
    }
}
