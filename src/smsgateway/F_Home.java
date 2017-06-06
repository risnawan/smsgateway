/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author risnawan
 */
public class F_Home extends javax.swing.JFrame {

    /**
     * Creates new form F_Home
     */
    
    public F_Home() {
        initComponents();
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/send.png"));
                ImageIcon icon = new ImageIcon(gambar);
                lSend.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/send.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/history.png"));
                ImageIcon icon = new ImageIcon(gambar);
                lHistory.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/history.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/regis.png"));
                ImageIcon icon = new ImageIcon(gambar);
                lRegistrasi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/regis.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
        try {
                BufferedImage gambar = ImageIO.read(getClass().getResource("/smsgateway/image/setting.png"));
                ImageIcon icon = new ImageIcon(gambar);
                lKonfig.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/smsgateway/image/setting.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            } catch (Exception ex) {
                System.out.println("problem accessing file" );    
            }
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
        jLabel1 = new javax.swing.JLabel();
        lSend = new javax.swing.JLabel();
        lRegistrasi = new javax.swing.JLabel();
        lKonfig = new javax.swing.JLabel();
        lHistory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        lSend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSend.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSendMouseClicked(evt);
            }
        });

        lRegistrasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRegistrasi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lRegistrasiMouseClicked(evt);
            }
        });

        lKonfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lKonfig.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lKonfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lKonfigMouseClicked(evt);
            }
        });

        lHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lHistoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lKonfig, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lSend, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lSend, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lKonfig, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSendMouseClicked
        // TODO add your handling code here:
        new F_SendMessage().show();
        this.dispose();
    }//GEN-LAST:event_lSendMouseClicked

    private void lHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHistoryMouseClicked
        // TODO add your handling code here:
        new F_History().show();
        this.dispose();
    }//GEN-LAST:event_lHistoryMouseClicked

    private void lRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrasiMouseClicked
        // TODO add your handling code here:
        new F_Registrasi().show();
        this.dispose();
    }//GEN-LAST:event_lRegistrasiMouseClicked

    private void lKonfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lKonfigMouseClicked
        // TODO add your handling code here:
        new F_Konfigurasi().show();
        this.dispose();
    }//GEN-LAST:event_lKonfigMouseClicked

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
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lHistory;
    private javax.swing.JLabel lKonfig;
    private javax.swing.JLabel lRegistrasi;
    private javax.swing.JLabel lSend;
    // End of variables declaration//GEN-END:variables
}
