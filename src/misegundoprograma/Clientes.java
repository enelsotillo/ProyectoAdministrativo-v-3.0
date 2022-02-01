
package misegundoprograma;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {
MiSegundoPrograma cc=new MiSegundoPrograma();
Connection cn=cc.conexion();

    
    public Clientes() {
        initComponents();
        txtIdCliente.setVisible(false);
        setTitle("MUDULO CLIENTES");
        setLocation(200, 50);
        setIconImage(new ImageIcon(getClass().getResource("/ImagenSistema/logocarrete.jpg")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCuil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtBuscaCliente = new javax.swing.JTextField();
        btnModificarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        btnEliminarCliente = new javax.swing.JButton();
        btnSalirCliente = new javax.swing.JButton();
        btnLimpiarTextos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("Clientes");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("DNI");

        jLabel5.setText("Cuit");

        jLabel6.setText("Cuil");

        jLabel7.setText("Calle");

        jLabel8.setText("Localidad o Zona");

        jLabel9.setText("Nro");

        jLabel10.setText("Provincia");

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setText("Conectar BD");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo Cliente");

        btnModificarCliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setEnabled(false);

        btnEliminarCliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnSalirCliente.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalirCliente.setText("Salir");
        btnSalirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirClienteActionPerformed(evt);
            }
        });

        btnLimpiarTextos.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnLimpiarTextos.setText("Limpiar");
        btnLimpiarTextos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTextosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(28, 28, 28)
                            .addComponent(btnGuardarCliente)
                            .addGap(44, 44, 44)
                            .addComponent(btnModificarCliente)
                            .addGap(33, 33, 33)
                            .addComponent(btnEliminarCliente)
                            .addGap(24, 24, 24)
                            .addComponent(btnSalirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtZona)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69)
                                            .addComponent(jLabel5)
                                            .addGap(15, 15, 15)
                                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(btnBuscarCliente)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnLimpiarTextos)))))
                            .addGap(22, 22, 22))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarTextos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnEliminarCliente)
                    .addComponent(btnSalirCliente))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Limpiar cajas de textos
    public void limpiarTextos(){
    txtBuscaCliente.setText("");
    txtNombres.setText("");
    txtApellidos.setText("");
    txtDni.setText("");
    txtCuit.setText("");
    txtCuil.setText("");
    txtCalle.setText("");
    txtNro.setText("");
    txtZona.setText("");
    txtProvincia.setText("");
    txtIdCliente.setText("");
    }
    
    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        MiSegundoPrograma con=new MiSegundoPrograma();
        Connection MiSegundoPrograma= con.conexion();
        
        String nombre, apellido, dni, cuil, cuit, calle, nro, zona, provincia;
        String sql;
        
        sql= "INSERT INTO client1(BdNombres,BdApellidos,BdDc,BdCuil,BdCuit,BdCalle,BdNro,BdZona,BdProvincia)Values(?,?,?,?,?,?,?,?,?)";
        nombre=txtNombres.getText();
        apellido=txtApellidos.getText();
        dni=txtDni.getText();
        cuil=txtCuit.getText();
        cuit=txtCuil.getText();
        calle=txtCalle.getText();
        nro=txtNro.getText();
        zona=txtZona.getText();
        provincia=txtProvincia.getText();
        
        try{
            PreparedStatement consulta=MiSegundoPrograma.prepareStatement(sql);
            consulta.setString(1,nombre);
            consulta.setString(2,apellido);
            consulta.setString(3,dni);
            consulta.setString(4,cuil);
            consulta.setString(5,cuit);
            consulta.setString(6,calle);
            consulta.setString(7,nro);
            consulta.setString(8,zona);
            consulta.setString(9,provincia);
            
            int n=consulta.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null,"Cliente Guardado");
                limpiarTextos();
            }
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error Registro no Guardado "+ e);
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MiSegundoPrograma con = new MiSegundoPrograma();
                con.conexion(); 
                setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
       
    try {
        PreparedStatement ps=cn.prepareStatement("UPDATE client1 SET BdNombres=?,BdApellidos=?,BdDc=?,BdCuil=?,BdCuit=?,BdCalle=?,BdNro=?,BdZona=?,BdProvincia=? WHERE Id_client1=?");
        //ps.setString(1, txtBuscaCliente.getText());
        ps.setString(1, txtNombres.getText());
        ps.setString(2, txtApellidos.getText());
        ps.setString(3, txtDni.getText());
        ps.setString(4, txtCuit.getText());
        ps.setString(5, txtCuil.getText());
        ps.setString(6, txtCalle.getText());
        ps.setString(7, txtNro.getText());
        ps.setString(8, txtZona.getText());
        ps.setString(9, txtProvincia.getText());
        ps.setString(10, txtIdCliente.getText());
        
        int n=ps.executeUpdate();
        if(n>0){
            JOptionPane.showMessageDialog(null,"Cliente Modificado con Existo");
            limpiarTextos();
        }else{
            JOptionPane.showMessageDialog(null,"Error en Modificado Cliente");
            limpiarTextos();
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error en Modificar Cliente "+ex);
    }
        
        
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

    try {
        PreparedStatement ps=cn.prepareStatement("SELECT * FROM client1 WHERE id_client1=?");
        ResultSet rs;
        ps.setString(1,txtBuscaCliente.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        txtIdCliente.setText(rs.getString("Id_client1"));
        txtNombres.setText(rs.getString("BdNombres"));
        txtApellidos.setText(rs.getString("BdApellidos"));
        txtDni.setText(rs.getString("BdDc"));
        txtCuit.setText(rs.getString("BdCuit"));
        txtCuil.setText(rs.getString("BdCuil"));
        txtCalle.setText(rs.getString("BdCalle"));
        txtNro.setText(rs.getString("BdNro"));
        txtZona.setText(rs.getString("BdZona"));
        txtProvincia.setText(rs.getString("BdProvincia"));
        
        }else{
            JOptionPane.showMessageDialog(null,"Error no Existe Cliente");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error Base de Datos no Conexion");
    }
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        
    try {
        PreparedStatement ps=cn.prepareStatement("DELETE FROM client1 WHERE id_client1=?");
        ResultSet rs;
        ps.setInt(1,Integer.parseInt(txtIdCliente.getText()));
        int repuesta=ps.executeUpdate();
                
                
        if(repuesta>0){
        
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
            limpiarTextos();
        }else{
            JOptionPane.showMessageDialog(null,"Error en Eliminar Registro");
            limpiarTextos();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error Base de Datos no Conexion");
    }
        
                              
        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnSalirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirClienteActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSalirClienteActionPerformed

    private void btnLimpiarTextosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTextosActionPerformed
     
        limpiarTextos();
        
        
    }//GEN-LAST:event_btnLimpiarTextosActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarCliente;
    public javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnLimpiarTextos;
    public javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnSalirCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtBuscaCliente;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}
