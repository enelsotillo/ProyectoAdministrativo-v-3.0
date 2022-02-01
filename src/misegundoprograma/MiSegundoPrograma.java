
package misegundoprograma;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.awt.SystemColor.window;
import java.sql.Connection;

public class MiSegundoPrograma {
   private static Connection con= null;
   private static final String usuario="root";
   private static final String clave="";
    
    public Connection conexion(){
     try{
         //Class.forName("com.mysql.jdbc.Driver");
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicios",usuario,clave);
         //con = DriverManager.getConnection("jdbc:ucanaccess://C:/TablaDatos/Servicios.accdb");
         JOptionPane.showMessageDialog(null, "Base de Datos Conectada");
     }   
     catch(HeadlessException | ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,"Error de Conexion "+ e);
     }
     return con;
    }
    
    public static void main(String[] args) {
//    Clientes pp1=new Clientes();
//    pp1.setVisible(true);
//    pp1.setTitle("Pantalla Clientes");
//    pp1.setLocationRelativeTo(null);
//    Inventarios pp2=new Inventarios();
//    pp2.setVisible(true);
//    pp2.setTitle("Pantalla de Inventarios");
//    pp2.setLocationRelativeTo(null);
//    Proveedor pp3=new Proveedor();
//    pp3.setVisible(true);
//    pp3.setTitle("Pantalla de Deposito");
//    pp3.setLocationRelativeTo(null);
    Bienvenida principal=new Bienvenida();
    principal.setVisible(true);
    principal.setTitle("BIENVENIDO AL SISTEMA");
    principal.setLocationRelativeTo(null);
    
    }
    
}
