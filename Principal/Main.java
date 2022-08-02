package Principal;

import Vistas.*;
import modelo.*;

public class Main {

    public static void main(String[] args) {
        //2 instancia clase conexion
        Conexion ConexionDB = new Conexion();
//1. Creamos la instancia de la vista login
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);
    }
}
