/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp;



/**
 *
 * @author sailo
 */
public class identification extends javax.swing.JFrame {

    /**
     * Creates new form identification
     */
    public static int idenSCORE = 0;
    String idenKEY1 = "CRISOSTOMO IBARRA";
    String idenKEY2 = "SIMOUN";
    String idenKEY3 = "ELIAS";
    String idenKEY4 = "MARIA CLARA";
    String idenKEY5 = "PADRE DAMASO";
    
    public identification() {
        initComponents();
        setResizable(false);
        
        nextbuttonIDEN.setFocusPainted(false);    
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
        jLabel3 = new javax.swing.JLabel();
        idenQ1 = new javax.swing.JTextField();
        question1 = new javax.swing.JLabel();
        idenQ2 = new javax.swing.JTextField();
        question4 = new javax.swing.JLabel();
        idenQ3 = new javax.swing.JTextField();
        question2 = new javax.swing.JLabel();
        question3 = new javax.swing.JLabel();
        idenQ4 = new javax.swing.JTextField();
        question5 = new javax.swing.JLabel();
        idenQ5 = new javax.swing.JTextField();
        nextbuttonIDEN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 240, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 82, 75));
        jLabel1.setText("Your answers are case sensitive, type it in all CAPS.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, 30));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 82, 75));
        jLabel3.setText("IDENTIFICATION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        idenQ1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        idenQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenQ1ActionPerformed(evt);
            }
        });
        jPanel1.add(idenQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        question1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        question1.setForeground(new java.awt.Color(108, 82, 75));
        question1.setText("1. Who is the main protagonist in Noli Me Tangere?");
        jPanel1.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        idenQ2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        idenQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenQ2ActionPerformed(evt);
            }
        });
        jPanel1.add(idenQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, -1));

        question4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        question4.setForeground(new java.awt.Color(108, 82, 75));
        question4.setText("4. Who was Ibarra going to marry?");
        jPanel1.add(question4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        idenQ3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        idenQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenQ3ActionPerformed(evt);
            }
        });
        jPanel1.add(idenQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 340, -1));

        question2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        question2.setForeground(new java.awt.Color(108, 82, 75));
        question2.setText("2. Which character is a wealthy yet mysterious jeweler in El Filibusterismo?");
        jPanel1.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        question3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        question3.setForeground(new java.awt.Color(108, 82, 75));
        question3.setText("3. Who is the fugitive ally of Ibarra in Noli Me Tangere?");
        jPanel1.add(question3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        idenQ4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        idenQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenQ4ActionPerformed(evt);
            }
        });
        jPanel1.add(idenQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, -1));

        question5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        question5.setForeground(new java.awt.Color(108, 82, 75));
        question5.setText("5. Who is the arrogant and power hungry friar in Noli me Tangere?");
        jPanel1.add(question5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        idenQ5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        idenQ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idenQ5ActionPerformed(evt);
            }
        });
        jPanel1.add(idenQ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 340, -1));

        nextbuttonIDEN.setBackground(new java.awt.Color(108, 82, 75));
        nextbuttonIDEN.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        nextbuttonIDEN.setText("NEXT");
        nextbuttonIDEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonIDENActionPerformed(evt);
            }
        });
        jPanel1.add(nextbuttonIDEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(552, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonIDENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonIDENActionPerformed
        // TODO add your handling code here:
        String idenANS1 = idenQ1.getText();
        String idenANS2 = idenQ2.getText();
        String idenANS3 = idenQ3.getText();
        String idenANS4 = idenQ4.getText();
        String idenANS5 = idenQ5.getText();

        if (idenANS1.equals(idenKEY1))
            ++idenSCORE;
        if (idenANS2.equals(idenKEY2))
            ++idenSCORE;
        if (idenANS3.equals(idenKEY3))
            ++idenSCORE;
        if (idenANS4.equals(idenKEY4))
            ++idenSCORE;
        if (idenANS5.equals(idenKEY5))
            ++idenSCORE;
   
        System.out.println(idenSCORE); 
           
        correctidentification objA = new correctidentification();
        objA.setVisible(true);
        objA.NEIL1.setText(this.idenQ1.getText());
        objA.NEIL2.setText(this.idenQ2.getText());
        objA.NEIL3.setText(this.idenQ3.getText());
        objA.NEIL4.setText(this.idenQ4.getText());
        objA.NEIL5.setText(this.idenQ5.getText());
        this.dispose();
    }//GEN-LAST:event_nextbuttonIDENActionPerformed

    private void idenQ5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenQ5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenQ5ActionPerformed

    private void idenQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenQ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenQ4ActionPerformed

    private void idenQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenQ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenQ3ActionPerformed

    private void idenQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenQ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenQ2ActionPerformed

    private void idenQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idenQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idenQ1ActionPerformed

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
            java.util.logging.Logger.getLogger(identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new identification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField idenQ1;
    public static javax.swing.JTextField idenQ2;
    public static javax.swing.JTextField idenQ3;
    public static javax.swing.JTextField idenQ4;
    public static javax.swing.JTextField idenQ5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton nextbuttonIDEN;
    private javax.swing.JLabel question1;
    private javax.swing.JLabel question2;
    private javax.swing.JLabel question3;
    private javax.swing.JLabel question4;
    private javax.swing.JLabel question5;
    // End of variables declaration//GEN-END:variables
}
