/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.myhashmap;

import java.util.HashMap;

/**
 *
 * @author jossu
 */
public class CapitalesHashMap extends javax.swing.JFrame {
    
HashMap<String,String> capitales = new HashMap();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CapitalesHashMap.class.getName());

    public CapitalesHashMap() {
        initComponents();
        capitales.put("Sonora", "Hermosillo");
        capitales.put("Sinaloa", "Culiacan");
        capitales.put("Chihuahua", "Chihuahua");
        capitales.put("Nuevo Leon", "Monterrey");
        capitales.put("Baja California", "Mexicali");
        capitales.put("Colima", "Manzanillo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCapital = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfEstado.addActionListener(this::tfEstadoActionPerformed);

        btnBuscar.setText("BUSCAR CAPITAL");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel2.setText("CAPITAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(tfEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCapital, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String estado = tfEstado.getText();
        String capital = capitales.get(estado);
        if(capital != null){
            lblCapital.setText(capital);
        }else{
            lblCapital.setText("capital no encontrada");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CapitalesHashMap().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCapital;
    private javax.swing.JTextField tfEstado;
    // End of variables declaration//GEN-END:variables
}
