package misegundoprograma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static net.ucanaccess.converters.Functions.date;
//import static org.apache.xalan.lib.ExsltDatetime.date;

public class Disponible extends javax.swing.JFrame {
MiSegundoPrograma cc=new MiSegundoPrograma();
Connection cn=cc.conexion();
DefaultTableModel TablaDisponible;
String BancosYCaja[]= new String[4];
String PagosRegistrados[]= new String[5]; 
DefaultTableModel TablaParaPagos;
private static String codigoProveedorTemporal;
private static String nombreProveedorTemporal;

    public Disponible() {
        initComponents();
        // tabla de disponible de Bancos y cajas
        TablaDisponible = new DefaultTableModel();
        TablaDisponible.addColumn("Codigo");
        TablaDisponible.addColumn("Nombres");
        TablaDisponible.addColumn("Fecha");
        TablaDisponible.addColumn("Saldo");
        JtablaBancosyCajas.setModel(TablaDisponible);
        
        //tabla de para pagos pendiente
        TablaParaPagos = new DefaultTableModel();
       TablaParaPagos.addColumn("Item");
       TablaParaPagos.addColumn("Nro");
       TablaParaPagos.addColumn("Nombre Proveedor");
       TablaParaPagos.addColumn("fecha");
       TablaParaPagos.addColumn("Saldo");
       jTablaParaPagosRegistrados.setModel(TablaParaPagos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaParaPagosRegistrados = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnIngresarBancoYCaja = new javax.swing.JButton();
        SalirDeCaja = new javax.swing.JButton();
        txtPagosRegistrados = new javax.swing.JTextField();
        MostrarPagosRegistrados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtablaBancosyCajas = new javax.swing.JTable();
        txtTotalEnCaja = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Disponible de Caja Consolidados");

        jLabel2.setText("Plan de Pagos");

        jTablaParaPagosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaParaPagosRegistrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTablaParaPagosRegistradosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaParaPagosRegistrados);

        jLabel3.setText("Codigo");

        jLabel4.setText("Descripción");

        jLabel6.setText("Fecha");

        jLabel7.setText("Saldo");

        btnIngresarBancoYCaja.setText("Agregue Saldo ...");
        btnIngresarBancoYCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarBancoYCajaActionPerformed(evt);
            }
        });

        SalirDeCaja.setText("Salir");
        SalirDeCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirDeCajaActionPerformed(evt);
            }
        });

        MostrarPagosRegistrados.setText("Ingrese Pagos");
        MostrarPagosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPagosRegistradosActionPerformed(evt);
            }
        });

        JtablaBancosyCajas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(JtablaBancosyCajas);

        jLabel8.setText("Bancos y Caja en Efectivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MostrarPagosRegistrados)
                        .addGap(562, 562, 562))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalEnCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIngresarBancoYCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(422, 422, 422)
                                .addComponent(txtPagosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(SalirDeCaja)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarBancoYCaja)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalEnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(MostrarPagosRegistrados)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPagosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(SalirDeCaja)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirDeCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDeCajaActionPerformed
        // Salir de Caja Disponible
        this.dispose();
    }//GEN-LAST:event_SalirDeCajaActionPerformed

    private void btnIngresarBancoYCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarBancoYCajaActionPerformed
        // TODO add your handling code here:
        CargarBancosYCaja();
        Limpiar();
        SumarBancosyCaja();
    }//GEN-LAST:event_btnIngresarBancoYCajaActionPerformed

    private void jTablaParaPagosRegistradosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablaParaPagosRegistradosKeyPressed
        // TODO add your handling code here:
        //SumarPagosRegistrados();
    }//GEN-LAST:event_jTablaParaPagosRegistradosKeyPressed

    private void MostrarPagosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPagosRegistradosActionPerformed
       
        OrdenParaPagosRegistrados();
        ConsultaProveedor();
        SumarPagosRegistrados();
    }//GEN-LAST:event_MostrarPagosRegistradosActionPerformed

    
    //cargar bancos y cajas
    public void CargarBancosYCaja(){
        int codigoB;
        String DescripcionB, FechaB;
        Double saldoB;
        saldoB=Double.parseDouble(txtSaldo.getText().toString());
        BancosYCaja[0]=txtCodigo.getText();
        BancosYCaja[1]=txtNombre.getText();
        BancosYCaja[2]=txtFecha.getText();
        BancosYCaja[3]=String.valueOf(saldoB);
        TablaDisponible.addRow(BancosYCaja);
            JOptionPane.showMessageDialog(null,"Saldo Agregado con Exito");
            JtablaBancosyCajas.setModel(TablaDisponible);
    }
    //limpiar cajas de textos
    public void Limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        txtSaldo.setText("");
    }
    
    //metodo sumar
    public void SumarBancosyCaja(){
        //recorre las filas de Jtable o tabla
        double suma=0, total=0, iva=21, totalpago, montoIva=0;
            for (int i = 0; i < JtablaBancosyCajas.getRowCount(); i++) {
                suma=Double.parseDouble( JtablaBancosyCajas.getValueAt(i,3).toString());
                total=total+suma; //acumula    
            }
            
             if(total>0){           
                 txtTotalEnCaja.setText(String.valueOf(total));
             }
    }
    
    // metodo sumar pagos registrados
    //metodo sumar
    public void SumarPagosRegistrados(){
        //recorre las filas de Jtable o tabla
        double suma=0, total=0, iva=21, totalpago, montoIva=0;
            for (int i = 0; i < jTablaParaPagosRegistrados.getRowCount(); i++) {
                suma=Double.parseDouble( jTablaParaPagosRegistrados.getValueAt(i,4).toString());
                total=total+suma; //acumula    
            }
            
             if(total>0){           
                 txtPagosRegistrados.setText(String.valueOf(total));
             }
    }
    //metodo consulta de proveedor
    public void ConsultaProveedor(){
        ResultSet rsMiProveedor;
        int codigoT = 0;
    try {
        PreparedStatement MiProveedor=cn.prepareStatement("select * from proveedor where id_proveedor=?");
        MiProveedor.setInt(1,codigoT);
        rsMiProveedor=MiProveedor.executeQuery();
        while(rsMiProveedor.next()){
            nombreProveedorTemporal=rsMiProveedor.getString("nombre");
           // codigoProveedorTemporal=rsMiProveedor.getString("id_proveedor");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Disponible.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }
    
    //metodos para buscar Orden para pago
    public void OrdenParaPagosRegistrados(){
        int item=0;
        int codigoTemporal;
        String sql="";
        ResultSet rs;
        
    try {
        PreparedStatement ConsultaParaPagos=cn.prepareStatement("select * from ordenparapagar");
        ConsultaParaPagos.setString(1,codigoProveedorTemporal);
        rs=ConsultaParaPagos.executeQuery();
        while(rs.next()){
            item++;
            PagosRegistrados[0]=String.valueOf(item);
            PagosRegistrados[1]=String.valueOf(rs.getInt("codigoProveedor"));
            PagosRegistrados[2]=String.valueOf(nombreProveedorTemporal);
            PagosRegistrados[3]=String.valueOf(rs.getObject("fechaDeRegistro"));
            PagosRegistrados[4]=String.valueOf(rs.getDouble("totalPago"));
            TablaParaPagos.addRow(PagosRegistrados);
            
    }
        
     jTablaParaPagosRegistrados.setModel(TablaParaPagos);
     System.out.println(item);
     System.out.println(rs.getObject("codigoProveedor"));
     System.out.println(nombreProveedorTemporal);
     System.out.println(rs.getObject("fechaDeRegistro"));
     System.out.println(rs.getObject("totalPago"));
    } catch (SQLException ex) {
        Logger.getLogger(Disponible.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disponible().setVisible(true);
                
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtablaBancosyCajas;
    private javax.swing.JButton MostrarPagosRegistrados;
    private javax.swing.JButton SalirDeCaja;
    private javax.swing.JButton btnIngresarBancoYCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaParaPagosRegistrados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPagosRegistrados;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotalEnCaja;
    // End of variables declaration//GEN-END:variables

    private void Close(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
