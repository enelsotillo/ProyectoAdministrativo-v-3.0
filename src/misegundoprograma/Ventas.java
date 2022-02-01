
package misegundoprograma;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public final class Ventas extends javax.swing.JFrame {
    MiSegundoPrograma cc=new MiSegundoPrograma();
    Connection cn=cc.conexion();
    String datosVenta[]=new String[5];
    DefaultTableModel modelo;
     public int repuesta;
     public int spin;
     public int cantidad;
    public Ventas() {
        initComponents();
        generaSerie();
        optenerIdDetalleVenta();
        //txtNro.setText(optenerIdDetalleVenta());
        txtTemDNI.setEnabled(false);
        ImageIcon Imagen5=new ImageIcon("src/ImagenSistema/logocarrete.jpg");
        Icon Icono5=new ImageIcon(Imagen5.getImage().getScaledInstance(imagenLogo.getWidth(), imagenLogo.getHeight(), Image.SCALE_DEFAULT));
        imagenLogo.setIcon(Icono5);
        this.repaint();        
        ImageIcon Imagen1=new ImageIcon("src/ImagenSistema/DineroEfectivo.jpg");
        Icon Icono1=new ImageIcon(Imagen1.getImage().getScaledInstance(btnEfectivo.getWidth(), btnEfectivo.getHeight(), Image.SCALE_DEFAULT));
        btnEfectivo.setIcon(Icono1);
        this.repaint();
        ImageIcon Imagen2=new ImageIcon("src/ImagenSistema/TarjetaDeDebito.jpg");
        Icon Icono2=new ImageIcon(Imagen2.getImage().getScaledInstance(btnDebito.getWidth(), btnDebito.getHeight(), Image.SCALE_DEFAULT));
        btnDebito.setIcon(Icono2);
        this.repaint();
        ImageIcon Imagen3=new ImageIcon("src/ImagenSistema/TarjetaMasterCard.png");
        Icon Icono3=new ImageIcon(Imagen3.getImage().getScaledInstance(btnVisaCridito.getWidth(), btnVisaCridito.getHeight(), Image.SCALE_DEFAULT));
        btnVisaCridito.setIcon(Icono3);
        this.repaint();
        ImageIcon Imagen4=new ImageIcon("src/ImagenSistema/TarjetaVisa.png");
        Icon Icono4=new ImageIcon(Imagen4.getImage().getScaledInstance(btnMasterCardCridito.getWidth(), btnMasterCardCridito.getHeight(), Image.SCALE_DEFAULT));
        btnMasterCardCridito.setIcon(Icono4);
        this.repaint();
        modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Discripcion del Productos");
        modelo.addColumn("Cant/Unidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Monto");
        this.TablaDeFacturacion.setModel(modelo);
        eqtFecha.setText(FechaActual());
        btnPagarFactura.setEnabled(false);
        // Ajustar la imagen en el boton
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeFacturacion = new javax.swing.JTable();
        btnInsertarRenglonFacturacion = new javax.swing.JButton();
        btnPagarFactura = new javax.swing.JButton();
        txtMontoFactura = new javax.swing.JTextField();
        txtEfectivoRecibido = new javax.swing.JTextField();
        txtTotalFacturado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVueltoPorCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        imagenLogo = new javax.swing.JLabel();
        txtStopProducto = new javax.swing.JTextField();
        txtCodigoInsetar = new javax.swing.JTextField();
        txtProductoInsetar = new javax.swing.JTextField();
        SpinnerCantidadInsertar = new javax.swing.JSpinner();
        txtPrecioInsertar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSubTotalVenta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        eqtFecha = new javax.swing.JLabel();
        btnEfectivo = new javax.swing.JButton();
        btnDebito = new javax.swing.JButton();
        btnVisaCridito = new javax.swing.JButton();
        btnMasterCardCridito = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnOtroMedioPago = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        lblNroRegistro = new javax.swing.JLabel();
        txtTemDNI = new javax.swing.JTextField();
        btnEliminarFilas = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnSalirDeVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ventas");

        jLabel2.setText("Nombre del Cliente");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Reg. Nvo. Clientes");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Productos");

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Productos");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        TablaDeFacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDeFacturacion);

        btnInsertarRenglonFacturacion.setText("Insertar Producto");
        btnInsertarRenglonFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarRenglonFacturacionActionPerformed(evt);
            }
        });

        btnPagarFactura.setText("Generar Venta");
        btnPagarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarFacturaActionPerformed(evt);
            }
        });

        txtMontoFactura.setEditable(false);
        txtMontoFactura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMontoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoFacturaActionPerformed(evt);
            }
        });

        txtEfectivoRecibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEfectivoRecibidoKeyPressed(evt);
            }
        });

        txtTotalFacturado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setText("Monto:");

        jLabel4.setText("Dinero.Recibido:");

        jLabel6.setText("Total Pago:");

        jLabel7.setText("Vuelto:");

        imagenLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenSistema/logocarrete.JPG"))); // NOI18N

        txtStopProducto.setEnabled(false);

        jLabel8.setText("Codigo");

        jLabel9.setText("Descripcion del Producto");

        jLabel10.setText("Cant/Unid");

        jLabel11.setText("Precio");

        jLabel12.setText("IVA:");

        txtDescuento.setText("0");

        jLabel13.setText("Desc.:");

        txtPorcentaje.setText("0");
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyPressed(evt);
            }
        });

        jLabel14.setText("%");

        jLabel15.setText("SubTotal:");

        jLabel16.setText("Fecha:");

        btnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenSistema/DineroEfectivo.jpg"))); // NOI18N
        btnEfectivo.setText("Efectivo");
        btnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectivoActionPerformed(evt);
            }
        });

        btnDebito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenSistema/TarjetaDeDebito.jpg"))); // NOI18N
        btnDebito.setText("Tarjetas de Debito");

        btnVisaCridito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenSistema/TarjetaVisa.png"))); // NOI18N
        btnVisaCridito.setText("Tarjeta Visa");
        btnVisaCridito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaCriditoActionPerformed(evt);
            }
        });

        btnMasterCardCridito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenSistema/TarjetaMasterCard.png"))); // NOI18N
        btnMasterCardCridito.setText("Tarjeta MasterCard");

        jLabel17.setText("Efectivo");

        jLabel18.setText("Tarjeta de Debito");

        jLabel19.setText("Tarjeta de Credito");

        jLabel20.setText("Tarjeta de Credito");

        btnOtroMedioPago.setText("Otro Medio de Pago");
        btnOtroMedioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtroMedioPagoActionPerformed(evt);
            }
        });

        jLabel21.setText("Nro. Registro:");

        lblNroRegistro.setText(" ");

        txtTemDNI.setEnabled(false);
        txtTemDNI.setOpaque(false);

        btnEliminarFilas.setText("Eliminar Filas de la Venta");
        btnEliminarFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilasActionPerformed(evt);
            }
        });

        jLabel22.setText("Stop:");

        btnSalirDeVentas.setText("Salir");
        btnSalirDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDeVentasActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(536, 536, 536)
                                        .addComponent(jLabel10)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel11))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel17)
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel18)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnVisaCridito, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(btnMasterCardCridito, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOtroMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel19))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnEliminarFilas)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtMontoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalirDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPagarFactura))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSubTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEfectivoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVueltoPorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalFacturado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoInsetar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtProductoInsetar, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SpinnerCantidadInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(txtPrecioInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInsertarRenglonFacturacion)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)
                                .addComponent(jLabel1)
                                .addGap(263, 263, 263)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarProducto)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStopProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNuevoCliente)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(eqtFecha)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTemDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eqtFecha)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btnNuevoCliente)
                    .addComponent(txtTemDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(txtStopProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblNroRegistro))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoInsetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductoInsetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerCantidadInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarRenglonFacturacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPorcentaje)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEfectivoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVueltoPorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalFacturado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPagarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirDeVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarFilas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVisaCridito, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnOtroMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMasterCardCridito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)))))
        );

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

    public static String FechaActual(){
        Date Fecha =new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("hh:mm:ss dd/MM/YYYY");
        
        return formatofecha.format(Fecha);
    }
    
    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        Clientes abrirCliente=new Clientes();
        abrirCliente.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
    try {
        PreparedStatement ps=cn.prepareStatement("SELECT * FROM client1 WHERE BdDc=?");
        ResultSet rs;
        String num1=JOptionPane.showInputDialog(null, "Ingrese DNI del Cliente");
        //int DNI = Integer.parseUnsignedInt(num1);
        ps.setString(1,num1);
        rs=ps.executeQuery();
        if(rs.next()){
           String DNI=rs.getString("BdDc");
           String Vacio=" ";
           String Cadena1=rs.getString("BdNombres");
           String Cadena2=rs.getString("BdApellidos");
        txtNombreCliente.setText(Cadena1+Vacio+Cadena2);
        txtTemDNI.setText(DNI);
        
        
        }else{
            JOptionPane.showMessageDialog(null,"Error no Existe Cliente");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error Base de Datos no Conexion");
    }
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        
         
    try {
        PreparedStatement ps=cn.prepareStatement("SELECT * FROM inventarios WHERE codigoI=?");
        ResultSet rs;
        //int cantidadProducto;
        //String num1=JOptionPane.showInputDialog(null, "Ingrese DNI del Cliente");
        //int DNI = Integer.parseUnsignedInt(num1);
        ps.setString(1,txtCodigoProducto.getText());
        //ps.setString(1,num1);
        rs=ps.executeQuery();
        if(rs.next()){
            
            txtCodigoInsetar.setText(rs.getString("codigoI"));
            txtProductoInsetar.setText(rs.getString("descI"));
            txtPrecioInsertar.setText(rs.getString("precioI"));
        
            txtStopProducto.setText(rs.getString("cantI"));
            cantidad= Integer.parseInt(txtStopProducto.getText());
                if(cantidad<=1){
                JOptionPane.showMessageDialog(null,"Revisa Producto Agotado Stop");
                }
        
        }else{
            JOptionPane.showMessageDialog(null,"Error no Existe Producto");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error Base de Datos no Conexion");
    }   
        
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    // metodo que check el Stop de producto y compara con la compra
    public void VerificaStop(){
    
        spin=Integer.parseInt(datosVenta[1]=SpinnerCantidadInsertar.getValue().toString());
         cantidad= Integer.parseInt(txtStopProducto.getText());
        if(spin>cantidad && cantidad>0){
            JOptionPane.showMessageDialog(null,"Compra supera Stock del Producto Revisa");
        }else{
            double valor1, valor2;
            double monto=0, aux=0;
            valor2=Double.parseDouble(txtPrecioInsertar.getText());
            spin=Integer.parseInt(SpinnerCantidadInsertar.getValue().toString());
            monto=spin*valor2;
            datosVenta[0]=txtCodigoInsetar.getText();
            datosVenta[1]=txtProductoInsetar.getText();
            datosVenta[2]=SpinnerCantidadInsertar.getValue().toString();
            datosVenta[3]=txtPrecioInsertar.getText();
            datosVenta[4]=String.valueOf(monto);
            modelo.addRow(datosVenta);
            JOptionPane.showMessageDialog(null,"Articulo Agregado a la compra");
       CalcularVenta();              
        }
    }
    public String optenerIdDetalleVenta(){
        String idDetalleVenta="";
        PreparedStatement ps1=null;
        ResultSet rs;
        try {
            String sqlDetalleVenta="SELECT MAX(id_ventas) FROM ventas";
            ps1=cn.prepareStatement(sqlDetalleVenta);
            rs=ps1.executeQuery();
            while(rs.next()){
                idDetalleVenta=rs.getString(1);   
                
            }
                    
        } catch (SQLException ex){
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return idDetalleVenta;
    }
    
    private void generarDetallaVenta(){
        String sql="INSERT INTO ventas (id_producto,producto,cantUnida,precio,monto)values(?,?,?,?,?)";
        int producto_id, cant, i;
        String producto;
        double precio, monto;
                
        try {
            for (i = 0; i < TablaDeFacturacion.getRowCount(); i++) {                
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs;
            ps.setInt(1, producto_id=Integer.parseInt(TablaDeFacturacion.getValueAt(i, 0).toString()));
            ps.setString(2, producto=TablaDeFacturacion.getValueAt(i, 1).toString());
            ps.setInt(3, cant=Integer.parseInt(TablaDeFacturacion.getValueAt(i, 2).toString()));
            ps.setDouble(4, precio=Double.parseDouble(TablaDeFacturacion.getValueAt(i, 3).toString()));
            ps.setDouble(5, monto=Double.parseDouble(TablaDeFacturacion.getValueAt(i, 4).toString()));
            ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnInsertarRenglonFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarRenglonFacturacionActionPerformed
       
        VerificaStop();
        
    }//GEN-LAST:event_btnInsertarRenglonFacturacionActionPerformed

    private void txtEfectivoRecibidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoRecibidoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            double Factor2=0;
            Factor2=Double.parseDouble(txtPorcentaje.getText());
             if(Factor2>0){                        
                 CacularVueltoXDescuento();
             }else{
                 CalcularVuelto();
             }
        }
    }//GEN-LAST:event_txtEfectivoRecibidoKeyPressed
// generar la venta
    public void generaSerie(){
        //Ventas n=new Ventas();
        String idventa;
        idventa=optenerIdDetalleVenta().toString();
        if(idventa==null){
            lblNroRegistro.setText("01");
        }else{
            int autoincremento=Integer.parseInt(idventa);
           autoincremento=autoincremento+1;
           lblNroRegistro.setText(""+autoincremento);
           
        }
        
    }
    public void generarVenta(){
        //Impuestos valorImpuesto=new Impuestos();
        //int id_iva=valorImpuesto.ObtenerImpuestoiva();
        int id_iva=1;
        String sqlVenta="INSERT INTO generarventa(detalleventa_id,montocompra,porcentaje,descuento,subtotal,ivamonto,totalpago,iva_id,DNI)values(?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=cn.prepareStatement(sqlVenta);
            ResultSet rs;
            ps.setInt(1,Integer.parseInt(lblNroRegistro.getText()));
            ps.setDouble(2,Double.parseDouble(txtMontoFactura.getText()));
            ps.setInt(3,Integer.parseInt(txtPorcentaje.getText()));
            ps.setDouble(4,Double.parseDouble(txtDescuento.getText()));
            ps.setDouble(5,Double.parseDouble(txtSubTotalVenta.getText()));
            ps.setDouble(6, Double.parseDouble(txtIVA.getText()));
            ps.setDouble(7,Double.parseDouble(txtTotalFacturado.getText()));
            ps.setInt(8,id_iva);
            ps.setString(9,txtTemDNI.getText().toString());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnPagarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarFacturaActionPerformed
        //int check=0;
        //check=Integer.parseInt(txtTotalFacturado.getText());
        if(txtTotalFacturado.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Agregue Productos a la compra");
        }else{
            generarVenta();
            generarDetallaVenta();
            actualizarStop();
            JOptionPane.showMessageDialog(null,"Venta Exitosa");
            LimpiarTodosJtable();
            limpiarCajas();
            this.dispose();
        }
        
    }//GEN-LAST:event_btnPagarFacturaActionPerformed

    private void txtPorcentajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyPressed
    DecimalFormat formatox=new DecimalFormat("#.00");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        double factura2=0, Desc=0,Factor=0, subtotal=0.00d, total=0, iva=0;
        double DineroRecibido=0, DineroDeVuelto=0.00d, reglon3=0;
        //recorre las filas de Jtable o tabla
            for (int i = 0; i < TablaDeFacturacion.getRowCount(); i++) {
                reglon3=Double.parseDouble( TablaDeFacturacion.getValueAt(i, 4).toString());
                factura2=factura2+reglon3; //acumula    
            }
            Factor=Double.parseDouble(txtPorcentaje.getText());
             if(Factor>0){                        
                Desc=((factura2*Factor)/100);
                formatox.format(Desc);
                txtDescuento.setText(String.valueOf(Desc));
                subtotal=(factura2-Desc);
                formatox.format(subtotal);
                txtSubTotalVenta.setText(String.valueOf(subtotal));
                iva=(subtotal*0.21);
                formatox.format(iva);
                txtIVA.setText(String.valueOf(iva));
                total=(subtotal+iva);
                formatox.format(total);
                txtTotalFacturado.setText(String.valueOf(total));
                formatox.format(txtEfectivoRecibido.getText());
                
                DineroDeVuelto=(DineroRecibido-(subtotal*1.21));
                formatox.format(DineroDeVuelto);
                txtVueltoPorCompra.setText(String.valueOf(formatox.format(DineroDeVuelto)));
                

        }else{
            JOptionPane.showMessageDialog(null,"No hay Descuento");
        }
        }
    }//GEN-LAST:event_txtPorcentajeKeyPressed

    private void btnVisaCriditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaCriditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaCriditoActionPerformed

    private void btnOtroMedioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtroMedioPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOtroMedioPagoActionPerformed

    private void txtMontoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoFacturaActionPerformed

    private void btnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectivoActionPerformed
        String dinero="si";
        dinero=JOptionPane.showInputDialog(null, "Efectivo Si, para Cancelar No");
        if(dinero.equalsIgnoreCase(dinero)){
            btnPagarFactura.setEnabled(true);
        }else{
            btnPagarFactura.setEnabled(false);
        }
    }//GEN-LAST:event_btnEfectivoActionPerformed

    private void btnEliminarFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilasActionPerformed
        //Eliminar filas de compra
        EliminarFilaJtable();
    }//GEN-LAST:event_btnEliminarFilasActionPerformed

    private void btnSalirDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDeVentasActionPerformed
        // Salir del Modulo de Ventas
        this.dispose();
        
    }//GEN-LAST:event_btnSalirDeVentasActionPerformed
    
    
        // metodo calcular venta o facturación
    private void CalcularVenta(){
         double suma=0, iva2=0,total2=0;
         DecimalFormat formatox2=new DecimalFormat("#.00");
        //double suma=0; //acumulador total columna
        //recorre las filas de Jtable o tabla
        for (int i = 0; i < TablaDeFacturacion.getRowCount(); i++) {
          double reglon;
          reglon=Double.parseDouble( TablaDeFacturacion.getValueAt(i, 4).toString());
          suma=suma+reglon; //acumula
          formatox2.format(suma);
        }
        txtMontoFactura.setText(String.valueOf(suma));
        txtSubTotalVenta.setText(String.valueOf(suma));
        iva2=(suma*0.21);
        formatox2.format(iva2);
        txtIVA.setText(String.valueOf(iva2));
        total2=(suma+iva2);
        formatox2.format(total2);
        txtTotalFacturado.setText(String.valueOf(total2));
        
        
    }
    
    public void CalcularVuelto(){
        double factura=0,SubTotalV=0, reglon2;
        DecimalFormat formatox3=new DecimalFormat("#.00");
        double DineroRecibido=0, DineroDeVuelto=0;
        //recorre las filas de Jtable o tabla
        for (int i = 0; i < TablaDeFacturacion.getRowCount(); i++) {
          reglon2=Double.parseDouble( TablaDeFacturacion.getValueAt(i, 4).toString());
            factura=factura+reglon2; //acumula
            formatox3.format(factura);
        }
                
        DineroRecibido=Double.parseDouble(txtEfectivoRecibido.getText());
        SubTotalV=(factura*1.21);
        formatox3.format(SubTotalV);
        txtTotalFacturado.setText(String.valueOf(SubTotalV));
        DineroDeVuelto=(DineroRecibido-(SubTotalV));
        formatox3.format(DineroDeVuelto);
        txtVueltoPorCompra.setText(String.valueOf(DineroDeVuelto));
         }

    public void CacularVueltoXDescuento(){
        
        double factura2=0, Desc=0,Factor=0, subtotal=0;
        double DineroRecibido=0, DineroDeVuelto=0, reglon3=0;
        //recorre las filas de Jtable o tabla
            for (int i = 0; i < TablaDeFacturacion.getRowCount(); i++) {
                reglon3=Double.parseDouble( TablaDeFacturacion.getValueAt(i, 4).toString());
                factura2=factura2+reglon3; //acumula    
            }
            Factor=Double.parseDouble(txtPorcentaje.getText());
             if(Factor>0){                        
                Desc=((factura2*Factor)/100);
                txtDescuento.setText(String.valueOf(Desc));
                subtotal=(factura2-Desc);  
                txtSubTotalVenta.setText(String.valueOf(subtotal));
                txtIVA.setText(String.valueOf(subtotal*0.21));
                subtotal=subtotal*1.21;
                subtotal=Double.parseDouble(txtTotalFacturado.getText());
                DineroRecibido=Double.parseDouble(txtEfectivoRecibido.getText());
                DineroDeVuelto=(DineroRecibido-(subtotal));
                txtVueltoPorCompra.setText(String.valueOf(DineroDeVuelto));
                

        }else{
                 
            JOptionPane.showMessageDialog(null,"No hay Descuento");
        }
        }
    
