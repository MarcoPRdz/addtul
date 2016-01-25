/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static domain.Color.cargarColores;
import domain.Corral;
import static domain.Corral.cargarCorrales;
import domain.ParametrosSP;
import static domain.Proveedor.cargarProveedores;
import static gui.EspecificacionesAnimal.animalDetalle;
import static gui.Splash.formatoDate;
import static gui.Splash.formatoDateTime;
import static gui.Desktop.rancho;
import static gui.Desktop.manejadorBD;
import static gui.Login.gs_mensaje;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVGAGS
 */
public class CapturaDatosCorral extends javax.swing.JFrame {

    /**
     * Creates new form DatosCorral
     */
    public CapturaDatosCorral(Corral Acorral) {
        initComponents();
        setLocationRelativeTo(null);
        corral = Acorral;
        tf_Temperatura.textFieldDouble();
        corralSelector.addArray(cargarCorrales());
        colorSelector.addArray(cargarColores());
        corralSelector.setSelectedItem(corral.nombre);
        
        proveedorSelector1.cargar();
        proveedorSelector1.valor_nuevo = true;
        
        leerDatosCorral();
        
         this.setTitle(this.getTitle() + " " + rancho.descripcion);
    }

    public void leerDatosCorral() {

    //    this.tf_Categoria.setText(corral.corralDatos.categoria);
        //   this.JDc_FechaEntrada.setDate(corral.corralDatos.fecha_entrada);
    /*    this.JDc_FechaNacimiento.setDate(corral.corralDatos.fecha_nacimiento);
        this.colorSelector.setSelectedItem(corral.corralDatos.color.descripcion);
        this.tf_Compra.setText(corral.corralDatos.compra);
        this.tf_GanadoAmedias.setText(corral.corralDatos.ganado_amedias);
        this.tf_NumeroLote.setText(corral.corralDatos.numero_lote);
        this.tf_Temperatura.setText(corral.corralDatos.porcentaje.toString());
        this.proveedorSelector1.setSelectedItem(corral.corralDatos.proveedor.descripcion);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_Categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_GanadoAmedias = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_Compra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        corralSelector = new abstractt.ComboBox();
        colorSelector = new abstractt.ComboBox();
        tf_Temperatura = new abstractt.TextField();
        JDc_FechaNacimiento = new abstractt.Calendar();
        tf_NumeroLote = new abstractt.TextField();
        proveedorSelector1 = new domain.ProveedorSelector();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos del Corral");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setBackground(new java.awt.Color(102, 204, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION DEL CORRAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Corral:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, 24));

        tf_Categoria.setEditable(false);
        tf_Categoria.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_Categoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Categoria.setEnabled(false);
        tf_Categoria.setFocusable(false);
        tf_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CategoriaActionPerformed(evt);
            }
        });
        jPanel4.add(tf_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Proveedor:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 130, 24));

        tf_GanadoAmedias.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tf_GanadoAmedias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_GanadoAmedias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 160, 24));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Rancho:");
        jLabel9.setToolTipText("");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 130, 24));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Sexo:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 24));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fecha de Compra:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 24));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Numero de Lote:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, 24));

        tf_Compra.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tf_Compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_Compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, 24));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Compra:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 24));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Porcentaje:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 24));

        corralSelector.setEnabled(false);
        corralSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corralSelectorActionPerformed(evt);
            }
        });
        jPanel4.add(corralSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 24));
        jPanel4.add(colorSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 24));

        tf_Temperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Temperatura.setText("0.00");
        jPanel4.add(tf_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 160, 24));
        jPanel4.add(JDc_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, 24));

        tf_NumeroLote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tf_NumeroLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, -1));
        jPanel4.add(proveedorSelector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 260));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 110, 30));

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CategoriaActionPerformed

    private void corralSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corralSelectorActionPerformed

    }//GEN-LAST:event_corralSelectorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        grabar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void crearProveedor() {
/*
        //String raza;
        //raza = razaSelector.getSelectedItem().toString();
        //Raza Nueva
        if (corral.corralDatos.proveedor.id_proveedor.equals("") && !corral.corralDatos.proveedor.descripcion.equals("")) {

            manejadorBD.parametrosSP = new ParametrosSP();

            manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.proveedor.descripcion, "varProveedor", "STRING", "IN");

            if (manejadorBD.ejecutarSP("{ call agregarProveedor(?) }") == 0) {

                 corral.corralDatos.proveedor.cargarPorDescripcion(this.proveedorSelector1.getSelectedItem().toString());
            } else {

                JOptionPane.showMessageDialog(this, "Error al Agregar el Nuevo Proveedor\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
            }

        }
        */
    }
    
    
    private void grabar() {
/*
        if (!corral.corralDatos.id_corral.equals("")) {
            //Actualizar
            actualizar();
        } else {
            //grabar
            insertar();
        }
        */
    }

