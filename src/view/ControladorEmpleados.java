package view;

import model.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControladorEmpleados {
    // Verifica si existe un empleado en la base de datos con el usuario y la contraseña proporcionados
    public boolean existeEmpleado(String usuario, String contraseña) {
        boolean existe = false;
        try {
            Conexion c = new Conexion(); // Objeto para manejar la conexión a la base de datos
            c.connect(); // Establece la conexión a la base de datos
            PreparedStatement st = (PreparedStatement) c.getCon().prepareStatement("SELECT nombre_usuario, clave FROM empleados WHERE nombre_usuario=? AND clave=?"); // Prepara una consulta parametrizada
            st.setString(1, usuario); // Asigna el valor del usuario al primer parámetro de la consulta
            st.setString(2, contraseña); // Asigna el valor de la contraseña al segundo parámetro de la consulta
            ResultSet rs = st.executeQuery(); // Ejecuta la consulta y obtiene el resultado

            if(rs.next()){ // Comprueba si hay un resultado en el conjunto de resultados
                existe = true; // Establece el indicador de existencia como verdadero si hay al menos un resultado
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Imprime cualquier excepción ocurrida durante el proceso
        }
        return existe; // Devuelve el indicador de existencia
    }
}
