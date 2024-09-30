package Vista;

import Controlador.AdministradorControl;
import Controlador.EmpleadoControl;
import Modelo.Barberia;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class MenuInicioVista extends JFrame {
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;
    private JLabel lblMessage;

    // Simulación de una base de datos de usuarios (username, password, role)
    private HashMap<String, String[]> usersDatabase = new HashMap<>();

    public MenuInicioVista() {
        super("Menu Inicio");
        setSize(600, 300); // Aumentar tamaño de la ventana para dar espacio a la imagen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Crear base de datos simulada de usuarios
        usersDatabase.put("admin", new String[]{"admin123", "admin"});
        usersDatabase.put("cliente", new String[]{"cliente123", "cliente"});
        usersDatabase.put("empleado", new String[]{"empleado123", "empleado"});

        createLoginGUI();
        createImage(); // Método para cargar la imagen

        setVisible(true);
    }

    public void createLoginGUI() {
        // Campos de texto para usuario y contraseña
        JLabel lblUsername = new JLabel("Usuario:");
        lblUsername.setBounds(50, 50, 80, 25);
        add(lblUsername);

        tfUsername = new JTextField(20);
        tfUsername.setBounds(130, 50, 120, 25);
        add(tfUsername);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(50, 100, 80, 25);
        add(lblPassword);

        pfPassword = new JPasswordField(20);
        pfPassword.setBounds(130, 100, 120, 25);
        add(pfPassword);

        // Botón de login
        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 150, 100, 30);
        btnLogin.setForeground(Color.red);
        btnLogin.setBackground(Color.white);
        add(btnLogin);

        lblMessage = new JLabel("");
        lblMessage.setBounds(50, 200, 200, 25);
        add(lblMessage);
        
        JLabel jl = new JLabel(" INICIAR SESIÓN ");
        jl.setBounds(50, 15, 200, 20);
        jl.setOpaque(true);
        jl.setForeground(Color.red);
        jl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(jl);

        // Añadir evento de login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateLogin();
            }
        });
    }

    // Método para crear y añadir la imagen al frame
    private void createImage() {
        // Cargar la imagen desde la carpeta de recursos
        ImageIcon imgOriginal = new ImageIcon(getClass().getResource("/imagenes/clika.png"));
        // Escalar la imagen a un tamaño adecuado
        ImageIcon imgEscalada = new ImageIcon(
            imgOriginal.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH)
        );
        
        JLabel jlImagen = new JLabel(imgEscalada); // Crear JLabel con la imagen
        jlImagen.setBounds(300, 0, 300, 280); // Ubicar la imagen a la derecha
        add(jlImagen); // Añadir la imagen al JFrame
    }

    // Método para validar el login
    private void validateLogin() {
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());

        if (usersDatabase.containsKey(username)) {
            String[] userInfo = usersDatabase.get(username);
            if (userInfo[0].equals(password)) {
                String role = userInfo[1];
                lblMessage.setText("Login exitoso! Rol: " + role);
                redirectToMenu(role); // Redirigir al menú según el rol
            } else {
                lblMessage.setText("Contraseña incorrecta");
            }
        } else {
            lblMessage.setText("Usuario no existe");
        }
    }

    // Método para redirigir al menú dependiendo del rol
    private void redirectToMenu(String role) {
        this.dispose(); // Cierra la ventana de login
        Barberia barberia = new Barberia(); // Crear instancia de Barbería para ser usada
        
        if (role.equals("admin")) {
            AdministradorControl adminControl = new AdministradorControl(barberia);
            new AdministradorVista(adminControl); // Pasar el controlador al menú admin
        } else if (role.equals("cliente")) {
            JOptionPane.showMessageDialog(null, "Redirigiendo al menú de cliente...");
            // Aquí puedes definir el menú de cliente
        } else if (role.equals("empleado")) {
            EmpleadoControl empleadoControl = new EmpleadoControl(barberia);
            new EmpleadoVista(empleadoControl); // Pasar el controlador al menú de empleado
        }
    }
}
