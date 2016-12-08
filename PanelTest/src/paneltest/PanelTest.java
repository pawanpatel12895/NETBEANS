/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneltest;

/**
 *
 * @author pawan
 */
public class PanelTest extends javax.swing.JFrame {

    /**
     * Creates new form PanelTest
     */
    public PanelTest() {
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

        parentpanel = new javax.swing.JPanel();
        orangepanel = new javax.swing.JPanel();
        tobluepanel = new javax.swing.JButton();
        bluepanel = new javax.swing.JPanel();
        togreenpanel = new javax.swing.JButton();
        greenpanel = new javax.swing.JPanel();
        toorangepanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentpanel.setLayout(new java.awt.CardLayout());

        orangepanel.setBackground(new java.awt.Color(240, 151, 61));

        tobluepanel.setText("bluepanel");
        tobluepanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tobluepanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orangepanelLayout = new javax.swing.GroupLayout(orangepanel);
        orangepanel.setLayout(orangepanelLayout);
        orangepanelLayout.setHorizontalGroup(
            orangepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangepanelLayout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(tobluepanel)
                .addContainerGap())
        );
        orangepanelLayout.setVerticalGroup(
            orangepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangepanelLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(tobluepanel)
                .addContainerGap())
        );

        parentpanel.add(orangepanel, "card2");

        bluepanel.setBackground(new java.awt.Color(49, 154, 196));

        togreenpanel.setText("greenpanel");
        togreenpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togreenpanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bluepanelLayout = new javax.swing.GroupLayout(bluepanel);
        bluepanel.setLayout(bluepanelLayout);
        bluepanelLayout.setHorizontalGroup(
            bluepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bluepanelLayout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(togreenpanel)
                .addContainerGap())
        );
        bluepanelLayout.setVerticalGroup(
            bluepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bluepanelLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(togreenpanel)
                .addContainerGap())
        );

        parentpanel.add(bluepanel, "card3");

        greenpanel.setBackground(new java.awt.Color(19, 174, 21));

        toorangepanel.setText("orangepanel");
        toorangepanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toorangepanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout greenpanelLayout = new javax.swing.GroupLayout(greenpanel);
        greenpanel.setLayout(greenpanelLayout);
        greenpanelLayout.setHorizontalGroup(
            greenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greenpanelLayout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(toorangepanel)
                .addContainerGap())
        );
        greenpanelLayout.setVerticalGroup(
            greenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greenpanelLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(toorangepanel)
                .addContainerGap())
        );

        parentpanel.add(greenpanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toorangepanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toorangepanelActionPerformed
        parentpanel.removeAll();
        parentpanel.add(orangepanel);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_toorangepanelActionPerformed

    private void tobluepanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobluepanelActionPerformed
        // TODO add your handling code here:
        parentpanel.removeAll();
        parentpanel.add(bluepanel);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_tobluepanelActionPerformed

    private void togreenpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togreenpanelActionPerformed
        parentpanel.removeAll();
        parentpanel.add(greenpanel);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_togreenpanelActionPerformed

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
            java.util.logging.Logger.getLogger(PanelTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bluepanel;
    private javax.swing.JPanel greenpanel;
    private javax.swing.JPanel orangepanel;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JButton tobluepanel;
    private javax.swing.JButton togreenpanel;
    private javax.swing.JButton toorangepanel;
    // End of variables declaration//GEN-END:variables
}