
package misegundoprograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

public class Recepcion extends javax.swing.JFrame {
DefaultTableModel TablaConfirma;
String DetalleOrden[]=new String[9];
MiSegundoPrograma cc=new MiSegundoPrograma();
Connection cn=cc.conexion();
String CodigoOrden;
String codigoproveedor; 
String idproductoStop;
String status_recep;
String cantStop;
String fecInv;
double precioInv;
    
    public Recepcion() {
        initComponents();
        TablaConfirma=new DefaultTableModel();
        TablaConfirma.addColumn("Orden");
        TablaConfirma.addColumn("Codigo");
        TablaConfirma.addColumn("Fecha");
        TablaConfirma.addColumn("Discripcion del Productos");
        TablaConfirma.addColumn("C/U");
        TablaConfirma.addColumn("Precio de compra");
        TablaConfirma.addColumn("Monto");
        TablaConfirma.addColumn("Status");
        TablaConfirma.addColumn("Fec_Recep");
        this.TableDetalleOrdenCompras.setModel(TablaConfirma);
         combinaComboyTabla();
        
    }

    //comentarios
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarOrdenRecepcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarOrdenCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodProveedor = new javax.swing.JTextField();
        txtnombreProv = new javax.swing.JTextField();
        txtcuitProv = new javax.swing.JTextField();
        txtcuilProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDetalleOrdenCompras = new javax.swing.JTable();
        EjecutaRecepcion = new javax.swing.JButton();
        btnSalirDeRecepcionDeMateriales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Recepcion de Inventario");

        txtBuscarOrdenRecepcion.setText("Introduce num Orden");

        jLabel2.setText("Numero Orden de Compra:");

        btnBuscarOrdenCompra.setText("Buscar Orden");
        btnBuscarOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Proveedor");

        jLabel4.setText("Nombre de Proveedor");

        jLabel5.setText("Cuit");

        jLabel6.setText("Cuil");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Detalle de Orden de Compra");

        TableDetalleOrdenCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableDetalleOrdenCompras);

        EjecutaRecepcion.setText("Recepcion con Firmada");
        EjecutaRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutaRecepcionActionPerformed(evt);
            }
        });

        btnSalirDeRecepcionDeMateriales.setText("Salir");
        btnSalirDeRecepcionDeMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDeRecepcionDeMaterialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtBuscarOrdenRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarOrdenCompra)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcuitProv, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtcuilProv, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 465, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalirDeRecepcionDeMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EjecutaRecepcion)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarOrdenRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarOrdenCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcuitProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcuilProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EjecutaRecepcion)
                    .addComponent(btnSalirDeRecepcionDeMateriales))
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenCompraActionPerformed
        // TODO add your handling code here:
        
        tablaOrdenCompras();
        unirtablas();
        BuscarProveedor();
        OptenerStop();
        
    }//GEN-LAST:event_btnBuscarOrdenCompraActionPerformed

    private void EjecutaRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutaRecepcionActionPerformed
        // Autorizar
        Recepcion(); // actualiza inventario y precio
        actualizaOrdenCompra(); // actualiza Orden de Compra Actualizando Item confirmado
        OptenerStop();
    }//GEN-LAST:event_EjecutaRecepcionActionPerformed

    private void btnSalirDeRecepcionDeMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDeRecepcionDeMaterialesActionPerformed
        // Salir de Recepción de Materiales
        this.dispose();
        
    }//GEN-LAST:event_btnSalirDeRecepcionDeMaterialesActionPerformed


    public void tablaOrdenCompras(){
            
            String sql="SELECT * FROM ordencompra WHERE idCompra=?";  
            try{
            PreparedStatement ps=cn.prepareStatement(sql);
            CodigoOrden=JOptionPane.showInputDialog(null, "Ingrese numero de Orden de Compra");
            
            ResultSet rs;    
            ps.setString(1,CodigoOrden);
            rs=ps.executeQuery();
            while(rs.next()){
                DetalleOrden[0]=rs.getString(1); //"idCompra"
                DetalleOrden[1]=rs.getString(2); //"producto_id"
                DetalleOrden[2]=rs.getString(3); //"fecha_compra"
                DetalleOrden[3]=rs.getString(4); //"Descripcion_compra"
                DetalleOrden[4]=rs.getString(5); //"cantidad_compra"
                DetalleOrden[5]=rs.getString(6); //"precio_compra"
                DetalleOrden[6]=rs.getString(7); //"monto_compra"
                DetalleOrden[7]=rs.getString(8); //"Status"
                DetalleOrden[8]=rs.getString(9); //"fecha recepción"
                TablaConfirma.addRow(DetalleOrden);
                txtBuscarOrdenRecepcion.setText(DetalleOrden[0]=rs.getString(1));
                idproductoStop=DetalleOrden[1]=rs.getString(2); //"producto_id"    
            }
            TableDetalleOrdenCompras.setModel(TablaConfirma);
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No existe la orden de compra, "+ex);
        }
            
    }
