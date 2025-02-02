

/*
 * Alexandra Elyze Villar
    FOPI01 - FA2.1: LE#3
 */

/**
 *
 * @author Antonette
 */

public class ColorFun extends javax.swing.JFrame {

    /**
     * Creates new form ColorFun
     */
    
    IColoring coloring;
    
    public ColorFun() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factory Pattern");
        setLocation(new java.awt.Point(800, 400));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Blue", "Orange", "Yellow", "Green", "Magenta", "Pink", "White", "Cyan", "Gray" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       if(jComboBox1.getSelectedIndex() == 0)
           coloring =new RedColor();
       else if(jComboBox1.getSelectedIndex() == 1)
           coloring =new BlueColor();
       else if(jComboBox1.getSelectedIndex() == 2)
           coloring =new OrangeColor();
       else if(jComboBox1.getSelectedIndex() == 3)
           coloring =new YellowColor();
       else if(jComboBox1.getSelectedIndex() == 4)
           coloring =new GreenColor();
       else if(jComboBox1.getSelectedIndex() == 5)
           coloring =new MagentaColor();
       else if(jComboBox1.getSelectedIndex() == 6)
           coloring =new PinkColor();
       else if(jComboBox1.getSelectedIndex() == 7)
           coloring =new WhiteColor();
       else if(jComboBox1.getSelectedIndex() == 8)
           coloring =new CyanColor();
       else if(jComboBox1.getSelectedIndex() == 9)
           coloring =new GrayColor();
       
       jPanel1.setBackground(coloring.getColor());
       jLabel1.setText(coloring.colorName());
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ColorFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorFun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorFun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
