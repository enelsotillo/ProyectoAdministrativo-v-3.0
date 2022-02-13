
package misegundoprograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DatosRegistrarFacturas {
    MiSegundoPrograma cc = new MiSegundoPrograma();
    Connection cn=cc.conexion();
    int numeroDeRegistro;
    int codigoProveedor;
    String nroDeFactura;
    String nombreProveedor;
    int nroDeOrdenCompras;
    String fechaRegistro;
    double totalPagos;

    public DatosRegistrarFacturas(int numeroDeRegistro, int codigoProveedor, String nroDeFactura, String nombreProveedor, int nroDeOrdenCompras, String fechaRegistro, double totalPagos) {
        this.numeroDeRegistro = numeroDeRegistro;
        this.codigoProveedor = codigoProveedor;
        this.nroDeFactura = nroDeFactura;
        this.nombreProveedor = nombreProveedor;
        this.nroDeOrdenCompras = nroDeOrdenCompras;
        this.fechaRegistro = fechaRegistro;
        this.totalPagos = totalPagos;
    }

    DatosRegistrarFacturas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNroDeFactura() {
        return nroDeFactura;
    }

    public void setNroDeFactura(String nroDeFactura) {
        this.nroDeFactura = nroDeFactura;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getNroDeOrdenCompras() {
        return nroDeOrdenCompras;
    }

    public void setNroDeOrdenCompras(int nroDeOrdenCompras) {
        this.nroDeOrdenCompras = nroDeOrdenCompras;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(double totalPagos) {
        this.totalPagos = totalPagos;
    }
    
}
