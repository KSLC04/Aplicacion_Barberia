/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

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
import javax.swing.SwingConstants;

/**
 * La clase CrearEmpleadoVista representa la interfaz gráfica para la creación de empleados
 * en la aplicación de administración de barbería. Permite a los administradores ingresar
 * la información de un nuevo empleado y guardar sus datos.
 */

public class CrearEmpleadoVista extends JFrame {
    public JTextField jtNombre, jtTelefono, jtEspecialidad;
    public JButton jbGuardar, jbVolver;
    public CrearEmpleadoControl crearEmpleadoControl;
    public AdministradorVista adminVista;

    public CrearEmpleadoVista(AdministradorVista adminVista) {
        super ("Creacion de Empleados");
        this.adminVista = adminVista;
        setSize(370, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        CrearGUI();
        setVisible(true);
    }
    
    /**
     * Método para crear y configurar los componentes de la interfaz gráfica.
     */
    
    private void CrearGUI() {
        JLabel jl = new JLabel("Crear Empleado");
        jl.setBounds(0, 0, 370, 30);
        jl.setOpaque(true);
        jl.setForeground(Color.white);
        jl.setBackground(Color.red);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(jl);

        // Nombre
        JLabel jlNombre = new JLabel("Nombre:");
        jlNombre.setBounds(30, 50, 120, 25);
        add(jlNombre);
        jtNombre = new JTextField();
        jtNombre.setBounds(150, 50, 150, 25);
        add(jtNombre);

        // Teléfono
        JLabel jlTel = new JLabel("Telefono:");
        jlTel.setBounds(30, 90, 120, 25);
        add(jlTel);
        jtTelefono = new JTextField();
        jtTelefono.setBounds(150, 90, 150, 25);
        add(jtTelefono);

        // Especialidad
        JLabel jlEspecialidad = new JLabel("Especialidad:");
        jlEspecialidad.setBounds(30, 130, 120, 25);
        add(jlEspecialidad);
        jtEspecialidad = new JTextField();
        jtEspecialidad.setBounds(150, 130, 150, 25);
        add(jtEspecialidad);

        crearEmpleadoControl = new CrearEmpleadoControl(this);

        // Botón para guardar empleado
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(60, 190, 100, 25);
        jbGuardar.addActionListener(crearEmpleadoControl);
        jbGuardar.setBackground(Color.white);
        jbGuardar.setForeground(Color.red);
        add(jbGuardar);

        // Botón para volver
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(200, 190, 100, 25);
        jbVolver.addActionListener(crearEmpleadoControl);
        jbVolver.setBackground(Color.white);
        jbVolver.setForeground(Color.red);
        add(jbVolver);
    }
} 
    
    