// buscar proveedor
public void BuscarProveedor(){
    try {
        int idpro;
        String sql_proveedor="SELECT * FROM proveedor WHERE id_proveedor=?";
        PreparedStatement ps1=cn.prepareStatement(sql_proveedor);
        idpro=unirtablas();
        ps1.setInt(1,idpro);
        ResultSet rs;
        rs=ps1.executeQuery();
        
            if(rs.next()){ 
                txtcodProveedor.setText(rs.getObject("id_proveedor").toString());
                txtnombreProv.setText(rs.getObject("nombre").toString());
                txtcuitProv.setText(rs.getObject("cuit").toString());
                txtcuilProv.setText(rs.getObject("cuil").toString()); 
                
                
            }
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    } 
}
   
public int unirtablas(){
    int idprov_recepcion = 0;
    try{
        String sql_orden_general="SELECT * FROM comprageneral WHERE num_orden_id=?";
        PreparedStatement ps1=cn.prepareStatement(sql_orden_general);
        ps1.setString(1,CodigoOrden);
        ResultSet rs;
        rs=ps1.executeQuery();
            if(rs.next()){
                idprov_recepcion=(int) rs.getObject("proveedor_id");
                
            }
            
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return idprov_recepcion;
}

// Combianar una combo box en una tabla o jtable
public void combinaComboyTabla(){
    String DatosCombo[]=new String[3]; 
        DatosCombo[0]="Seleccione una Opcion";
        DatosCombo[1]="Confirmada";
        DatosCombo[2]="Pendiente";
        JComboBox jcb=new JComboBox(DatosCombo);
        TableColumn confirma=TableDetalleOrdenCompras.getColumnModel().getColumn(7);
        TableCellEditor tce=new DefaultCellEditor(jcb);
        confirma.setCellEditor(tce);
}

//Optener Status de la tabla TableDetalleOrdenCompras
public String ActualizaStopInventario(String codigoInv){
    String sql_orden_general="SELECT * FROM inventarios WHERE codigoI=?";
    
try{
        
        PreparedStatement ps1=cn.prepareStatement(sql_orden_general);
        ps1.setString(1,CodigoOrden);
        ResultSet rs;
        rs=ps1.executeQuery();
            if(rs.next()){
                codigoInv=(String) rs.getObject("codigoI");
                
                
            }
            
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return codigoInv;

}

//Optener Stop del inventario
public void OptenerStop(){
    String sqlStop="SELECT * FROM inventarios WHERE codigoI=?";
    int codpro;
    
    try {
        PreparedStatement pstop=cn.prepareStatement(sqlStop);
        ResultSet rs;
        pstop.setString(1, idproductoStop);
        rs=pstop.executeQuery();
        while(rs.next()){
            //codpro=(int) rs.getObject("codigoI");
            cantStop=(String)rs.getObject("cantI");
            //fecInv=(String) rs.getObject("fechaI");
            //precioInv=(Double) rs.getObject("precioI");
            
        }
        System.out.println(cantStop);
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
/* Actualizar tabla Orden de Compra y Actualizar tabla Inventario una vez con firmada la Recepcion del producto o 
 materiales */
public void Recepcion(){
    String sql_actualiza_inventario="UPDATE inventarios SET fechaI=?,cantI=?,precioI=? WHERE (codigoI=?)";
    int act_cant, act_codigo, aux_cant1=0,aux_cant2=0;
    String act_fecha,fechaRecep;
    Double act_precio;
    try {
        for (int i = 0; i < TableDetalleOrdenCompras.getRowCount(); i++) {
            act_codigo=Integer.parseInt(TableDetalleOrdenCompras.getValueAt(i, 1).toString());
            act_fecha=(TableDetalleOrdenCompras.getValueAt(i, 2).toString());
            act_cant=Integer.parseInt(TableDetalleOrdenCompras.getValueAt(i, 4).toString());
            act_precio=Double.parseDouble(TableDetalleOrdenCompras.getValueAt(i, 5).toString());
            status_recep=(TableDetalleOrdenCompras.getValueAt(i, 7).toString());
            fecInv=act_fecha;
            precioInv=act_precio;
            aux_cant2=Integer.parseInt(cantStop);
            aux_cant1=(aux_cant2+act_cant);
            
                if(status_recep=="Confirmada"){
                PreparedStatement psActualizarInventario=cn.prepareStatement(sql_actualiza_inventario);
                psActualizarInventario.setString(1,act_fecha);
                psActualizarInventario.setInt(2,aux_cant1);
                psActualizarInventario.setDouble(3,act_precio);
                psActualizarInventario.setDouble(4,act_codigo);
                int ejecuta_actInventario=psActualizarInventario.executeUpdate();
                if(ejecuta_actInventario>0){
                JOptionPane.showMessageDialog(null,"Actualizada tabla de Inventario");
                }
                }else{
                    JOptionPane.showMessageDialog(this,"No Actualizo Inventarios");
                }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    }
}
//Actualizar tabla de recepcion de materiales
public void actualizaOrdenCompra(){
String sql_actOrden_compra="UPDATE ordencompra SET status=?,fecharecepcion=? where idCompra=?";
String tem_status, tem_fecha;
int codigo_pedidos, contador=0;
ResultSet rs1;
    try {
        for (int i = 0; i < TableDetalleOrdenCompras.getRowCount(); i++) {
            codigo_pedidos=Integer.parseInt(TableDetalleOrdenCompras.getValueAt(i, 0).toString());
            tem_status=(TableDetalleOrdenCompras.getValueAt(i, 7).toString());
            tem_fecha=(TableDetalleOrdenCompras.getValueAt(i, 8).toString());   
            contador=contador+1;
        PreparedStatement ps_actualizar_orden=cn.prepareStatement(sql_actOrden_compra);
          
        ps_actualizar_orden.setString(1,(TableDetalleOrdenCompras.getValueAt(i, 7).toString()));
        ps_actualizar_orden.setString(2,(TableDetalleOrdenCompras.getValueAt(i, 8).toString()));
        ps_actualizar_orden.setString(3,(TableDetalleOrdenCompras.getValueAt(i, 0).toString()));
        idproductoStop=Integer.valueOf(codigo_pedidos).toString();
        int ejecute1=ps_actualizar_orden.executeUpdate();
        if(ejecute1>0){
             
             
                JOptionPane.showMessageDialog(null,"Confirmada Orden de Compra Item afectados: "+contador);
            }
      }
        
    } catch (SQLException ex) {
        Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EjecutaRecepcion;
    private javax.swing.JTable TableDetalleOrdenCompras;
    public javax.swing.JButton btnBuscarOrdenCompra;
    private javax.swing.JButton btnSalirDeRecepcionDeMateriales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarOrdenRecepcion;
    private javax.swing.JTextField txtcodProveedor;
    private javax.swing.JTextField txtcuilProv;
    private javax.swing.JTextField txtcuitProv;
    private javax.swing.JTextField txtnombreProv;
    // End of variables declaration//GEN-END:variables
}
