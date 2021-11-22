/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.combobox;

import javax.swing.JOptionPane;

/**
 *
 * @author fer_9
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

   String Item="";
   String arreglo[];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box_1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        box_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Axel", "Jairo", "Fernando" }));

        jLabel1.setText("Lista de Alumnos");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR ");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("AGREGAR NOMBRE DE ALUMNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nombres)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_eliminar))
                .addGap(13, 13, 13)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
       
        if (!validarentrada(txt_nombres.getText().trim())) 
        {
           JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos");
        }
        else
        {
            
        JOptionPane.showMessageDialog(rootPane, "Datos Correctos");
 
       }

    
        
        Item=txt_nombres.getText();
        box_1.addItem(Item);
       
        //for (int i = 0; i < arreglo.length; i++) {
           // box_1.addItem(Item);
        //}
       JOptionPane.showMessageDialog(null,"El Alumno Guardado es "+ Item);
       
      
    }//GEN-LAST:event_btn_guardarActionPerformed
 public static boolean validarentrada(String datos)
 {
    return datos.matches("[A-Z]*");
 }
 
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        box_1.removeItemAt(box_1.getSelectedIndex());
      //JOptionPane.showMessageDialog(null, box_1.getItem);
    //box_1.removeItemAt(0);
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
