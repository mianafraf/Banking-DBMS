
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author waniya_mustafa
 */
public class cashDeposit extends javax.swing.JFrame {

    /**
     * Creates new form cashDeposit
     */
    public cashDeposit() {
        initComponents();
          ImageIcon background_img= new ImageIcon("/Users/waniya_mustafa/NetBeansProjects/DBMS_Project/src/DBMS-ProjectImages/Cash Deposit.jpg","");
          Image  img= background_img.getImage();
          Image temp_img=img.getScaledInstance(878, 537,Image.SCALE_SMOOTH);
           background_img=new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
                     backgrnd.setBounds(0, 0, 878,537);
                     this.add(backgrnd);
                     confirmDepositBtn.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmDepositBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        depositAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash Deposit");

        confirmDepositBtn.setBackground(new java.awt.Color(0, 153, 153));
        confirmDepositBtn.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        confirmDepositBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmDepositBtn.setText("Confirm");
        confirmDepositBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 121, 138), 3, true));
        confirmDepositBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmDepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDepositBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter the Amount to Deposit");

        depositAmount.setBackground(new java.awt.Color(204, 204, 204));
        depositAmount.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        depositAmount.setForeground(new java.awt.Color(0, 0, 0));
        depositAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        depositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(confirmDepositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(confirmDepositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmDepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDepositBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmDepositBtnActionPerformed

    private void depositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmDepositBtn;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}