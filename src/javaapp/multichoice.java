/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp;

/**
 *
 * @author sailo
 */
public class multichoice extends javax.swing.JFrame {
public static int multiSCORE = 0;
public static boolean Q1correct = false, Q2correct = false, Q3correct = false, Q4correct = false, Q5correct = false;
public static boolean B1s = false, C1s = false, D1s = false, B2s = false, A2s = false, D2s = false, A3s = false, C3s = false, D3s = false, B4s = false, A4s = false, D4s = false, B5s = false, C5s = false, D5s = false; 
    /**
     * Creates new form multiplication
     */
    public multichoice() {
        initComponents();
        setResizable(false);
        buttonGroup1.add(A1);
        buttonGroup1.add(B1);
        buttonGroup1.add(C1);
        buttonGroup1.add(D1);
        buttonGroup2.add(A2);
        buttonGroup2.add(B2);
        buttonGroup2.add(C2);
        buttonGroup2.add(D2); 
        buttonGroup3.add(A3);
        buttonGroup3.add(B3);
        buttonGroup3.add(C3);
        buttonGroup3.add(D3); 
        buttonGroup4.add(A4);
        buttonGroup4.add(B4);
        buttonGroup4.add(C4);
        buttonGroup4.add(D4); 
        buttonGroup5.add(A5);
        buttonGroup5.add(B5);
        buttonGroup5.add(C5);
        buttonGroup5.add(D5);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JRadioButton();
        D5 = new javax.swing.JRadioButton();
        C1 = new javax.swing.JRadioButton();
        A5 = new javax.swing.JRadioButton();
        D1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        B2 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        D2 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        C3 = new javax.swing.JRadioButton();
        D3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        B4 = new javax.swing.JRadioButton();
        C4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        D4 = new javax.swing.JRadioButton();
        A4 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        B5 = new javax.swing.JRadioButton();
        A1 = new javax.swing.JRadioButton();
        C5 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        nextbuttonMC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 240, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setText("b) The botanical garden");
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, -1));

        D5.setText("d) It represented the eternal suffering of the Filipino people");
        jPanel1.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 530, -1));

        C1.setText("c) The lamp of Maria Clara");
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 560, -1));

        A5.setText("a) It symbolized the broken justice system of the Philippines");
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 550, -1));

        D1.setText("d) The schoolhouse in San Diego");
        jPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 340, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 82, 75));
        jLabel4.setText("2. Why did Padre Salvi secretly despise Padre Damaso?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 417, -1));

        B2.setText("b) Salvi believed he should have been assigned to a higher position");
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 740, -1));

        C2.setText("c) Salvi was jealous of Damaso’s past relationship with Maria Clara’s mother");
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 810, -1));

        D2.setText("d) Salvi saw Damaso as a threat to his own control over San Diego");
        jPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 710, -1));

        A2.setText("a) Damaso was wealthier and more influential");
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 560, -1));

        B3.setText("b) The suffering of Filipino mothers under colonial rule");
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 690, -1));

        C3.setText("c) The indifference of the Spanish government towards education");
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 680, -1));

        D3.setText("d) The fragility of the elite class in times of crisis");
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 600, -1));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 82, 75));
        jLabel5.setText("4. Why did Elias refuse Crisostomo Ibarra’s offer to help him escape and start a new life?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 82, 75));
        jLabel1.setText("MULTIPLE CHOICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 25));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 82, 75));
        jLabel6.setText("3. What does Sisa’s descent into madness symbolize in the novel?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 442, -1));

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 82, 75));
        jLabel2.setText("Multiple Choices");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        B4.setText("b) He wanted to die for the revolution");
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 520, -1));

        C4.setText("c) He believed his bloodline was cursed and unworthy of a future");
        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 590, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 82, 75));
        jLabel3.setText("1. Which symbol in Noli Me Tangere represents the oppression and suffering of the Filipino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 724, -1));

        D4.setText("d) He feared he would betray Ibarra under torture");
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 570, -1));

        A4.setText("a) He no longer believed in Ibarra’s cause");
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 660, -1));

        A3.setText("a) The spiritual corruption of the clergy");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 650, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 82, 75));
        jLabel7.setText("5. What was the significance of the grave Ibarra visited at the beginning of the novel?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 577, -1));

        B5.setText("b) It foreshadowed Ibarra’s eventual fate as an outcast");
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 550, -1));

        A1.setText("a) The crocodile in the river");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 500, -1));

        C5.setText("c) It was a secret burial ground for those executed by the church");
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 550, -1));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 82, 75));
        jLabel8.setText("people under Spanish rule?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 724, -1));

        nextbuttonMC.setBackground(new java.awt.Color(108, 82, 75));
        nextbuttonMC.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        nextbuttonMC.setText("NEXT");
        nextbuttonMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonMCActionPerformed(evt);
            }
        });
        jPanel1.add(nextbuttonMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(788, 817));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void nextbuttonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonMCActionPerformed
        if (A1.isSelected()) {
            ++multiSCORE;
            Q1correct = true;
        } else if (B1.isSelected()) {
            B1s = true;
        } else if (C1.isSelected()) {
            C1s = true;
        } else if (D1.isSelected()) {
            D1s = true;
        }
        
        if (C2.isSelected()) {
            ++multiSCORE;
            Q2correct = true;
        } else if (A2.isSelected()) {
            A2s = true;
        } else if (B2.isSelected()) {
            B2s = true;
        } else if (D2.isSelected()) {
            D2s = true;
        }
        
        if (B3.isSelected()) {
            ++multiSCORE;
           Q3correct = true;
        } else if (A3.isSelected()) {
            A3s = true;
        } else if (C3.isSelected()) {
            C3s = true;
        } else if (D3.isSelected()) {
            D3s = true;
        }
        
        if (C4.isSelected()) {
            ++multiSCORE;
            Q4correct = true;
        } else if (A4.isSelected()) {
            A4s = true;
        } else if (B4.isSelected()) {
            B4s = true;
        } else if (D4.isSelected()) {
            D4s = true;
        }
        
        if (A5.isSelected()) {
            ++multiSCORE;
            Q5correct = true;
        } else if (C5.isSelected()) {
            C5s = true;
        } else if (B5.isSelected()) {
            B5s = true;
        } else if (D5.isSelected()) {
            D5s = true;
        }
        
        new multichoiceANSWERS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextbuttonMCActionPerformed

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
            java.util.logging.Logger.getLogger(multichoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(multichoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(multichoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(multichoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new multichoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JRadioButton A5;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JRadioButton B5;
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton C4;
    private javax.swing.JRadioButton C5;
    private javax.swing.JRadioButton D1;
    private javax.swing.JRadioButton D2;
    private javax.swing.JRadioButton D3;
    private javax.swing.JRadioButton D4;
    private javax.swing.JRadioButton D5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton nextbuttonMC;
    // End of variables declaration//GEN-END:variables
}