public void actualizarStop(){
    int idproducto, cant,op;
    double PrecioNuevo=0, MontoNuevo=0;
    PreparedStatement ps=null;
    cantidad= Integer.parseInt(txtStopProducto.getText());
        try {
            for (int i = 0; i < TablaDeFacturacion.getRowCount(); i++) {
                idproducto=Integer.parseInt(TablaDeFacturacion.getValueAt(i, 0).toString());
                op=Integer.parseInt(TablaDeFacturacion.getValueAt(i, 2).toString());
                PrecioNuevo=Double.parseDouble(TablaDeFacturacion.getValueAt(i, 3).toString());
                cant=(cantidad-op);
                MontoNuevo=(cant*PrecioNuevo);
                ps = cn.prepareStatement("UPDATE inventarios SET cantI=?,precioI=?,montoI=? where codigoI=?");
                ps.setInt(1, cant);
                ps.setDouble(2, PrecioNuevo);
                ps.setDouble(3, MontoNuevo);
                ps.setDouble(4, idproducto);
                ps.executeUpdate();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    
    public void limpiarCajas(){
        txtNombreCliente.setText("");
        txtTemDNI.setText("");
        txtCodigoProducto.setText("");
        txtStopProducto.setText("");
        txtCodigoInsetar.setText("");
        txtProductoInsetar.setText("");
        SpinnerCantidadInsertar.setToolTipText("");
        txtPrecioInsertar.setText("");
        txtMontoFactura.setText("");
        txtPorcentaje.setText("");
        txtDescuento.setText("");
        txtSubTotalVenta.setText("");
        txtIVA.setText("");
        txtEfectivoRecibido.setText("");
        txtVueltoPorCompra.setText("");
        txtTotalFacturado.setText("");
        
    }
    public void EliminarFilaJtable(){
        //seleccionar filas para borrar
    if(TablaDeFacturacion.getSelectedRow()== -1 )
            return;
        /*Borror la fila
        */
            modelo.removeRow( TablaDeFacturacion.getSelectedRow() );    
    }
public void LimpiarTodosJtable(){
    //borra toda Jtable
    modelo.getDataVector().removeAllElements();
    //actualizar Jtable
    TablaDeFacturacion.updateUI();
}
    
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerCantidadInsertar;
    private javax.swing.JTable TablaDeFacturacion;
    private javax.swing.JButton btnBuscarCliente;
    public javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnDebito;
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnEliminarFilas;
    private javax.swing.JButton btnInsertarRenglonFacturacion;
    private javax.swing.JButton btnMasterCardCridito;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnOtroMedioPago;
    private javax.swing.JButton btnPagarFactura;
    private javax.swing.JButton btnSalirDeVentas;
    private javax.swing.JButton btnVisaCridito;
    private javax.swing.JLabel eqtFecha;
    private javax.swing.JLabel imagenLogo;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblNroRegistro;
    private javax.swing.JTextField txtCodigoInsetar;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtEfectivoRecibido;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtMontoFactura;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrecioInsertar;
    private javax.swing.JTextField txtProductoInsetar;
    public volatile javax.swing.JTextField txtStopProducto;
    private javax.swing.JTextField txtSubTotalVenta;
    private javax.swing.JTextField txtTemDNI;
    public javax.swing.JTextField txtTotalFacturado;
    private javax.swing.JTextField txtVueltoPorCompra;
    // End of variables declaration//GEN-END:variables

       
}
