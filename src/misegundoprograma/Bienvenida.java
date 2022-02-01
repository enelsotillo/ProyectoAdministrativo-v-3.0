
package misegundoprograma;

import javax.swing.ImageIcon;

public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ImagenSistema/logocarrete.jpg")).getImage());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuPricipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Nvo_Cliente = new javax.swing.JMenuItem();
        jMenuItem2_Nvo_Proveedor = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8_Salir = new javax.swing.JMenuItem();
        ModuloArticulos = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuModuloCliente = new javax.swing.JMenu();
        ModuloCliente = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MuduloProveedor = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        ModuloVentas = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO AL PROGRAMA INTEGRAL ADMINISTRATIVO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(114, 114, 114))
        );

        jMenu1.setText("Archivo");

        jMenuItem_Nvo_Cliente.setText("Nuevo Cliente");
        jMenuItem_Nvo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Nvo_ClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Nvo_Cliente);

        jMenuItem2_Nvo_Proveedor.setText("Nuevo Proveedor");
        jMenuItem2_Nvo_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_Nvo_ProveedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_Nvo_Proveedor);

        jMenuItem3.setText("Nuevo Articulo");
        jMenu1.add(jMenuItem3);

        jMenuItem12.setText("Nueva Ventas");
        jMenu1.add(jMenuItem12);

        jMenuItem9.setText("Nueva Facturacion");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Nueva Compras");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Nuevo Servicios");
        jMenu1.add(jMenuItem11);

        jMenuItem4.setText("Nuevo Impuesto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Nuevo Usuario");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Impresion");
        jMenu1.add(jMenuItem6);

        jMenuItem8_Salir.setText("Salir");
        jMenuItem8_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8_Salir);

        MenuPricipal.add(jMenu1);

        ModuloArticulos.setText("Articulos");

        jMenuItem29.setText("Modulo Articulos");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        ModuloArticulos.add(jMenuItem29);

        jMenuItem31.setText("jMenuItem31");
        ModuloArticulos.add(jMenuItem31);

        jMenuItem32.setText("jMenuItem32");
        ModuloArticulos.add(jMenuItem32);

        jMenuItem33.setText("jMenuItem33");
        ModuloArticulos.add(jMenuItem33);

        MenuPricipal.add(ModuloArticulos);

        jMenuModuloCliente.setText("Clientes");

        ModuloCliente.setText("Modulo Clientes");
        ModuloCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuloClienteActionPerformed(evt);
            }
        });
        jMenuModuloCliente.add(ModuloCliente);

        jMenuItem14.setText("Modificar Clientes");
        jMenuModuloCliente.add(jMenuItem14);

        jMenuItem15.setText("Consultar Clientes");
        jMenuModuloCliente.add(jMenuItem15);

        jMenuItem16.setText("Eliminar Clientes");
        jMenuModuloCliente.add(jMenuItem16);

        MenuPricipal.add(jMenuModuloCliente);

        jMenu3.setText("Proveedores");

        MuduloProveedor.setText("Modulo Proveedor");
        MuduloProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuduloProveedorActionPerformed(evt);
            }
        });
        jMenu3.add(MuduloProveedor);

        jMenuItem18.setText("Modificar Proveedor");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuItem19.setText("Consultar Proveedor");
        jMenu3.add(jMenuItem19);

        jMenuItem20.setText("Eliminar Proveedor");
        jMenu3.add(jMenuItem20);

        MenuPricipal.add(jMenu3);

        ModuloVentas.setText("Ventas");

        jMenuItem25.setText("Modulo Ventas");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        ModuloVentas.add(jMenuItem25);

        jMenuItem26.setText("jMenuItem26");
        ModuloVentas.add(jMenuItem26);

        jMenuItem27.setText("jMenuItem27");
        ModuloVentas.add(jMenuItem27);

        jMenuItem28.setText("jMenuItem28");
        ModuloVentas.add(jMenuItem28);

        MenuPricipal.add(ModuloVentas);

        jMenu7.setText("Compras");

        jMenuItem34.setText("Orden Compras");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem34);

        jMenuItem35.setText("Recepción de Producto o Materiales");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem35);

        jMenuItem36.setText("jMenuItem36");
        jMenu7.add(jMenuItem36);

        jMenuItem37.setText("jMenuItem37");
        jMenu7.add(jMenuItem37);

        jMenuItem38.setText("jMenuItem38");
        jMenu7.add(jMenuItem38);

        MenuPricipal.add(jMenu7);

        jMenu8.setText("Contabilidad");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem39.setText("Registrar Facturas");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem39);

        jMenuItem40.setText("Registrara Pagos");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem40);

        jMenuItem41.setText("Tesoreria");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem41);

        jMenuItem42.setText("jMenuItem42");
        jMenu8.add(jMenuItem42);

        MenuPricipal.add(jMenu8);

        jMenu9.setText("Servicios");

        jMenuItem43.setText("jMenuItem43");
        jMenu9.add(jMenuItem43);

        jMenuItem44.setText("jMenuItem44");
        jMenu9.add(jMenuItem44);

        jMenuItem45.setText("jMenuItem45");
        jMenu9.add(jMenuItem45);

        jMenuItem46.setText("jMenuItem46");
        jMenu9.add(jMenuItem46);

        MenuPricipal.add(jMenu9);

        jMenu10.setText("Impuestos");

        jMenuItem47.setText("jMenuItem47");
        jMenu10.add(jMenuItem47);

        jMenuItem48.setText("jMenuItem48");
        jMenu10.add(jMenuItem48);

        jMenuItem49.setText("jMenuItem49");
        jMenu10.add(jMenuItem49);

        jMenuItem50.setText("jMenuItem50");
        jMenu10.add(jMenuItem50);

        MenuPricipal.add(jMenu10);

        jMenu11.setText("Usuarios");

        jMenuItem51.setText("jMenuItem51");
        jMenu11.add(jMenuItem51);

        jMenuItem52.setText("jMenuItem52");
        jMenu11.add(jMenuItem52);

        jMenuItem53.setText("jMenuItem53");
        jMenu11.add(jMenuItem53);

        jMenuItem54.setText("jMenuItem54");
        jMenu11.add(jMenuItem54);

        MenuPricipal.add(jMenu11);

        setJMenuBar(MenuPricipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jMenuItem2_Nvo_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_Nvo_ProveedorActionPerformed
        
        Proveedor abrirMenuProveedor=new Proveedor();
        abrirMenuProveedor.setVisible(true);
        abrirMenuProveedor.btnConsultar.setEnabled(true);
        abrirMenuProveedor.txtBuscarIdProveedor.setEnabled(false);
        abrirMenuProveedor.btnBuscarIdProveedor.setEnabled(false);
        abrirMenuProveedor.btnModificarProveedor.setEnabled(false);
        abrirMenuProveedor.btnEliminarProveedor.setEnabled(false);
        
    }//GEN-LAST:event_jMenuItem2_Nvo_ProveedorActionPerformed

    private void jMenuItem8_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem8_SalirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem_Nvo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Nvo_ClienteActionPerformed
       Clientes abrirMenuCargar=new Clientes();
       abrirMenuCargar.setVisible(true);
       abrirMenuCargar.btnModificarCliente.setEnabled(false);
       abrirMenuCargar.btnBuscarCliente.setEnabled(false);
       abrirMenuCargar.txtBuscaCliente.setEnabled(false);
       abrirMenuCargar.btnEliminarCliente.setEnabled(false);
       
       abrirMenuCargar.setTitle("REGISTRAR NUEVO CLIENTE");
    }//GEN-LAST:event_jMenuItem_Nvo_ClienteActionPerformed

    private void ModuloClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModuloClienteActionPerformed

        Clientes abrirMenuGargar=new Clientes();
       abrirMenuGargar.setVisible(true);
       
    }//GEN-LAST:event_ModuloClienteActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        Inventarios abrirModuloArticulos =new Inventarios();
        abrirModuloArticulos.setVisible(true);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        Ventas abrirModuloVentas =new Ventas();
        abrirModuloVentas.setVisible(true);
        abrirModuloVentas.setLocation(100, 0);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void MuduloProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuduloProveedorActionPerformed

        Proveedor abrirModuloProveedor=new Proveedor();
        abrirModuloProveedor.setVisible(true);
        
    }//GEN-LAST:event_MuduloProveedorActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
    
        Compras abrirCompras=new Compras();
       abrirCompras.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        
        Recepcion RecepcionProMat=new Recepcion();
        RecepcionProMat.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        RegistrarFactura abrirModuloRegistroFactura =new RegistrarFactura();
        abrirModuloRegistroFactura.setVisible(true);
        abrirModuloRegistroFactura.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        Pagos abrirModuloPagos =new Pagos();
        abrirModuloPagos.setVisible(true);
        abrirModuloPagos.setLocation(60, 50);
        
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
        Disponible Tesoreria = new Disponible();
        Tesoreria.setVisible(true);
         Tesoreria.setLocation(60, 50);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
       
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuBar MenuPricipal;
    private javax.swing.JMenu ModuloArticulos;
    private javax.swing.JMenuItem ModuloCliente;
    private javax.swing.JMenu ModuloVentas;
    private javax.swing.JMenuItem MuduloProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem2_Nvo_Proveedor;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8_Salir;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem_Nvo_Cliente;
    private javax.swing.JMenu jMenuModuloCliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
