
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xamse Daldoon
 */
public class vendorpay extends javax.swing.JFrame {

    /**
     * Creates new form vendorpay
     */
      ResultSet rs;
    PreparedStatement ps;
      Connection con = connection.dbcon();
    public vendorpay() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtvendorid = new javax.swing.JTextField();
        txtvendorname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdebt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dtp1 = new com.toedter.calendar.JDateChooser();
        txtpaid = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vendor ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vendor Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount Paid");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Debt Amount");

        txtdebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdebtMouseClicked(evt);
            }
        });
        txtdebt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdebtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Balance");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");

        txtpaid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpaidMouseClicked(evt);
            }
        });
        txtpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaidKeyTyped(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnedit.setText("...");
        btnedit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtvendorid)
                    .addComponent(txtvendorname)
                    .addComponent(txtaddress)
                    .addComponent(txtdebt)
                    .addComponent(dtp1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(txtpaid)
                    .addComponent(txtbalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtvendorid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtvendorname)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdebt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(dtp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENDOR PAY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdebtMouseClicked
        calcs();
    }//GEN-LAST:event_txtdebtMouseClicked

    private void txtdebtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdebtKeyTyped

    }//GEN-LAST:event_txtdebtKeyTyped

    private void txtpaidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpaidMouseClicked
        calcs();
    }//GEN-LAST:event_txtpaidMouseClicked

    private void txtpaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaidKeyTyped

    }//GEN-LAST:event_txtpaidKeyTyped

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        vendors1 a = new vendors1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         vendorspay frm= new vendorspay();
        try{
            String query = "SELECT debtamount FROM vendors WHERE debtamount <= ? ";
            ps=con.prepareStatement(query);
            ps.setString(1, txtpaid.getText());

            rs=ps.executeQuery();
            if(rs.next()){
                try{
                    String sql = "INSERT INTO vendorpay (vendorid,vendorname,address,debtamount,amountpaid,balance,dates) values(?,?,?,?,?,?,?)";
                    PreparedStatement  ps = con.prepareStatement(sql);

                    ps.setString(1, txtvendorid.getText());
                    ps.setString(2, txtvendorname.getText());
                    ps.setString(3, txtaddress.getText());
                    
                    ps.setString(4, txtdebt.getText());
                    ps.setString(5, txtpaid.getText());
                    ps.setString(6, txtbalance.getText());
                    SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
                    String dps = dateFormatss.format(this.dtp1.getDate());
                    ps.setString(7,dps);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "record successfull ");
                    qtupdate();
                    money();
                   // moneys();
                    qtupdatess();
                    qtupdates();
                    reset();
                    frm.showdata();
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
                //reset();
            }
            else{

                JOptionPane.showMessageDialog(null,"No Debt");
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        vendorspay frm= new vendorspay();
        try{

            String value1 = txtvendorid.getText();
            String value2 = txtvendorname.getText();
            String value4 = txtaddress.getText();
            String value5 = txtdebt.getText();
            String value6 = txtpaid.getText();
            String value7 = txtbalance.getText();
            SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
            String dps = dateFormatss.format(this.dtp1.getDate());
            //ps.setString(8,dps);

            String sql = "update vendorpay set vendorname='"+value2+"', address='"+value4+"', debtamount='"+value5+"', amountpaid='"+value6+"', balance='"+value7+"',dates='"+dps+"' where vendorid='"+value1+"'";
            PreparedStatement  ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "record successfull ");
            reset();
            frm.showdata();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
// vendorspay a = new vendorspay();
//a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed
private void reset(){
    txtvendorid.setText("");
txtvendorname.setText("");
txtaddress.setText("");
txtdebt.setText("");
txtpaid.setText("");
txtbalance.setText("");
}
    private void calcs(){
    int debt = Integer.parseInt(txtdebt.getText());
         int amount = Integer.parseInt(txtpaid.getText());
        int total = debt - amount ;
        String x = String.valueOf(total);
        txtbalance.setText(x);
}
                                
private void qtupdate(){
     try{
String query = "SELECT debtamount FROM vendors WHERE debtamount <= ? "; 
ps=con.prepareStatement(query);
ps.setString(1, txtpaid.getText());

rs=ps.executeQuery();
if(rs.next()){    
    try{
 
String value1 = txtvendorid.getText();
String value2 = txtpaid.getText();
String value4 = txtvendorname.getText();


String sql = "update vendors set debtamount=debtamount -'"+value2+"' where vendorname='"+value4+"' and vendorid='"+value1+"'";
 ps = con.prepareStatement(sql);
 ps.executeUpdate();
 //JOptionPane.showMessageDialog(null, "saved Successful ");
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
  
    }  
    } 
else{

JOptionPane.showMessageDialog(null,"Debt not enough");
} 
  
  
  
  
  } catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
  
    }                                       

    
 
    }  
private void qtupdates(){
        try{
String value1 = txtvendorid.getText();
            String value2 = txtpaid.getText();
String value4 = txtvendorname.getText();

String sql = "update vendorkhasnad set paid=paid +'"+value2+"' where vendorname='"+value4+"' and vendorid='"+value1+"'";
 ps = con.prepareStatement(sql);
 ps.executeUpdate();
 //JOptionPane.showMessageDialog(null, "saved Successful ");
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}
private void qtupdatess(){
        try{
String value2 = txtbalance.getText();
String value4 = txtvendorname.getText();
String value5 = txtvendorid.getText();

String sql = "update vendorkhasnad set debt=debt +'"+value2+"' where vendorname='"+value4+"'and vendorid='"+value5+"'";
 ps = con.prepareStatement(sql);
 ps.executeUpdate();
 //JOptionPane.showMessageDialog(null, "saved Successful ");
} catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}
private void money(){
    try{
String sql = "INSERT INTO vendorkhasnad (vendorid,vendorname,paid,debt,dates) values(?,?,?,?,?)";
      PreparedStatement  ps = con.prepareStatement(sql);

ps.setString(1, txtvendorid.getText());
ps.setString(2, txtvendorname.getText());
ps.setString(3, txtpaid.getText());
ps.setString(4, txtbalance.getText());
SimpleDateFormat dateFormatss = new SimpleDateFormat("YYY-MMM-DDD");
String dps = dateFormatss.format(this.dtp1.getDate());
ps.setString(5,dps);
 ps.executeUpdate();
//JOptionPane.showMessageDialog(null, "record successfull ");
//qtupdate();

  } catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
} 
}
private void moneys(){
    try{
String sql = "INSERT INTO vendorkhasnad (debt) values(?)";
      PreparedStatement  ps = con.prepareStatement(sql);


ps.setString(1, txtbalance.getText());
 ps.executeUpdate();
//JOptionPane.showMessageDialog(null, "record successfull ");
//qtupdate();

  } catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
} 
}
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
            java.util.logging.Logger.getLogger(vendorpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorpay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorpay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnedit;
    public javax.swing.JButton btnsave;
    public javax.swing.JButton btnupdate;
    public com.toedter.calendar.JDateChooser dtp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtaddress;
    public javax.swing.JTextField txtbalance;
    public javax.swing.JTextField txtdebt;
    public javax.swing.JTextField txtpaid;
    public javax.swing.JTextField txtvendorid;
    public javax.swing.JTextField txtvendorname;
    // End of variables declaration//GEN-END:variables
}