package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Statement;

public class Conexion {

    // METODO PARA LA CONEXION A SQL SERVER
    public static Connection getConexion() {

        String conexionUrl = "jdbc:sqlserver://LAPTOP-NVLTKD07:1433;"
                + "database=PRESTAMOS;"
                + "user= sa;"
                + "password=sa;"
                + "loginTimeout=30;";

        try {

            Connection con = DriverManager.getConnection(conexionUrl);
            return con;

        } catch (SQLException ex) {

            System.out.println(ex.toString());
            return null;

        }

    }

  /*  public int login(String user, String password) throws SQLException {

        Integer resultado = 0;
        try {
            Connection con = Conexion.getConexion();
            ResultSet rs = (ResultSet) con.prepareStatement("SELECT * FROM ADMINISTRADOR WHERE nom_admin = ' " + user + " ' AND contrseña = ' " + password + " ' ");

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                resultado = 1;

            } else {
                JOptionPane.showMessageDialog(null, "USUARIO Y/O CONTRASEÑA ERRONEOS");
                resultado = 0;

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }
        return resultado;

    }*/

}
