
package misegundoprograma;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {
    MiSegundoPrograma cc=new MiSegundoPrograma();
    Connection cn=cc.conexion();
    PreparedStatement ps=null;
    ResultSet rs;
    //private String activa="";
    DefaultTableModel modelo;
    int idCodigoProveedor;
    String ComprasN[]=new String[7];
    
    public Compras() {
        initComponents();
        GeneraCodigo();
        //ActivaOrdenCompra();
        //NumerOdenCompras();
        txtFechaOrden.setText(FechaActual());
        modelo=new DefaultTableModel();
        modelo.addColumn("Nro");
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Discripcion del Productos");
        modelo.addColumn("C/U");
        modelo.addColumn("Precio de compra");
        modelo.addColumn("Monto");
        this.TableOrdenCompras.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProv = new javax.swing.JTextField();
        txtNombreProv = new javax.swing.JTextField();
        txtCuitProv = new javax.swing.JTextField();
        txtCuilProv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarProv = new javax.swing.JButton();
        btnNuevoProv = new javax.swing.JButton();
        btnGeneraOrdenCompra = new javax.swing.JButton();
        txtCodigoProductoOrden = new javax.swing.JTextField();
        txtFechaOrden = new javax.swing.JTextField();
        txtDescripcionOrden = new javax.swing.JTextField();
        txtCantidadOrden = new javax.swing.JTextField();
        txtPrecioOrden = new javax.swing.JTextField();
        txtMontoOrden = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnInsertarOrden = new javax.swing.JButton();
        txtOrdenNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableOrdenCompras = new javax.swing.JTable();
        btnBuscarProductoOrden = new javax.swing.JButton();
        btnNvoProductoOrden = new javax.swing.JButton();
        txtMontoOrdenCompra = new javax.swing.JTextField();
        txtIvaOrdenCompra = new javax.swing.JTextField();
        txtMontoIvaOrdenCompra = new javax.swing.JTextField();
        txtTotalOrdenCompras = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnProcesarOrden = new javax.swing.JButton();
        btnSalirOrdenDeCompras = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Generar Orden de Compras");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Generar Orden de Compras");

        jLabel4.setText("Cod Prov");

        jLabel5.setText("Nombre Proveedor");

        jLabel7.setText("Cuit");

        jLabel8.setText("Cuil");

        btnBuscarProv.setText("Buscar Proveedor");
        btnBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProvActionPerformed(evt);
            }
        });

        btnNuevoProv.setText("Nuevo Proveedor");

        btnGeneraOrdenCompra.setText("Generar Orden");
        btnGeneraOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraOrdenCompraActionPerformed(evt);
            }
        });

        txtCodigoProductoOrden.setToolTipText("");
        txtCodigoProductoOrden.setEnabled(false);
        txtCodigoProductoOrden.setName(""); // NOI18N
        txtCodigoProductoOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProductoOrdenKeyPressed(evt);
            }
        });

        txtFechaOrden.setEnabled(false);

        txtDescripcionOrden.setEnabled(false);

        txtCantidadOrden.setEnabled(false);

        txtPrecioOrden.setEnabled(false);
        txtPrecioOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioOrdenKeyPressed(evt);
            }
        });

        txtMontoOrden.setEnabled(false);

        jLabel6.setText("Codigo Orden Compras:");

        jLabel9.setText("Fecha");

        jLabel10.setText("Descripción del Productos");

        jLabel11.setText("Cant/Unid");

        jLabel12.setText("Precio");

        jLabel13.setText("Monto");

        btnInsertarOrden.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnInsertarOrden.setText("Insertar Renglon");
        btnInsertarOrden.setEnabled(false);
        btnInsertarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarOrdenActionPerformed(evt);
            }
        });

        txtOrdenNumero.setEditable(false);
        txtOrdenNumero.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtOrdenNumero.setEnabled(false);

        jLabel14.setText("CodProducto");

        TableOrdenCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableOrdenCompras.setEnabled(false);
        jScrollPane2.setViewportView(TableOrdenCompras);

        btnBuscarProductoOrden.setText("Buscar Producto");
        btnBuscarProductoOrden.setEnabled(false);
        btnBuscarProductoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoOrdenActionPerformed(evt);
            }
        });

        btnNvoProductoOrden.setText("Nuevo Producto");
        btnNvoProductoOrden.setEnabled(false);

        txtMontoOrdenCompra.setEnabled(false);
        txtMontoOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoOrdenCompraActionPerformed(evt);
            }
        });

        txtIvaOrdenCompra.setText("21");

        jLabel15.setText("Monto:");

        jLabel16.setText("Iva:");

        jLabel17.setText("Monto Iva:");

        jLabel18.setText("Total Pago:");

        btnProcesarOrden.setText("Procesar Orden");
        btnProcesarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarOrdenActionPerformed(evt);
            }
        });

        btnSalirOrdenDeCompras.setText("Salir");
        btnSalirOrdenDeCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirOrdenDeComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoProductoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcionOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuitProv, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGeneraOrdenCompra)
                                .addGap(41, 41, 41)
                                .addComponent(btnBuscarProductoOrden)
                                .addGap(38, 38, 38)
                                .addComponent(btnNvoProductoOrden))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel14)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCuilProv, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarProv)
                                    .addComponent(txtOrdenNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel11)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel12)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel13)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirOrdenDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProcesarOrden)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTotalOrdenCompras)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevoProv)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnInsertarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMontoOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIvaOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMontoIvaOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuitProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuilProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProv)
                    .addComponent(btnNuevoProv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneraOrdenCompra)
                    .addComponent(btnBuscarProductoOrden)
                    .addComponent(btnNvoProductoOrden)
                    .addComponent(jLabel6)
                    .addComponent(txtOrdenNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProductoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMontoOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtMontoIvaOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalOrdenCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcesarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirOrdenDeCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        txtCodigoProductoOrden.getAccessibleContext().setAccessibleDescription("Ingrese Codigo Producto y Enter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneraOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraOrdenCompraActionPerformed
       
        ActivaOrdenCompra();
                
    }//GEN-LAST:event_btnGeneraOrdenCompraActionPerformed

    private void btnBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProvActionPerformed
        
        if(CodigoProveedor()==idCodigoProveedor){
          BuscarProveedorOrden();
         System.out.println("Codigo Proveedor: "+CodigoProveedor());
         System.out.println("Codigo Proveedor: "+idCodigoProveedor);
        } if(CodigoProveedor()!=idCodigoProveedor){
            JOptionPane.showMessageDialog(null, "Proveedor no existe");
            this.dispose();
        }
    }//GEN-LAST:event_btnBuscarProvActionPerformed

    private void btnBuscarProductoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoOrdenActionPerformed
        
    // llama metodo buscar producto
        BuscarProductoOrden();
        
    }//GEN-LAST:event_btnBuscarProductoOrdenActionPerformed

    private void txtPrecioOrdenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioOrdenKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            double factor1Cantidad, factor2Precio, monto=0; 
            factor2Precio=Double.parseDouble(txtPrecioOrden.getText());
            factor1Cantidad=Double.parseDouble(txtCantidadOrden.getText());
             if(factor2Precio>0){ 
                 monto=(factor2Precio*factor1Cantidad);
                txtMontoOrden.setText(Double.toString(monto));
             }else{
                 JOptionPane.showMessageDialog(null,"Precio debe ser mayor a cero");
                 
             
        }
       
         //  JOptionPane.showMessageDialog(null,"Error ");
    }
    }//GEN-LAST:event_txtPrecioOrdenKeyPressed

    private void txtMontoOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoOrdenCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoOrdenCompraActionPerformed

    private void btnInsertarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarOrdenActionPerformed
        
        TablaCompras();
        SumaCompra();
        limpiarOdendeCompras();
    }//GEN-LAST:event_btnInsertarOrdenActionPerformed

    private void btnProcesarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarOrdenActionPerformed
        double item;
        item=Double.parseDouble(txtTotalOrdenCompras.getText());
        if(item<=1){
            JOptionPane.showMessageDialog(null,"Debe agregar compras a la Orden");
        }else{
            
        // Generar Orden de Compras
        GuardarOrdenDeCompras();
        //Control de Orden de Compras
        ControlDocumentoOrdenCompras();
        // Orden global
        orden();
        //salir de la Orden de Compra
        this.dispose();
        }
    }//GEN-LAST:event_btnProcesarOrdenActionPerformed

    private void btnSalirOrdenDeComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirOrdenDeComprasActionPerformed
        // Salir del modulo orden de Compras o pedidos
        this.dispose();
    }//GEN-LAST:event_btnSalirOrdenDeComprasActionPerformed

    private void txtCodigoProductoOrdenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoOrdenKeyPressed
        // Buscar Producto con un enter
        if(Integer.parseInt(txtCodigoProductoOrden.getText())>=1){
        BuscarProductoParaCompra();
        }else{
           JOptionPane.showMessageDialog(null,"Error Intente de nuevo");
        }
        
    }//GEN-LAST:event_txtCodigoProductoOrdenKeyPressed

    private String NumerOdenCompras(){
        String Numero_Orden_Compras="";
        String sql="SELECT MAX(id_Detalle_compras) from iddetallecompra";
        try {
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
           Numero_Orden_Compras=rs.getString(1);
       }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Numero_Orden_Compras;
    }
    
    public void GeneraCodigo(){
        String CodigoOrden="";
        CodigoOrden=NumerOdenCompras();
        if(CodigoOrden==null){
            txtOrdenNumero.setText("1");
        }else{
            int autoincremento=Integer.parseInt(CodigoOrden);
           autoincremento=autoincremento+1;
           txtOrdenNumero.setText(""+autoincremento);
           
        }
        
    }
    
    // metodo que acctiva para generar orden de compras
    private void ActivaOrdenCompra(){
        String activa="si";
        activa=JOptionPane.showInputDialog(null, "ingrese Si, para Generar Orden de Compra, para Cancelar No");
        if(activa.equalsIgnoreCase(activa)){
            txtMontoOrdenCompra.setEnabled(true);
            btnBuscarProductoOrden.setEnabled(true);
            btnNvoProductoOrden.setEnabled(true);
            txtCodigoProductoOrden.setEnabled(true);
            txtOrdenNumero.setEnabled(true);
            txtFechaOrden.setEnabled(true);
            txtDescripcionOrden.setEnabled(true);
            txtCantidadOrden.setEnabled(true);
            txtPrecioOrden.setEnabled(true);
            txtMontoOrden.setEnabled(true);
            btnInsertarOrden.setEnabled(true);
            TableOrdenCompras.setEnabled(true);
    }else{
            txtMontoOrdenCompra.setEnabled(false);
            btnBuscarProductoOrden.setEnabled(false);
            btnNvoProductoOrden.setEnabled(false);
            txtCodigoProductoOrden.setEnabled(false);
            txtOrdenNumero.setEnabled(false);
            txtFechaOrden.setEnabled(false);
            txtDescripcionOrden.setEnabled(false);
            txtCantidadOrden.setEnabled(false);
            txtPrecioOrden.setEnabled(false);
            txtMontoOrden.setEnabled(false);
            btnInsertarOrden.setEnabled(false);
            TableOrdenCompras.setEnabled(false);
        }
    }
    
    //Buscar Proveedor
    private void BuscarProveedorOrden(){
        try {
            PreparedStatement ps=cn.prepareStatement("SELECT * FROM proveedor WHERE id_proveedor=?");
            idCodigoProveedor=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Codigo del Proveedor"));
                
            ps.setInt(1,idCodigoProveedor);
            rs=ps.executeQuery();
            if(rs.next()){
                txtCodigoProv.setText(rs.getString("id_proveedor"));
                txtNombreProv.setText(rs.getString("nombre"));
                txtCuitProv.setText(rs.getString("cuit"));
                txtCuilProv.setText(rs.getString("cuil"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Proveedor no existe "+ex);
        }
  }
    //Buscar Productos para Orden de Compras
    private void BuscarProductoOrden(){
    
        try {
            PreparedStatement ps=cn.prepareStatement("SELECT * FROM inventarios WHERE codigoI=?");
            String idproducto=JOptionPane.showInputDialog(null, "Ingrese Codigo del Producto");
                
            ps.setString(1,idproducto);
            rs=ps.executeQuery();
            while(rs.next()){
                txtCodigoProductoOrden.setText(rs.getString("codigoI"));
                txtFechaOrden.setText(FechaActual());
                txtDescripcionOrden.setText(rs.getString("descI"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Producto no existe "+ex);
        }
    
    
    }
    
   public static String FechaActual(){
        Date Fecha =new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        //String fechaString=formatofecha.format(new Date());
        return formatofecha.format(Fecha);
    }
    // Insertar compra a la tabla orden de compras
    private void TablaCompras(){
        int cantidadOrden, precioTem;
        String fechatem;
        cantidadOrden=Integer.parseInt(txtCantidadOrden.getText().toString());
        precioTem=Integer.parseInt(txtPrecioOrden.getText().toString());
        if(cantidadOrden>0 || precioTem>0 ){
            ComprasN[0]=txtOrdenNumero.getText();
            ComprasN[1]=txtCodigoProductoOrden.getText();
            ComprasN[2]=txtFechaOrden.getText();
            ComprasN[3]=txtDescripcionOrden.getText();
            ComprasN[4]=txtCantidadOrden.getText();
            ComprasN[5]=txtPrecioOrden.getText();
            ComprasN[6]=txtMontoOrden.getText();
            modelo.addRow(ComprasN);
            JOptionPane.showMessageDialog(null,"Articulo Agregado a la compra");
        }
    }
    
    public void SumaCompra(){
        //recorre las filas de Jtable o tabla
        double suma=0, total=0, iva=21, totalpago, montoIva=0;
            for (int i = 0; i < TableOrdenCompras.getRowCount(); i++) {
                suma=Double.parseDouble( TableOrdenCompras.getValueAt(i,6).toString());
                total=total+suma; //acumula    
            }
            
             if(total>0){           
                 txtMontoOrdenCompra.setText(String.valueOf(total));
                txtIvaOrdenCompra.setText(String.valueOf(iva));
                montoIva=(total*iva)/100;
                txtMontoIvaOrdenCompra.setText(String.valueOf(montoIva));
                totalpago=montoIva+total;
                txtTotalOrdenCompras.setText(Double.toString(totalpago));

        }else{
            JOptionPane.showMessageDialog(null,"Error en la Orden de Compras");
        }
    }
    
    // limpiar cajas de texto para el pedido de la orden de compra
    public void limpiarOdendeCompras(){
        txtCodigoProductoOrden.setText("");
        txtDescripcionOrden.setText("");
        txtCantidadOrden.setText("");
        txtPrecioOrden.setText("");
        txtMontoOrden.setText("");
        
    }
    
    // base de datos compras detalle
    
    private void GuardarOrdenDeCompras(){
        String sqlOrdenCompras="INSERT INTO ordencompra(idCompra,producto_id,fecha_compra,descripcion_compra,cantida_compra,precio_compra,monto_compra)values(?,?,?,?,?,?,?)";
        //String sqlOrdenCompras="INSERT INTO ordencompra(proveedor_id,producto_id)value(?,?)";
        int i, idOrden, codigo_producto, cantidad_orden;
        double precio_orden, monto_orden;
        String fecha_orden, descripcion;
        try {
            
            for (i = 0; i < TableOrdenCompras.getRowCount(); i++){
            PreparedStatement ps3=cn.prepareStatement(sqlOrdenCompras);
            ps3.setInt(1,Integer.parseInt(TableOrdenCompras.getValueAt(i, 0).toString()));
            ps3.setInt(2,codigo_producto=Integer.parseInt(TableOrdenCompras.getValueAt(i, 1).toString()));
            ps3.setString(3,(TableOrdenCompras.getValueAt(i, 2).toString()));
            ps3.setString(4,(TableOrdenCompras.getValueAt(i, 3).toString()));
            ps3.setInt(5,cantidad_orden=Integer.parseInt(TableOrdenCompras.getValueAt(i, 4).toString()));
            ps3.setDouble(6,precio_orden=Double.parseDouble(TableOrdenCompras.getValueAt(i, 5).toString()));
            ps3.setDouble(7,monto_orden=Double.parseDouble(TableOrdenCompras.getValueAt(i,6).toString()));
          
            ps3.execute();
            
            JOptionPane.showMessageDialog(null, "Orden de Compras Procesada");
            
            }
        } catch (NumberFormatException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, "error en Procesar Orden " + ex);
            JOptionPane.showMessageDialog(this,"Error en Procesar Orden Revisar Formato"+ ex);
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Crea Orden de compra monto global
    private void orden(){
        try {
            int idOrdenN;
            double monto, montoiva, totalcompra;
            String sqlOrden="Insert into comprageneral(num_orden_id,proveedor_id,montocompra,montoiva,totalcompra)values(?,?,?,?,?)";
            PreparedStatement ps4=cn.prepareStatement(sqlOrden);
            ps4.setInt(1, idOrdenN=Integer.parseInt(txtOrdenNumero.getText().toString()));
            ps4.setInt(2, idOrdenN=Integer.parseInt(txtCodigoProv.getText().toString()));
            ps4.setDouble(3, monto=Double.parseDouble(txtMontoOrdenCompra.getText().toString()));
            ps4.setDouble(4, montoiva=Double.parseDouble(txtMontoIvaOrdenCompra.getText().toString()));
            ps4.setDouble(5, totalcompra=Double.parseDouble(txtTotalOrdenCompras.getText().toString()));
            ps4.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Metodo de Control de Compras 
    public void ControlDocumentoOrdenCompras(){
        try {
            String SqlControlOrdenCompras="Insert into iddetallecompra(id_Documento,nombre)values(?,?)";
            PreparedStatement ps5=cn.prepareStatement(SqlControlOrdenCompras);
            ps5.setInt(1, Integer.parseInt(txtOrdenNumero.getText().toString()));
            ps5.setString(2,txtNombreProv.getText().toString());
            
            ps5.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }

//Metodo para agregar producto en las cajas de texto
    public void BuscarProductoParaCompra(){
    try {
            PreparedStatement ps=cn.prepareStatement("SELECT * FROM inventarios WHERE codigoI=?");
            
                
            ps.setString(1,txtCodigoProductoOrden.getText());
            rs=ps.executeQuery();
            while(rs.next()){
                txtCodigoProductoOrden.getText();
                txtFechaOrden.setText(FechaActual());
                txtDescripcionOrden.setText(rs.getString("descI"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Producto no existe "+ex);
        }
    }
    
    //metodo codigo de proveedor
    private int CodigoProveedor(){
        int idCodigoProveedorTemporal=0;
        try {
            PreparedStatement ps=cn.prepareStatement("SELECT * FROM proveedor WHERE id_proveedor=?");
            ps.setInt(1,idCodigoProveedor);
            rs=ps.executeQuery();
            if(rs.next()){
                idCodigoProveedorTemporal=Integer.parseInt(rs.getString("id_proveedor").toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Proveedor no existe "+ ex);
        }
        return idCodigoProveedorTemporal;
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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableOrdenCompras;
    private javax.swing.JButton btnBuscarProductoOrden;
    private javax.swing.JButton btnBuscarProv;
    private javax.swing.JButton btnGeneraOrdenCompra;
    private javax.swing.JButton btnInsertarOrden;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnNvoProductoOrden;
    private javax.swing.JButton btnProcesarOrden;
    private javax.swing.JButton btnSalirOrdenDeCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtCantidadOrden;
    private javax.swing.JTextField txtCodigoProductoOrden;
    public javax.swing.JTextField txtCodigoProv;
    private javax.swing.JTextField txtCuilProv;
    private javax.swing.JTextField txtCuitProv;
    private javax.swing.JTextField txtDescripcionOrden;
    private javax.swing.JTextField txtFechaOrden;
    private javax.swing.JTextField txtIvaOrdenCompra;
    private javax.swing.JTextField txtMontoIvaOrdenCompra;
    public javax.swing.JTextField txtMontoOrden;
    private javax.swing.JTextField txtMontoOrdenCompra;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtOrdenNumero;
    public javax.swing.JTextField txtPrecioOrden;
    private javax.swing.JTextField txtTotalOrdenCompras;
    // End of variables declaration//GEN-END:variables
}
