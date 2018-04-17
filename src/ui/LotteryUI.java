package ui;

import java.util.HashMap;
import java.util.Queue;
import javax.swing.JOptionPane;
import lotteryadmin.LotteryAdmin;
import lotteryadmin.LotteryLimitHitException;
import lotteryadmin.Ticket;


/**
 *
 * @author Amr
 */
public class LotteryUI extends javax.swing.JFrame {

    private final LotteryAdmin lottery = new LotteryAdmin();;
    
    /**
     * Creates new form LotteryUI
     */
    public LotteryUI() {
        initComponents();
        lblCurrentPot.setText("$" + lottery.getCurrentPot());
        lblTicketSoldCount.setText(String.valueOf(lottery.getSoldTicketTotal()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPurchase = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnPurchase = new javax.swing.JButton();
        tfNameInputWarning = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCurrentPot = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaPurchaseScreen = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaDrawScreen = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblTicketSoldCount = new javax.swing.JLabel();
        btnRunDraw = new javax.swing.JButton();
        btnPurchaseTicketOpener = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jdPurchase.setMinimumSize(new java.awt.Dimension(250, 250));
        jdPurchase.setResizable(false);
        jdPurchase.setSize(new java.awt.Dimension(500, 300));
        jdPurchase.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jdPurchaseWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jdPurchaseWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setText("Purchase Ticket");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setText("Customer Name");

        tfName.setBackground(new java.awt.Color(255, 204, 102));

        btnPurchase.setBackground(new java.awt.Color(255, 153, 51));
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        tfNameInputWarning.setEditable(false);
        tfNameInputWarning.setBackground(new java.awt.Color(255, 102, 0));
        tfNameInputWarning.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tfNameInputWarning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNameInputWarning.setText("[Name Must Be At Least 2 Characters]");
        tfNameInputWarning.setAutoscrolls(false);
        tfNameInputWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameInputWarningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfNameInputWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(tfNameInputWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdPurchaseLayout = new javax.swing.GroupLayout(jdPurchase.getContentPane());
        jdPurchase.getContentPane().setLayout(jdPurchaseLayout);
        jdPurchaseLayout.setHorizontalGroup(
            jdPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdPurchaseLayout.setVerticalGroup(
            jdPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdPurchaseLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("Lotto-Sample");

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Current Pot");

        lblCurrentPot.setBackground(new java.awt.Color(0, 0, 0));
        lblCurrentPot.setFont(new java.awt.Font("Arial Unicode MS", 0, 36)); // NOI18N
        lblCurrentPot.setForeground(new java.awt.Color(51, 153, 0));
        lblCurrentPot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentPot.setToolTipText("");
        lblCurrentPot.setBorder(new javax.swing.border.MatteBorder(null));
        lblCurrentPot.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblCurrentPot.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        jtaPurchaseScreen.setEditable(false);
        jtaPurchaseScreen.setBackground(new java.awt.Color(0, 0, 0));
        jtaPurchaseScreen.setColumns(20);
        jtaPurchaseScreen.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        jtaPurchaseScreen.setForeground(new java.awt.Color(204, 0, 204));
        jtaPurchaseScreen.setRows(2);
        jtaPurchaseScreen.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtaPurchaseScreen);
        jtaPurchaseScreen.getAccessibleContext().setAccessibleName("");

        jtaDrawScreen.setEditable(false);
        jtaDrawScreen.setBackground(new java.awt.Color(0, 0, 0));
        jtaDrawScreen.setColumns(20);
        jtaDrawScreen.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtaDrawScreen.setForeground(new java.awt.Color(153, 0, 0));
        jtaDrawScreen.setRows(5);
        jScrollPane3.setViewportView(jtaDrawScreen);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tickets Sold");

        lblTicketSoldCount.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTicketSoldCount.setForeground(new java.awt.Color(204, 102, 255));
        lblTicketSoldCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblCurrentPot, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(lblTicketSoldCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentPot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTicketSoldCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRunDraw.setText("RUN DRAW!");
        btnRunDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunDrawActionPerformed(evt);
            }
        });

        btnPurchaseTicketOpener.setBackground(new java.awt.Color(255, 255, 255));
        btnPurchaseTicketOpener.setText("PURCHASE TICKET");
        btnPurchaseTicketOpener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseTicketOpenerActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRunDraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchaseTicketOpener, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnPurchaseTicketOpener, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRunDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunDrawActionPerformed
        // Event handler for the Run Draw Button
        
        
        // If no tickets are sold yet this round
        if(lottery.getSoldTicketTotal() == 0){
            jtaPurchaseScreen.setText("No Tickets have been sold this round yet.");
            return;
        }
        
        // If no winners this round
        Queue<Ticket> winners = lottery.runDraw();
        if(winners == null || winners.isEmpty()){
            jtaDrawScreen.setText("No winner last round!");
            lottery.finalizeDraw(winners);
            lblTicketSoldCount.setText(String.valueOf(lottery.getSoldTicketTotal()));
            return;
        }
        // And finally if there are winners this round
        HashMap<Integer, String> drawOutome = lottery.finalizeDraw(winners);
        lblCurrentPot.setText("$" + lottery.getCurrentPot());
        jtaDrawScreen.setText(lottery.displayWinners(drawOutome));
        lblTicketSoldCount.setText(String.valueOf(lottery.getSoldTicketTotal()));
        
        
    }//GEN-LAST:event_btnRunDrawActionPerformed

    private void btnPurchaseTicketOpenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseTicketOpenerActionPerformed
        // Event Handler for Purchase Button
        
        if (lottery.getSoldTicketTotal() == 50){
            JOptionPane.showMessageDialog(this,
                "Tickets Sold Out For Round, please run a draw, before next purchase.",
                "Round End", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        jdPurchase.setEnabled(true);
        jdPurchase.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnPurchaseTicketOpenerActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // Event Handler for purchase button
        
        String input = tfName.getText();
        if(input.isEmpty() || input.length() < 2){
            btnPurchase.getDisabledIcon();
            tfNameInputWarning.setText("[Name Must Be At Least 2 Characters]");
            return;
        }
        tfNameInputWarning.setText("");
        try {
            Ticket sold = lottery.sale(input);
            this.setEnabled(true);
            tfName.setText("");
            lblTicketSoldCount.setText(String.valueOf(lottery.getSoldTicketTotal()));
            lblCurrentPot.setText("$" + lottery.getCurrentPot());
            jtaPurchaseScreen.setText("PURCHASE CONFIRMED\n" + sold.toString());
            jdPurchase.setVisible(false);
            jdPurchase.setEnabled(false);
        } catch (LotteryLimitHitException ex) {
            // Handled by UI Purchase Button
        }
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void jdPurchaseWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jdPurchaseWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdPurchaseWindowClosed

    private void jdPurchaseWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jdPurchaseWindowClosing
        // Event handling for closing the Purchaser tab pre-maturely
        this.setEnabled(true);
    }//GEN-LAST:event_jdPurchaseWindowClosing

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Event Handler for clear Button
        jtaPurchaseScreen.setText("");
        jtaDrawScreen.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tfNameInputWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameInputWarningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameInputWarningActionPerformed

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
            java.util.logging.Logger.getLogger(LotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LotteryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LotteryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnPurchaseTicketOpener;
    private javax.swing.JButton btnRunDraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jdPurchase;
    private javax.swing.JTextArea jtaDrawScreen;
    private javax.swing.JTextArea jtaPurchaseScreen;
    private javax.swing.JLabel lblCurrentPot;
    private javax.swing.JLabel lblTicketSoldCount;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNameInputWarning;
    // End of variables declaration//GEN-END:variables
}