    private boolean cargarDatosControles() {
/*
        corral.corralDatos.categoria = this.tf_Categoria.getText();
        corral.corralDatos.color.cargarPorDescripcion(colorSelector.getText());
        //corral.corralDatos.fecha_entrada = JDc_FechaEntrada.getCalendar().getTime();
        corral.corralDatos.ganado_amedias = tf_GanadoAmedias.getText();
        corral.corralDatos.fecha_nacimiento = JDc_FechaNacimiento.getCalendar().getTime();
        corral.corralDatos.numero_lote = tf_NumeroLote.getText();
        corral.corralDatos.compra = tf_Compra.getText();
        corral.corralDatos.porcentaje = Double.parseDouble(tf_Temperatura.getText());
        corral.corralDatos.proveedor.cargarPorDescripcion(this.proveedorSelector1.getSelectedItem().toString());
        
        

        if (corral.corralDatos.color.id_color == 0) {

            JOptionPane.showMessageDialog(this, "No ha seleccionado un valor de Sexo valido", gs_mensaje, JOptionPane.ERROR_MESSAGE);
            return false;
        }
*/
        return true;
    }

    private void actualizar() {

        //System.out.println("actualizar");
        if (!cargarDatosControles()) {

            return;
        }
        
        crearProveedor();

        manejadorBD.parametrosSP = new ParametrosSP();

        manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
      /*  manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.id_corral, "varIdCorral", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.categoria, "varCategoria", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.ganado_amedias, "varGanado_amedias", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.color.id_color.toString(), "varColor_arete", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(corral.corralDatos.fecha_nacimiento), "varFecha_nacimiento", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.numero_lote, "varNumero_lote", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.compra, "varCompra", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.porcentaje.toString(), "varPorcentaje", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.proveedor.id_proveedor, "varIdProveedor", "STRING", "IN");
        */
        if (manejadorBD.ejecutarSP("{ call actualizarCorralDatos(?,?,?,?,?,?,?,?,?,?) }") == 0) {

            JOptionPane.showMessageDialog(this, "Se Actualizaron los Datos del Corral Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);

         //   corral.corralDatos.cargarPorId(corral.id_corral);

        } else {

            JOptionPane.showMessageDialog(this, "Error al agregar Datos del Corral\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

    }

    private void insertar() {

        if (!cargarDatosControles()) {

            return;
        }

        crearProveedor();
        
        manejadorBD.parametrosSP = new ParametrosSP();

        manejadorBD.parametrosSP.agregarParametro(rancho.id_rancho, "varIdRancho", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.id_corral, "varIdCorral", "STRING", "IN");
     /*   manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.categoria, "varCategoria", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.ganado_amedias, "varGanado_amedias", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.color.id_color.toString(), "varColor_arete", "INT", "IN");
        manejadorBD.parametrosSP.agregarParametro(formatoDateTime.format(corral.corralDatos.fecha_nacimiento), "varFecha_nacimiento", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.numero_lote, "varNumero_lote", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.compra, "varCompra", "STRING", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.porcentaje.toString(), "varPorcentaje", "DOUBLE", "IN");
        manejadorBD.parametrosSP.agregarParametro(corral.corralDatos.proveedor.id_proveedor, "varIdProveedor", "STRING", "IN");
*/
        if (manejadorBD.ejecutarSP("{ call agregarCorralDatos(?,?,?,?,?,?,?,?,?,?) }") == 0) {

            JOptionPane.showMessageDialog(this, "Se agregaron los Datos del Corral Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);
          //  corral.corralDatos.cargarPorId(corral.id_corral);
        } else {

            JOptionPane.showMessageDialog(this, "Error al agregar Datos del Corral\n" + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }
    }

    private Corral corral;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Calendar JDc_FechaNacimiento;
    private abstractt.ComboBox colorSelector;
    private abstractt.ComboBox corralSelector;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private domain.ProveedorSelector proveedorSelector1;
    private javax.swing.JTextField tf_Categoria;
    private javax.swing.JTextField tf_Compra;
    private javax.swing.JTextField tf_GanadoAmedias;
    private abstractt.TextField tf_NumeroLote;
    private abstractt.TextField tf_Temperatura;
    // End of variables declaration//GEN-END:variables
}