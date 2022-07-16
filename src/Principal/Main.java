
package Principal;
import Modelo.*;
import Vistas.*;
/*
 * @author Enith PB G53
 */
public class Main {

    public static void main(String[] args) {
        //1. Creamos la instancia de la vista login
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);
        //2. Crear instancia de la clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }
    
}
