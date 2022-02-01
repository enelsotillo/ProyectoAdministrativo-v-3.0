
package misegundoprograma;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Proveedor extends javax.swing.JFrame {
    MiSegundoPrograma cc =new MiSegundoPrograma();
    Connection cn=cc.conexion();
    int codigo_proveedor;
    String datos[]=new String[12];
    
    public Proveedor() {
        initComponents();
        txtId.setVisible(false);
    }

    public void limpiar(){
                txt_id_proveedor.setText("");
                txtProveedor.setText("");
                txtCuit.setText("");
                txtCuil.setText("");
                txtDireccion.setText("");
                txtNro.setText("");
                txtZona.setText("");
                txtProvincia.setText("");
                txtPais.setText("");
                txtTlf1.setText("");
                txtTlf2.setText("");
                txtCorreo.setText("");
                txtBuscarIdProveedor.setText("");
                txtId.setText("");
                
                
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCuil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTlf1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTlf2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalirProveedor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_id_proveedor = new javax.swing.JTextField();
        txtBuscarIdProveedor = new javax.swing.JTextField();
        btnBuscarIdProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Proveedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Nombre de Empresa:");

        txtProveedor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Cuit:");

        txtCuit.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Cuil:");

        txtCuil.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Direccion:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        txtNro.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Nro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Zona:");

        txtZona.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Provincia:");

        txtProvincia.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Pais:");

        txtPais.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Telefono:");

        txtTlf1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Telefono 2:");

        txtTlf2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSalirProveedor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSalirProveedor.setText("Salir");
        btnSalirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProveedorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Codigo:");

        txt_id_proveedor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        txtBuscarIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarIdProveedorActionPerformed(evt);
            }
        });

        btnBuscarIdProveedor.setText("Ingrese Codigo del Prov a Buscar");
        btnBuscarIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdProveedorActionPerformed(evt);
            }
        });

        btnModificarProveedor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnModificarProveedor.setText("Modificar");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel10))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel6))
                                                .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTlf2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtPais))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txtCorreo)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnConsultar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModificarProveedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminarProveedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_id_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(txtBuscarIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btnBuscarIdProveedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_id_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTlf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTlf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalirProveedor)
                    .addComponent(btnConsultar)
                    .addComponent(btnModificarProveedor)
                    .addComponent(btnEliminarProveedor)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdProveedor))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    
      
      String idprov, proveedor, cuit, cuil,dir,nro,zona, provincia, pais, tlf1, tlf2,correo; 
            try {
                PreparedStatement recibo= cn.prepareStatement("INSERT INTO proveedor(id_proveedor,nombre,cuit,cuil,dir,nro,zona,prov,paisP,tlf1,tlf2,correoP)Values(?,?,?,?,?,?,?,?,?,?,?,?)");
                
                recibo.setString(1, txt_id_proveedor.getText());
                recibo.setString(2, txtProveedor.getText());
                recibo.setString(3, txtCuit.getText());
                recibo.setString(4, txtCuil.getText());
                recibo.setString(5, txtDireccion.getText());
                recibo.setString(6, txtNro.getText());
                recibo.setString(7, txtZona.getText());
                recibo.setString(8, txtProvincia.getText());
                recibo.setString(9, txtPais.getText());
                recibo.setString(10, txtTlf1.getText());
                recibo.setString(11, txtTlf2.getText());
                recibo.setString(12, txtCorreo.getText());
                
                int n=recibo.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    limpiar();
                    recibo.close();
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Erro en Registros Intente de Nuevo " + ex);
            }
        
    
       
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        tablaProveedor lista = new tablaProveedor();
        lista.setVisible(true);
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProveedorActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnSalirProveedorActionPerformed

    private void btnBuscarIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdProveedorActionPerformed

        try {
            PreparedStatement ps=cn.prepareStatement("select * from proveedor where id_proveedor=?"); // donde se guarda el selec
            ResultSet rs; // resultado recibido del selec
            ps.setString(1, txtBuscarIdProveedor.getText());
            rs=ps.executeQuery();
            
            if(rs.next()){
                
            
                txt_id_proveedor.setText((String)rs.getObject("id_proveedor"));
                txtProveedor.setText((String) rs.getObject("nombre"));
                txtCuit.setText((String) rs.getObject("cuit"));
                txtCuil.setText((String) rs.getObject("cuil"));
                txtDireccion.setText((String) rs.getObject("dir"));
                txtNro.setText((String) rs.getObject("nro"));
                txtZona.setText((String) rs.getObject("zona"));
                txtProvincia.setText((String) rs.getObject("prov"));
                txtPais.setText((String) rs.getObject("paisP"));
                txtTlf1.setText((String) rs.getObject("tlf1"));
                txtTlf2.setText((String) rs.getObject("tlf2"));
                txtCorreo.setText((String) rs.getObject("correoP"));
                txtId.setText((String)rs.getString("id_proveedor"));
                
                
            }else{
              JOptionPane.showMessageDialog(null,"Proveedor no Existe intente de nuevo");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en Base de Datos "+ ex);
        }
        
    }//GEN-LAST:event_btnBuscarIdProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
                    ResultSet rs;
                try {
                PreparedStatement ps=cn.prepareStatement("UPDATE proveedor SET nombre=?,cuit=?,cuil=?,dir=?,nro=?,zona=?,prov=?,paisP=?,tlf1=?,tlf2=?,correoP=? WHERE id_proveedor=?"); // donde se guarda el selec
                //ps.setString(1,txt_id_proveedor.getText());
                ps.setString(1,txtProveedor.getText());
                ps.setString(2,txtCuit.getText());
                ps.setString(3,txtCuil.getText());
                ps.setString(4,txtDireccion.getText());
                ps.setString(5,txtNro.getText());
                ps.setString(6,txtZona.getText());
                ps.setString(7,txtProvincia.getText());
                ps.setString(8,txtPais.getText());
                ps.setString(9,txtTlf1.getText());
                ps.setString(10,txtTlf2.getText());
                ps.setString(11,txtCorreo.getText());
                ps.setString(12,txtId.getText());
                //ps.setString(14,txtBuscarIdProveedor.getText());
                
               int res=ps.executeUpdate();
           
                 if(res>0){
                JOptionPane.showMessageDialog(null,"Restro Modificado");
                limpiar();
                   
            }else{
              JOptionPane.showMessageDialog(null,"Error en Modificar");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en Base de Datos "+ ex);
        }
        
                                                        

    
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void txtBuscarIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
       
        try {
            PreparedStatement psElimina=cn.prepareStatement("DELETE FROM proveedor WHERE id_proveedor=?");
            psElimina.setString(1,txtId.getText());
            int n=psElimina.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
            limpiar();
            }else{
            JOptionPane.showMessageDialog(null,"Error en Eliminar Registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        limpiar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarIdProveedor;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnSalirProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtBuscarIdProveedor;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtCuil;
    public static javax.swing.JTextField txtCuit;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNro;
    public static javax.swing.JTextField txtPais;
    public static javax.swing.JTextField txtProveedor;
    public static javax.swing.JTextField txtProvincia;
    public static javax.swing.JTextField txtTlf1;
    public static javax.swing.JTextField txtTlf2;
    public static javax.swing.JTextField txtZona;
    public static javax.swing.JTextField txt_id_proveedor;
    // End of variables declaration//GEN-END:variables

   
}
