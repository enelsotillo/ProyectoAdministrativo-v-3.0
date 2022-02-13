
package misegundoprograma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaProveedorExterno {
    MiSegundoPrograma cc = new MiSegundoPrograma();
    Connection cn=cc.conexion();
 String idProveedor;
 String NombreProveedor;
       
    public ConsultaProveedorExterno(String idProveedor, String NombreProveedor) {
        this.idProveedor = idProveedor;
        this.NombreProveedor = NombreProveedor;
    }

    ConsultaProveedorExterno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void DatosProveedorEnRegistro(){
        ResultSet rsMiProveedor;
         try {
        PreparedStatement MiProveedor=cn.prepareStatement("select * from proveedor");
        
        rsMiProveedor=MiProveedor.executeQuery();
        while(rsMiProveedor.next()){
            idProveedor=rsMiProveedor.getString("id_proveedor");
            NombreProveedor=rsMiProveedor.getString("nombre");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Disponible.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }
    public String getIdProveedor() throws SQLException {
        
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }
public String toStrin(){
    return toString("Nombre: "+ NombreProveedor+"id Proveedor:" + idProveedor);
}

    private String toString(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
}
