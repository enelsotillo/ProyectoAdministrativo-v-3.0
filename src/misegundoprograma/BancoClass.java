
package misegundoprograma;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class BancoClass {
//    MiSegundoPrograma cc = new MiSegundoPrograma();
//    Connection cn=cc.conexion();
String Cuenta;
String Bancos;
String Tipo;
String fecha;
double saldo;

 public   BancoClass(String Cuenta, String Bancos, String Tipo, String fecha, double saldo) {
        this.Cuenta = Cuenta;
        this.Bancos = Bancos;
        this.Tipo = Tipo;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    BancoClass() {
       
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getBancos() {
        return Bancos;
    }

    public void setBancos(String Bancos) {
        this.Bancos = Bancos;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
