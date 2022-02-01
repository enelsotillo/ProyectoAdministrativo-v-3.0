
package misegundoprograma;

import java.awt.event.KeyEvent;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javafx.scene.input.KeyCode.J;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inventarios extends javax.swing.JFrame {
    int filas;
   String Datos[]=new String[6];
   MiSegundoPrograma cc=new MiSegundoPrograma();
   Connection cn=cc.conexion();
    public Inventarios() {
        initComponents();
        setTitle("Productos");
        MostrarTabla("");
    
    }
    public void MostrarTabla(String valor){
    DefaultTableModel modelo = new DefaultTableModel();
   modelo.addColumn("Codigo");
   modelo.addColumn("Fecha");
   modelo.addColumn("Descripcion");
   modelo.addColumn("Cantidad");
   modelo.addColumn("Precio");
   modelo.addColumn("Monto");
   TablaIngreso.setModel(modelo);
   
   String sql="";
   //String valor="";
   if(valor.equals("")){
       sql="select * from Inventarios";
   }else{
       sql="select * from Inventarios where codigoI="+valor+"";
   }
   
           try{
            Statement pp=cn.createStatement();
            ResultSet rr=pp.executeQuery(sql);
            while(rr.next()){
                Datos[0]=rr.getString("codigoI");
                Datos[1]=rr.getString("fechaI");
                Datos[2]=rr.getString("descI");
                Datos[3]=rr.getString("cantI");
                Datos[4]=rr.getString("precioI");
                Datos[5]=rr.getString("montoI");
                modelo.addRow(Datos);
            }
      TablaIngreso.setModel(modelo);
    }
            catch(SQLException ex){
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Erro en Registros Intente de Nuevo " + ex);
                    }
           catch(ArrayIndexOutOfBoundsException ex){
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Erro en Registros Intente de Nuevo " + ex);
                    }
           
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIngreso = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSalirArticulos = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("             Ingreso de Productos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Cant");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Monto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Fecha ");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        TablaIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaIngreso.setComponentPopupMenu(jPopupMenu1);
        TablaIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaIngreso.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(TablaIngreso);

        btnInsertar.setText("Insertar Renglon");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Quitar Filtro");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar Reglon");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Codigo");

        btnSalirArticulos.setText("Salir");
        btnSalirArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirArticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(36, 36, 36)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(btnSalirArticulos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 419, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsertar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidad)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonto)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertar)
                            .addComponent(btnModificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnMostrar)
                    .addComponent(btnSalirArticulos))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    
        try {
            
            PreparedStatement recibo=cn.prepareStatement("INSERT INTO inventarios(codigoI,fechaI,descI,cantI,precioI,montoI,iva_id)Values(?,?,?,?,?,?,?)");
                
                recibo.setString(1,txtCodigo.getText());
                recibo.setString(2,txtFecha.getText());
                recibo.setString(3,txtDescripcion.getText());
                recibo.setString(4,txtCantidad.getText());
                recibo.setString(5,txtPrecio.getText());
                recibo.setString(6,txtMonto.getText());
                recibo.setString(7,"1");
         
                int n=recibo.executeUpdate();
                MostrarTabla("");
                if(n>0){
                    JOptionPane.showMessageDialog(null,"Registro Insertado");
                    recibo.close();
                }
        } catch (SQLException ee) {
            Logger.getLogger(Inventarios.class.getName()).log(Level.SEVERE, null, ee);
            JOptionPane.showMessageDialog(null,"Error en Insertar Registro Intente de Nuevo "+ ee);
        }
        
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        MostrarTabla(txtBuscar.getText());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    
        MostrarTabla("");
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        int fila=TablaIngreso.getSelectedRow();
        if(fila>0){
                txtCodigo.setText(TablaIngreso.getValueAt(fila, 0).toString());
                txtFecha.setText(TablaIngreso.getValueAt(fila, 1).toString());
                txtDescripcion.setText(TablaIngreso.getValueAt(fila, 2).toString());
                txtCantidad.setText(TablaIngreso.getValueAt(fila, 3).toString());
                txtPrecio.setText(TablaIngreso.getValueAt(fila, 4).toString());
                txtMonto.setText(TablaIngreso.getValueAt(fila, 5).toString());
                
        }
        else{}
        JOptionPane.showMessageDialog(null, "No selecciono la fila");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     
            String sentenciaSQL="UPDATE inventarios SET fechaI=?,descI=?,cantI=?,precioI=?,montoI=? WHERE (codigoI=?)";
            
        try{
//            for (int i = 0; i < 10; i++) {
//                PreparedStatement pat= cn.prepareStatement(sentenciaSQL);
//                pat.setString(1,(TablaIngreso.getValueAt(i, 0).toString()));
//                pat.setString(2,(TablaIngreso.getValueAt(i, 1).toString()));
//                pat.setString(3,(TablaIngreso.getValueAt(i, 2).toString()));
//                pat.setString(4,(TablaIngreso.getValueAt(i, 3).toString()));
//                pat.setString(5,(TablaIngreso.getValueAt(i, 4).toString()));
//                pat.setString(6,(TablaIngreso.getValueAt(i, 5).toString()));
//                pat.executeUpdate();
//                
//                
//            }
            
            //PreparedStatement pat= cn.prepareStatement(sentenciaSQL);
            PreparedStatement pat= cn.prepareStatement("UPDATE inventarios SET fechaI='"+txtFecha.getText()+"',descI='"+txtDescripcion.getText()+"',cantI='"+txtCantidad.getText()+"',precioI='"+txtPrecio.getText()+"',montoI='"+txtMonto.getText()+"'WHERE codigoI='"+txtCodigo.getText()+"'");
              //  pat.setString(1,TablaIngreso.getValueAt(fila, 1).toString()));
//                pat.setString(2,txtFecha.getText());
//                pat.setString(3,txtDescripcion.getText());
//                pat.setString(4,txtCantidad.getText());
//                pat.setString(5,txtPrecio.getText());
//                pat.setString(6,txtMonto.getText());
                JOptionPane.showMessageDialog(null,"Modificacion exitosa");
                pat.executeUpdate();
                MostrarTabla("");
                pat.close();
               
                
        }   
        catch(Exception ex){
           System.out.print(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 
         int fila=TablaIngreso.getSelectedRow();
        String cod;
        cod=TablaIngreso.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pat= cn.prepareStatement("DELETE FROM inventarios WHERE codigoI='"+cod+"'");
            pat.executeUpdate();
            MostrarTabla("");
        } catch (SQLException ex) {
            Logger.getLogger(Inventarios.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtMonto.setText(""+sumatotal(txtCantidad.getText(),txtPrecio.getText()));
        }
        
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtMonto.setText(""+sumatotal(txtCantidad.getText(),txtPrecio.getText()));
        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void btnSalirArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirArticulosActionPerformed
  
        this.dispose();
        
    }//GEN-LAST:event_btnSalirArticulosActionPerformed
    private int sumatotal(String a, String b){
    int n1=Integer.parseInt(a);
    int n2=Integer.parseInt(b);
    int resultado=n1*n2;
    return resultado;
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
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaIngreso;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalirArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
