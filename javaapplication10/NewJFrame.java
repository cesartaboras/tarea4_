/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javax.swing.Action;
import javax.swing.JLabel;

/**
 *
 * @author Home
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rb_1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rb_2 = new javax.swing.JRadioButton();
        rb_3 = new javax.swing.JRadioButton();
        cb_ver = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cb_fal = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_respuesta = new javax.swing.JLabel();
        lbl_respuesta2 = new javax.swing.JLabel();
        lbl_respuestascorrectas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_11 = new javax.swing.JRadioButton();
        rb_12 = new javax.swing.JRadioButton();
        rb_13 = new javax.swing.JRadioButton();
        lbl_respuesta3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rb_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_1MousePressed(evt);
            }
        });

        jLabel1.setText("Cuestionario");

        jLabel2.setText("1. TIPO : Seleccion multiple");

        jLabel3.setText("¿ Cuantas semanas tiene un año?");

        rb_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_2MousePressed(evt);
            }
        });

        rb_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_3MousePressed(evt);
            }
        });

        cb_ver.setText("V");
        cb_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cb_verMousePressed(evt);
            }
        });

        jLabel4.setText("2. TIPO: Verdadero o Falso");

        cb_fal.setText("F");
        cb_fal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cb_falMousePressed(evt);
            }
        });

        jLabel5.setText("¿ Noviembre tiene 30 dias?");

        jLabel6.setText("3. TIPO: Respuesta unica");

        lbl_respuesta.setText("Respuesta");
        lbl_respuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_respuestaMousePressed(evt);
            }
        });

        lbl_respuesta2.setText("Respuesta");

        lbl_respuestascorrectas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_respuestascorrectasMousePressed(evt);
            }
        });

        jLabel7.setText("40");

        jLabel8.setText("50");

        jLabel9.setText("52");

        jLabel10.setText("¿ Cuantos huesos tiene el cuerpo humano");

        rb_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_11MousePressed(evt);
            }
        });

        rb_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_12MousePressed(evt);
            }
        });

        rb_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_13MousePressed(evt);
            }
        });

        lbl_respuesta3.setText("Respuesta");

        jLabel11.setText("100");

        jLabel12.setText("206");

        jLabel13.setText("500");

        jLabel14.setText("Numero de Respuestas Correctas =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(lbl_respuestascorrectas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_1)
                                            .addComponent(rb_2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(94, 94, 94)
                                                    .addComponent(jLabel4))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel8))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cb_fal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cb_ver))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(33, 33, 33)
                                                .addComponent(lbl_respuesta)
                                                .addGap(239, 239, 239)
                                                .addComponent(lbl_respuesta2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)))
                                .addGap(0, 148, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_respuesta3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_respuestascorrectas)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_respuesta)
                    .addComponent(jLabel7)
                    .addComponent(lbl_respuesta2)
                    .addComponent(cb_ver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cb_fal)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_3)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbl_respuesta3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_11)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_12)
                                .addGap(7, 7, 7)
                                .addComponent(rb_13))
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_1MousePressed
        // TODO add your handling code here:
        lbl_respuesta.getText();
        
    }//GEN-LAST:event_rb_1MousePressed

    private void lbl_respuestaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_respuestaMousePressed
        Action a = null;
        
       
        rb_1.setAction(a);
        lbl_respuesta.setText("Incorrecto");
    }//GEN-LAST:event_lbl_respuestaMousePressed

    private void rb_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_2MousePressed
        // TODO add your handling code here:
         Action b = null;
        
       
        rb_2.setAction(b);
        lbl_respuesta.setText("Incorrecto");
    }//GEN-LAST:event_rb_2MousePressed

    private void rb_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_3MousePressed
        // TODO add your handling code here:
         Action a = null;
        rb_3.setAction(a);
        lbl_respuesta.setText("Correcto");
        lbl_respuestascorrectas.setText("1");
    }//GEN-LAST:event_rb_3MousePressed

    
    private void cb_verMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_verMousePressed
        // TODO add your handling code here:
        Action a = null;
        cb_ver.setAction(a);
        lbl_respuesta2.setText("Correcto");
        lbl_respuestascorrectas.setText("2");
    }//GEN-LAST:event_cb_verMousePressed

    private void cb_falMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_falMousePressed
        // TODO add your handling code here:
        Action a = null;
        cb_fal.setAction(a);
        lbl_respuesta2.setText("Incorrecto");
        
    }//GEN-LAST:event_cb_falMousePressed

    private void rb_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_11MousePressed
        // TODO add your handling code here:
        Action a = null;
        rb_11.setAction(a);
        lbl_respuesta3.setText("Incorrecto");
    }//GEN-LAST:event_rb_11MousePressed

    private void rb_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_12MousePressed
        // TODO add your handling code here:
        
        Action a = null;
        rb_12.setAction(a);
        lbl_respuesta3.setText("Correcto");
        lbl_respuestascorrectas.setText("3");
    }//GEN-LAST:event_rb_12MousePressed

    private void rb_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_13MousePressed
        // TODO add your handling code here:
        Action a = null;
        rb_13.setAction(a);
        lbl_respuesta3.setText("Incorrecto");
    }//GEN-LAST:event_rb_13MousePressed

    private void lbl_respuestascorrectasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_respuestascorrectasMousePressed
        
        
    }//GEN-LAST:event_lbl_respuestascorrectasMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_fal;
    private javax.swing.JCheckBox cb_ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_respuesta;
    private javax.swing.JLabel lbl_respuesta2;
    private javax.swing.JLabel lbl_respuesta3;
    private javax.swing.JLabel lbl_respuestascorrectas;
    private javax.swing.JRadioButton rb_1;
    private javax.swing.JRadioButton rb_11;
    private javax.swing.JRadioButton rb_12;
    private javax.swing.JRadioButton rb_13;
    private javax.swing.JRadioButton rb_2;
    private javax.swing.JRadioButton rb_3;
    // End of variables declaration//GEN-END:variables
}
