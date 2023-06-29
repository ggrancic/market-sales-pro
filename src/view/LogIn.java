package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Conexion;


import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LogIn extends Main{

    public LogIn() {

    }

    @FXML
    private Button loginBtn;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField user;
    @FXML
    private PasswordField password;
    @FXML
    public void initialize() {
        // Desactiva el enfoque en el TextField de usuario y contraseña al inicializar
        user.setFocusTraversable(false);
        password.setFocusTraversable(false);
    }
    public void userLogin (ActionEvent event) throws IOException {
        Main m = new Main();
        String usuario = user.getText();
        String contraseña = password.getText();
        ControladorEmpleados ce = new ControladorEmpleados();

        if (ce.existeEmpleado(usuario, contraseña)) {
            // Si encuentra el usuario y la contraseña en la base de datos, accede a la ventana principal
            m.changeScene("VentanaPrincipal.fxml");
        } else if (usuario.equals("") && contraseña.equals("")) {
            // Verifica si el usuario y la contraseña están vacíos
            String mensaje = "Credenciales vacias. Por favor, introduzca el usuario y la contraseña.";
            JOptionPane.showMessageDialog(null, mensaje, "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            // Hace foco en el campo de usuario
            user.requestFocus();
        } else {
            // Si no coincide con ningún usuario registrado, muestra un mensaje de error
            String mensaje = "Credenciales inválidas. Por favor, verifique el usuario y la contraseña.";
            JOptionPane.showMessageDialog(null, mensaje, "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            // Deja en blanco los campos de texto
            user.setText("");
            password.setText("");
            // Hace foco en el campo de usuario
            user.requestFocus();
        }
    }
    }





    /*public void userLogin(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(user.getText().toString().equals("admin") && password.getText().toString().equals("123")) {
            wrongLogIn.setText("Success!");

            m.changeScene("VentanaPrincipal.fxml");
        }

        else if(user.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }


        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }*/