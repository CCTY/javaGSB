/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquette;

import java.awt.Toolkit;
import java.awt.Cursor;

/**
 *
 * @author Poste8
 */
public class FenConnexion extends javax.swing.JFrame {

    public FenConnexion() {
        initComponents();
        complementGUI();
    }
    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit()
            .getImage(getClass()
            .getResource("/images/logoNetBeans.png")));
        setTitle("GSB FACTURATION");
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_Ecran = new javax.swing.JLabel();
        jLab_Nom = new javax.swing.JLabel();
        jLab_MDP = new javax.swing.JLabel();
        jLab_Parametres = new javax.swing.JLabel();
        jTxT_Nom = new javax.swing.JTextField();
        jBtn_Valider = new javax.swing.JButton();
        jBtn_Quitter = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_MiniFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Ecran.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLab_Ecran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/ecran.png"))); // NOI18N
        jLab_Ecran.setText("Connexion au programme");
        getContentPane().add(jLab_Ecran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLab_Nom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_Nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/utilisateur.png"))); // NOI18N
        jLab_Nom.setText("Nom\n");
        getContentPane().add(jLab_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLab_MDP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_MDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/key.png"))); // NOI18N
        jLab_MDP.setText("Mot de passe");
        jLab_MDP.setToolTipText("");
        jLab_MDP.setDoubleBuffered(true);
        getContentPane().add(jLab_MDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLab_Parametres.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLab_Parametres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/switch-on.png"))); // NOI18N
        jLab_Parametres.setText("Paramètres de connexion");
        getContentPane().add(jLab_Parametres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 259, -1, 20));

        jTxT_Nom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxT_Nom.setText("\n");
        getContentPane().add(jTxT_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, -1));

        jBtn_Valider.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBtn_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/valider.png"))); // NOI18N
        jBtn_Valider.setText("Valider");
        jBtn_Valider.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(jBtn_Valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jBtn_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/quitter.png"))); // NOI18N
        jBtn_Quitter.setText("Quitter");
        jBtn_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_QuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));

        jLabel_MiniFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.connection/ban.png"))); // NOI18N
        getContentPane().add(jLabel_MiniFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 299));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_QuitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_QuitterActionPerformed

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
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FenConnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Quitter;
    private javax.swing.JButton jBtn_Valider;
    private javax.swing.JLabel jLab_Ecran;
    private javax.swing.JLabel jLab_MDP;
    private javax.swing.JLabel jLab_Nom;
    private javax.swing.JLabel jLab_Parametres;
    private javax.swing.JLabel jLabel_MiniFond;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTxT_Nom;
    // End of variables declaration//GEN-END:variables

     //To change body of generated methods, choose Tools | Templates.
    }

