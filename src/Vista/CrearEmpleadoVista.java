package Vista;

import Controlador.CrearEmpleadoControl;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CrearEmpleadoVista extends JFrame {
    public JTextField jtNombre, jtTelefono, jtEspecialidad;
    public JButton jbGuardar, jbVolver;
    public CrearEmpleadoControl crearEmpleadoControl;
    public AdministradorVista adminVista;

    public CrearEmpleadoVista(AdministradorVista adminVista) {
        super ("Creacion de Empleados");
        this.adminVista = adminVista;
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        CrearGUI();
        setVisible(true);
    }

    private void CrearGUI() {
        JLabel jl = new JLabel("Crear Empleado");
        jl.setBounds(0, 0, 400, 50);
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setForeground(Color.red);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl);

        // Nombre
        JLabel jlNombre = new JLabel("Nombre:");
        jlNombre.setBounds(30, 70, 120, 25);
        add(jlNombre);
        jtNombre = new JTextField();
        jtNombre.setBounds(150, 70, 150, 25);
        add(jtNombre);

        // Teléfono
        JLabel jlTel = new JLabel("Telefono:");
        jlTel.setBounds(30, 105, 120, 25);
        add(jlTel);
        jtTelefono = new JTextField();
        jtTelefono.setBounds(150, 105, 150, 25);
        add(jtTelefono);

        // Especialidad
        JLabel jlEspecialidad = new JLabel("Especialidad:");
        jlEspecialidad.setBounds(30, 140, 120, 25);
        add(jlEspecialidad);
        jtEspecialidad = new JTextField();
        jtEspecialidad.setBounds(150, 140, 150, 25);
        add(jtEspecialidad);

        crearEmpleadoControl = new CrearEmpleadoControl(this);

        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(30, 220, 100, 25);
        jbGuardar.addActionListener(crearEmpleadoControl);
        add(jbGuardar);

        jbVolver = new JButton("Volver");
        jbVolver.setBounds(140, 220, 100, 25);
        jbVolver.addActionListener(crearEmpleadoControl);
        add(jbVolver);
    }
} 
    
    

